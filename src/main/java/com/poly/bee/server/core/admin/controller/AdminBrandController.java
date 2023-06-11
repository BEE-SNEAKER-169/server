package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminCreateBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateBrandRequest;
import com.poly.bee.server.core.admin.service.AdminBrandService;
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
@RequestMapping("/api/admin/brand")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminBrandController extends BaseController {

    @Autowired
    private AdminBrandService adminBrandService;

    @GetMapping("")
    public ResponseObject getAllBrand(final AdminBrandRequest request) {
        return new ResponseObject(adminBrandService.getAllBrand(request));
    }

    @PostMapping("")
    public ResponseObject addBrand(@Valid @RequestBody AdminCreateBrandRequest request) {
        return new ResponseObject(adminBrandService.addBrand(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateBrand(@Valid @RequestBody AdminUpdateBrandRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminBrandService.updateBrand(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminBrandService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateBrand(@PathVariable("id") String id) {
        adminBrandService.deleteBrand(id);
    }


}
