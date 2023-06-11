package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminShoesCollarRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateShoesCollarRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateShoesCollarRequest;
import com.poly.bee.server.core.admin.model.response.AdminShoesCollarRespone;
import com.poly.bee.server.core.admin.repository.AdminShoesCollarRepository;
import com.poly.bee.server.core.admin.service.AdminShoesCollarService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.ShoesCollar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminShoesCollarServiceImpl implements AdminShoesCollarService {

    @Autowired
    private AdminShoesCollarRepository adminShoesCollarRepository;

    @Override
    public PageableObject<AdminShoesCollarRespone> getAllShoesCollar(final AdminShoesCollarRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminShoesCollarRespone> res = adminShoesCollarRepository.getAllShoesCollar(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public ShoesCollar addShoesCollar(AdminCreateShoesCollarRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("SC%04d", number);
        ShoesCollar ca = new ShoesCollar();
        ca.setCode(code);
        ca.setName(request.getName());
        adminShoesCollarRepository.save(ca);
        return ca;
    }

    @Override
    public ShoesCollar updateShoesCollar(AdminUpdateShoesCollarRequest request, String id) {
        Optional<ShoesCollar> ShoesCollarOptional = adminShoesCollarRepository.findById(id);
        ShoesCollarOptional.get().setName(request.getName());
        adminShoesCollarRepository.save(ShoesCollarOptional.get());
        return ShoesCollarOptional.get();
    }

    @Override
    public void deleteShoesCollar(String id) {
        Optional<ShoesCollar> ShoesCollarOptional = adminShoesCollarRepository.findById(id);
        adminShoesCollarRepository.delete(ShoesCollarOptional.get());
    }

    @Override
    public ShoesCollar getOne(String id) {
        Optional<ShoesCollar> ShoesCollarOptional = adminShoesCollarRepository.findById(id);
        return ShoesCollarOptional.get();
    }

}
