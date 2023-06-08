package com.poly.bee.server.core.common.base;

import com.poly.bee.server.infrastructure.session.ServerSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {
    @Autowired
    protected ServerSession session;
}
