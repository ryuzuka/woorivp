package com.ktbnetwork.common.session;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * <pre>
 * @FileName : SessionManager.java
 * @Date : 2019. 4. 10.
 * @author dnms5
 * @History : 
 * @Description : 세션 매니저
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
public class SessionManager {
	
	public static HttpServletRequest getRequest() {
		
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		
		if(servletRequestAttributes != null) {
			return servletRequestAttributes.getRequest();
		}
		
		return null;
	}
	
}
