package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateCategoryRequest;
import com.poly.bee.server.core.admin.service.AdminCategoryService;
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
@RequestMapping("/api/admin/category")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminCategoryController extends BaseController {

    @Autowired
    private AdminCategoryService adminCategoryService;

    @GetMapping("")
    public ResponseObject getAllCategoryByCensor(final AdminCategoryRequest request) {
        return new ResponseObject(adminCategoryService.getAllCategory(request));
    }

    @PostMapping("")
    public ResponseObject addCategory(@Valid @RequestBody AdminCreateCategoryRequest request) {
        return new ResponseObject(adminCategoryService.addCategory(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateCategory(@Valid @RequestBody AdminUpdateCategoryRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminCategoryService.updateCategory(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminCategoryService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateCategory(@PathVariable("id") String id) {
        adminCategoryService.deleteCategory(id);
    }


}
