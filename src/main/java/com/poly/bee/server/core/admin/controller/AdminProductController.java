package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.model.request.AdminProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateProductRequest;
import com.poly.bee.server.core.admin.service.AdminProductService;
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
@RequestMapping("/api/admin/product")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminProductController extends BaseController {

    @Autowired
    private AdminProductService adminProductService;

    @GetMapping("")
    public ResponseObject getAllProduct(final AdminProductRequest request) {
        return new ResponseObject(adminProductService.getAllProduct(request));
    }

    @PostMapping("")
    public ResponseObject addProduct(@Valid @RequestBody AdminCreateProductRequest request) {
        return new ResponseObject(adminProductService.addProduct(request));
    }

    @PutMapping("/{id}")
    public ResponseObject updateProduct(@Valid @RequestBody AdminUpdateProductRequest request, @PathVariable("id") String id) {
        return new ResponseObject(adminProductService.updateProduct(request, id));
    }

    @GetMapping("/{id}")
    public ResponseObject getOne(@PathVariable("id") String id) {
        return new ResponseObject(adminProductService.getOne(id));
    }

    @DeleteMapping("/{id}")
    public void updateProduct(@PathVariable("id") String id) {
        adminProductService.deleteProduct(id);
    }


}
