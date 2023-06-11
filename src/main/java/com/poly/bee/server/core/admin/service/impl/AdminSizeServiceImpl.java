package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.model.request.AdminSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminCreateSizeRequest;
import com.poly.bee.server.core.admin.model.request.AdminUpdateSizeRequest;
import com.poly.bee.server.core.admin.model.response.AdminSizeRespone;
import com.poly.bee.server.core.admin.repository.AdminSizeRepository;
import com.poly.bee.server.core.admin.service.AdminSizeService;
import com.poly.bee.server.core.common.base.PageableObject;
import com.poly.bee.server.entity.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class AdminSizeServiceImpl implements AdminSizeService {

    @Autowired
    private AdminSizeRepository adminSizeRepository;

    @Override
    public PageableObject<AdminSizeRespone> getAllSize(final AdminSizeRequest request) {
        Pageable pageable = PageRequest.of(request.getPage(), request.getSize());
        Page<AdminSizeRespone> res = adminSizeRepository.getAllSize(pageable, request);
        return new PageableObject<>(res);
    }


    @Override
    public Size addSize(AdminCreateSizeRequest request) {
        Random random = new Random();
        int number = random.nextInt(10000);
        String code = String.format("SZ%04d", number);
        Size ca = new Size();
        ca.setCode(code);
        ca.setName(request.getName());
        adminSizeRepository.save(ca);
        return ca;
    }

    @Override
    public Size updateSize(AdminUpdateSizeRequest request, String id) {
        Optional<Size> SizeOptional = adminSizeRepository.findById(id);
        SizeOptional.get().setName(request.getName());
        adminSizeRepository.save(SizeOptional.get());
        return SizeOptional.get();
    }

    @Override
    public void deleteSize(String id) {
        Optional<Size> SizeOptional = adminSizeRepository.findById(id);
        adminSizeRepository.delete(SizeOptional.get());
    }

    @Override
    public Size getOne(String id) {
        Optional<Size> SizeOptional = adminSizeRepository.findById(id);
        return SizeOptional.get();
    }

}
