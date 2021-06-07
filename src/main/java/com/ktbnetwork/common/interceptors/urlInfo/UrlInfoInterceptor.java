package com.ktbnetwork.common.interceptors.urlInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ktbnetwork.common.util.DeviceUtil;

/**
 * <pre>
 * @FileName : UrlInfoInterceptor.java
 * @Date : 2019. 4. 10.
 * @author dnms5
 * @History : 
 * @Description : URL 정보 인터셉터(모바일 전환 포함)
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
public class UrlInfoInterceptor extends HandlerInterceptorAdapter {

	private final Logger LOG = LoggerFactory.getLogger(UrlInfoInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		LOG.debug("================================ UrlInfoInterceptor BEGIN ================================");
		
		boolean isMobile = DeviceUtil.isMobile();
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
		
		//if(isMobile && requestURL.startsWith("https://www.ktbnetwork.com")) {
		if(isMobile && requestURL.startsWith("http://www.ktbnetwork.com")) {
			
			serverName = "m.ktbnetwork.com";
				
			LOG.debug("================================ UrlInfoInterceptor FOUND URL : "+requestURL+" ================================");
			
			if(queryString.equals("")) {
				LOG.debug("================================ UrlInfoInterceptor Redirect to https://"+serverName+serverPort+servletPath+" ================================");
			} else {
				LOG.debug("================================ UrlInfoInterceptor Redirect to https://"+serverName+serverPort+servletPath+"?"+queryString+" ================================");
			}
			
			LOG.debug("================================ UrlInfoInterceptor END ================================");
			
			if(queryString.equals("")) {
				//response.sendRedirect("https://"+serverName+serverPort+servletPath);
				response.sendRedirect("http://"+serverName+serverPort+servletPath);
			} else {
				//response.sendRedirect("https://"+serverName+serverPort+servletPath+"?"+queryString);
				response.sendRedirect("http://"+serverName+serverPort+servletPath+"?"+queryString);
			}
			
			return false;
		}
		
		
		LOG.debug("================================ UrlInfoInterceptor END ================================");
		
		return true;
	}
}
