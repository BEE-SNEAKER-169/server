package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSoleHeightRequest;
import com.poly.bee.server.core.admin.service.AdminSoleHeightService;
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
@RequestMapping("/api/admin/sole-height")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminSoleHeightController extends BaseController {

    @Autowired
    private AdminSoleHeightService adminSoleHeightService;

    @GetMapping("")
    public ResponseObject getAllSoleHeight(final AdminSoleHeightRequest request) {
        return new ResponseObject(adminSoleHeightService.getAllSoleHeight(request));
    }

    @PostMapping("")
    public ResponseObject addSoleHeight(@Valid @RequestBody AdminCreateSoleHeightRequest request) {
        return new ResponseObject(adminSoleHeightService.addSoleHeight(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateSoleHeight(@Valid @RequestBody AdminUpdateSoleHeightRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminSoleHeightService.updateSoleHeight(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminSoleHeightService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateSoleHeight(@PathVariable("id") String id) {
        adminSoleHeightService.deleteSoleHeight(id);
    }


}
