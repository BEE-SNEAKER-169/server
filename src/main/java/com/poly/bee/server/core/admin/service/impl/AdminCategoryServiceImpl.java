package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateCategoryRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateCategoryRequest;
import com.poly.bee.server.core.admin.model.response.AdminCategoryRespone;
import com.poly.bee.server.core.admin.repository.AdminCategoryRepository;
import com.poly.bee.server.core.admin.service.AdminCategoryService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Autowired
    private AdminCategoryRepository adminCategoryRepository;

    @Override
    public PageableObject<AdminCategoryRespone> getAllCategory(final AdminCategoryRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminCategoryRespone> res = adminCategoryRepository.getAllCategory(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Category addCategory(AdminCreateCategoryRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("CA%04d", number);
        Category ca = new Category();
        ca.setCode(code);
        ca.setName(request.getName());
        adminCategoryRepository.save(ca);
        return ca;
    }

    @Override
    public Category updateCategory(AdminUpdateCategoryRequest request, String id) {
        Optional<Category> categoryOptional = adminCategoryRepository.findById(id);
        categoryOptional.get().setName(request.getName());
        adminCategoryRepository.save(categoryOptional.get());
        return categoryOptional.get();
    }

    @Override
    public void deleteCategory(String id) {
        Optional<Category> categoryOptional = adminCategoryRepository.findById(id);
        adminCategoryRepository.delete(categoryOptional.get());
    }

    @Override
    public Category getOne(String id) {
        Optional<Category> categoryOptional = adminCategoryRepository.findById(id);
        return categoryOptional.get();
    }

}
