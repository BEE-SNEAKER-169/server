package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateProductRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateProductRequest;
import com.poly.bee.server.core.admin.model.response.AdminProductRespone;
import com.poly.bee.server.core.admin.repository.AdminProductRepository;
import com.poly.bee.server.core.admin.service.AdminProductService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminProductServiceImpl implements AdminProductService {

    @Autowired
    private AdminProductRepository adminProductRepository;

    @Override
    public PageableObject<AdminProductRespone> getAllProduct(final AdminProductRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminProductRespone> res = adminProductRepository.getAllProduct(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Product addProduct(AdminCreateProductRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("PR%04d", number);
        Product ca = new Product();
        ca.setCode(code);
        ca.setName(request.getName());
        adminProductRepository.save(ca);
        return ca;
    }

    @Override
    public Product updateProduct(AdminUpdateProductRequest request, String id) {
        Optional<Product> ProductOptional = adminProductRepository.findById(id);
        ProductOptional.get().setName(request.getName());
        adminProductRepository.save(ProductOptional.get());
        return ProductOptional.get();
    }

    @Override
    public void deleteProduct(String id) {
        Optional<Product> ProductOptional = adminProductRepository.findById(id);
        adminProductRepository.delete(ProductOptional.get());
    }

    @Override
    public Product getOne(String id) {
        Optional<Product> ProductOptional = adminProductRepository.findById(id);
        return ProductOptional.get();
    }

}
