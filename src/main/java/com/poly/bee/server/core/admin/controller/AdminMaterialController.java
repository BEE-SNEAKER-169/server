package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminCreateMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateMaterialRequest;
import com.poly.bee.server.core.admin.service.AdminMaterialService;
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
@RequestMapping("/api/admin/material")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminMaterialController extends BaseController {

    @Autowired
    private AdminMaterialService adminMaterialService;

    @GetMapping("")
    public ResponseObject getAllMaterial(final AdminMaterialRequest request) {
        return new ResponseObject(adminMaterialService.getAllMaterial(request));
    }

    @PostMapping("")
    public ResponseObject addMaterial(@Valid @RequestBody AdminCreateMaterialRequest request) {
        return new ResponseObject(adminMaterialService.addMaterial(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateMaterial(@Valid @RequestBody AdminUpdateMaterialRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminMaterialService.updateMaterial(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminMaterialService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateMaterial(@PathVariable("id") String id) {
        adminMaterialService.deleteMaterial(id);
    }


}
