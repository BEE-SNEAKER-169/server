package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateBrandRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateBrandRequest;
import com.poly.bee.server.core.admin.model.response.AdminBrandRespone;
import com.poly.bee.server.core.admin.repository.AdminBrandRepository;
import com.poly.bee.server.core.admin.service.AdminBrandService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminBrandServiceImpl implements AdminBrandService {

    @Autowired
    private AdminBrandRepository adminBrandRepository;

    @Override
    public PageableObject<AdminBrandRespone> getAllBrand(final AdminBrandRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminBrandRespone> res = adminBrandRepository.getAllBrand(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Brand addBrand(AdminCreateBrandRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("BR%04d", number);
        Brand ca = new Brand();
        ca.setCode(code);
        ca.setName(request.getName());
        adminBrandRepository.save(ca);
        return ca;
    }

    @Override
    public Brand updateBrand(AdminUpdateBrandRequest request, String id) {
        Optional<Brand> BrandOptional = adminBrandRepository.findById(id);
        BrandOptional.get().setName(request.getName());
        adminBrandRepository.save(BrandOptional.get());
        return BrandOptional.get();
    }

    @Override
    public void deleteBrand(String id) {
        Optional<Brand> BrandOptional = adminBrandRepository.findById(id);
        adminBrandRepository.delete(BrandOptional.get());
    }

    @Override
    public Brand getOne(String id) {
        Optional<Brand> BrandOptional = adminBrandRepository.findById(id);
        return BrandOptional.get();
    }

}
