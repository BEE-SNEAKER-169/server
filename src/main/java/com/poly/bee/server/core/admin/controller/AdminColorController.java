package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateColorRequest;
import com.poly.bee.server.core.admin.service.AdminColorService;
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
@RequestMapping("/api/admin/color")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminColorController extends BaseController {

    @Autowired
    private AdminColorService adminColorService;

    @GetMapping("")
    public ResponseObject getAllColor(final AdminColorRequest request) {
        return new ResponseObject(adminColorService.getAllColor(request));
    }

    @PostMapping("")
    public ResponseObject addColor(@Valid @RequestBody AdminCreateColorRequest request) {
        return new ResponseObject(adminColorService.addColor(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateColor(@Valid @RequestBody AdminUpdateColorRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminColorService.updateColor(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminColorService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateColor(@PathVariable("id") String id) {
        adminColorService.deleteColor(id);
    }


}
