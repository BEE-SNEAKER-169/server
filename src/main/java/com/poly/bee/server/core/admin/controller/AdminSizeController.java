package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSizeRequest;
import com.poly.bee.server.core.admin.service.AdminSizeService;
import com.poly.bee.server.core.common.base.BaseController;
import com.poly.bee.server.core.common.base.ResponseObject;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/size")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminSizeController extends BaseController {

    @Autowired
    private AdminSizeService adminSizeService;

    @GetMapping("")
    public ResponseObject getAllSize(final AdminSizeRequest request) {
        return new ResponseObject(adminSizeService.getAllSize(request));
    }

    @PostMapping("")
    public ResponseObject addSize(@Valid @RequestBody AdminCreateSizeRequest request) {
        return new ResponseObject(adminSizeService.addSize(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateSize(@Valid @RequestBody AdminUpdateSizeRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminSizeService.updateSize(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminSizeService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateSize(@PathVariable("id") String id) {
        adminSizeService.deleteSize(id);
    }


}
