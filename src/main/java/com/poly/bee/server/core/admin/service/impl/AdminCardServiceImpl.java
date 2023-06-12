package com.poly.bee.server.core.admin.service.impl;


import com.poly.bee.server.core.admin.repository.AdminAccountRepository;
import com.poly.bee.server.core.admin.repository.AdminCardRepository;
import com.poly.bee.server.core.admin.service.AdminCardService;
import com.poly.bee.server.entity.Account;
import com.poly.bee.server.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminCardServiceImpl implements AdminCardService {

    @Autowired
    private AdminCardRepository adminCardRepository;

    @Autowired
    private AdminAccountRepository adminAccountRepository;

    @Override
    public Card addCard(String id) {
        Account account = adminAccountRepository.findById(id).orElse(null);
        Card card = Card.builder()
                .account(account)
                .build();
        adminCardRepository.save(card);
        return card;
    }
}
