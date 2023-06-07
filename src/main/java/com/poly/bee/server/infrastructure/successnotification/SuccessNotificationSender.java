package com.poly.bee.server.infrastructure.successnotification;

import org.springframework.stereotype.Component;

@Component
public class SuccessNotificationSender {


//    @Autowired
//    private SimpMessagingTemplate simpMessagingTemplate;
//
//    public void senderNotification(String message, StompHeaderAccessor headerAccessor) {
//        SuccessModel successModel = new SuccessModel(message);
//        String sessionId = headerAccessor.getSessionId();
//        simpMessagingTemplate.convertAndSend("/portal-articles/success/" + sessionId, successModel);
//    }
}