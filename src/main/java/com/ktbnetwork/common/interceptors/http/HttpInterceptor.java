package com.ktbnetwork.common.interceptors.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * <pre>
 * @FileName : HttpInterceptor.java
 * @Date : 2019. 4. 10.
 * @author dnms5
 * @History : 
 * @Description : HTTPS 리다이렉트 인터셉터
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
public class HttpInterceptor extends HandlerInterceptorAdapter {
	
	private final Logger LOG = LoggerFactory.getLogger(HttpInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		LOG.debug("================================ HttpInterceptor BEGIN ================================");
		
		String requestURL = request.getRequestURL().toString();
		String queryString = request.getQueryString() == null ? "" : request.getQueryString();
		String servletPath = request.getServletPath() == null || request.getServletPath() == "" ? "/" : request.getServletPath();
		String serverName = request.getServerName();
		String serverPort = String.valueOf(request.getServerPort());
		
		if("80".equals(serverPort) || "443".equals(serverPort)) {
			serverPort = "";
		} else {
			serverPort = ":" + serverPort;
		}
		
		if(!serverName.equalsIgnoreCase("localhost")) {

			if(requestURL.toLowerCase().startsWith("http://www.ktbnetwork.com") || requestURL.toLowerCase().startsWith("http://m.ktbnetwork.com") || requestURL.toLowerCase().startsWith("http://ktbnetwork.com") || requestURL.toLowerCase().startsWith("https://ktbnetwork.com")) {
				
				serverName = "www.ktbnetwork.com";
				
				LOG.debug("================================ HttpInterceptor FOUND URL : "+requestURL+" ================================");
				
				if(queryString.equals("")) {
					LOG.debug("================================ HttpInterceptor Redirect to https://"+serverName+serverPort+servletPath+" ================================");
				} else {
					LOG.debug("================================ HttpInterceptor Redirect to https://"+serverName+serverPort+servletPath+"?"+queryString+" ================================");
				}
				
				LOG.debug("================================ HttpInterceptor END ================================");
				
				if(queryString.equals("")) {
					response.sendRedirect("https://"+serverName+serverPort+servletPath);
				} else {
					response.sendRedirect("https://"+serverName+serverPort+servletPath+"?"+queryString);
				}
				
				return false;
			}
	
		}
		
		LOG.debug("================================ HttpInterceptor END ================================");
		
		return true;
	}
}
