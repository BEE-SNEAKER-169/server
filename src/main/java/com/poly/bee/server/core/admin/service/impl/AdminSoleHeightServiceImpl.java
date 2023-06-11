package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSoleHeightRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSoleHeightRequest;
import com.poly.bee.server.core.admin.model.response.AdminSoleHeightRespone;
import com.poly.bee.server.core.admin.repository.AdminSoleHeightRepository;
import com.poly.bee.server.core.admin.service.AdminSoleHeightService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.SoleHeight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminSoleHeightServiceImpl implements AdminSoleHeightService {

    @Autowired
    private AdminSoleHeightRepository adminSoleHeightRepository;

    @Override
    public PageableObject<AdminSoleHeightRespone> getAllSoleHeight(final AdminSoleHeightRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminSoleHeightRespone> res = adminSoleHeightRepository.getAllSoleHeight(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public SoleHeight addSoleHeight(AdminCreateSoleHeightRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("SH%04d", number);
        SoleHeight ca = new SoleHeight();
        ca.setCode(code);
        ca.setName(request.getName());
        adminSoleHeightRepository.save(ca);
        return ca;
    }

    @Override
    public SoleHeight updateSoleHeight(AdminUpdateSoleHeightRequest request, String id) {
        Optional<SoleHeight> SoleHeightOptional = adminSoleHeightRepository.findById(id);
        SoleHeightOptional.get().setName(request.getName());
        adminSoleHeightRepository.save(SoleHeightOptional.get());
        return SoleHeightOptional.get();
    }

    @Override
    public void deleteSoleHeight(String id) {
        Optional<SoleHeight> SoleHeightOptional = adminSoleHeightRepository.findById(id);
        adminSoleHeightRepository.delete(SoleHeightOptional.get());
    }

    @Override
    public SoleHeight getOne(String id) {
        Optional<SoleHeight> SoleHeightOptional = adminSoleHeightRepository.findById(id);
        return SoleHeightOptional.get();
    }

}
