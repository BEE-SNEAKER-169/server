package com.poly.bee.server.infrastructure.session;

import com.poly.bee.server.infrastructure.constant.SessionConstant;
import com.poly.bee.server.infrastructure.projection.SimpleEntityProj;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class ServerSessionImpl implements ServerSession {

    @Autowired
    private HttpSession session;

    @Override
    public String getUserId() {
        SimpleEntityProj account = (SimpleEntityProj) session.getAttribute(SessionConstant.USER);
        return account.getId();
    }
}
