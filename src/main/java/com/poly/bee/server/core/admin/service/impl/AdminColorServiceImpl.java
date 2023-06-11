package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateColorRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateColorRequest;
import com.poly.bee.server.core.admin.model.response.AdminColorRespone;
import com.poly.bee.server.core.admin.repository.AdminColorRepository;
import com.poly.bee.server.core.admin.service.AdminColorService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminColorServiceImpl implements AdminColorService {

    @Autowired
    private AdminColorRepository adminColorRepository;

    @Override
    public PageableObject<AdminColorRespone> getAllColor(final AdminColorRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminColorRespone> res = adminColorRepository.getAllColor(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Color addColor(AdminCreateColorRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("CO%04d", number);
        Color ca = new Color();
        ca.setCode(code);
        ca.setName(request.getName());
        adminColorRepository.save(ca);
        return ca;
    }

    @Override
    public Color updateColor(AdminUpdateColorRequest request, String id) {
        Optional<Color> ColorOptional = adminColorRepository.findById(id);
        ColorOptional.get().setName(request.getName());
        adminColorRepository.save(ColorOptional.get());
        return ColorOptional.get();
    }

    @Override
    public void deleteColor(String id) {
        Optional<Color> ColorOptional = adminColorRepository.findById(id);
        adminColorRepository.delete(ColorOptional.get());
    }

    @Override
    public Color getOne(String id) {
        Optional<Color> ColorOptional = adminColorRepository.findById(id);
        return ColorOptional.get();
    }

}
