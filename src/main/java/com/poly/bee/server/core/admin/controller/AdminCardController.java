package com.poly.bee.server.core.admin.controller;


import com.poly.bee.server.core.admin.service.AdminCardService;
import com.poly.bee.server.core.common.base.BaseController;
import com.poly.bee.server.core.common.base.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/card")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class AdminCardController extends BaseController {

    @Value("${app.UserId}")
    private String id;

    @Autowired
    private AdminCardService adminCardService;

    @PostMapping("")
    public ResponseObject addCard() {
        return new ResponseObject(adminCardService.addCard(id));
    }

}
