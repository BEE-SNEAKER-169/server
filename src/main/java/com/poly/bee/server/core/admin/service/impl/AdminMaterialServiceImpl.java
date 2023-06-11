package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminCreateMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminMaterialRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateMaterialRequest;
import com.poly.bee.server.core.admin.model.response.AdminMaterialRespone;
import com.poly.bee.server.core.admin.repository.AdminMaterialRepository;
import com.poly.bee.server.core.admin.service.AdminMaterialService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminMaterialServiceImpl implements AdminMaterialService {

    @Autowired
    private AdminMaterialRepository adminMaterialRepository;

    @Override
    public PageableObject<AdminMaterialRespone> getAllMaterial(final AdminMaterialRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminMaterialRespone> res = adminMaterialRepository.getAllMaterial(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Material addMaterial(AdminCreateMaterialRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("MA%04d", number);
        Material ca = new Material();
        ca.setCode(code);
        ca.setName(request.getName());
        adminMaterialRepository.save(ca);
        return ca;
    }

    @Override
    public Material updateMaterial(AdminUpdateMaterialRequest request, String id) {
        Optional<Material> MaterialOptional = adminMaterialRepository.findById(id);
        MaterialOptional.get().setName(request.getName());
        adminMaterialRepository.save(MaterialOptional.get());
        return MaterialOptional.get();
    }

    @Override
    public void deleteMaterial(String id) {
        Optional<Material> MaterialOptional = adminMaterialRepository.findById(id);
        adminMaterialRepository.delete(MaterialOptional.get());
    }

    @Override
    public Material getOne(String id) {
        Optional<Material> MaterialOptional = adminMaterialRepository.findById(id);
        return MaterialOptional.get();
    }

}
