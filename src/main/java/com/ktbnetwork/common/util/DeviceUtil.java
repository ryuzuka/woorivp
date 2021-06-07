package com.ktbnetwork.common.util;

import javax.servlet.http.HttpServletRequest;

import com.ktbnetwork.common.session.SessionManager;

/**
 * <pre>
 * @FileName : DeviceUtil.java
 * @Date : 2019. 4. 10.
 * @author dnms5
 * @History : 
 * @Description : 접속된 디바이스를 구분하는 유틸리티
 * </pre>
 *
 *
 * Copyright (C) 2019 by Bluewaves All right reserved.
 *
 */
public class DeviceUtil {

	public static boolean isMobile() {
		
		HttpServletRequest request = SessionManager.getRequest();
		
		if(request != null) {
			
			String requestURL = request.getRequestURL().toString();
			
			if(requestURL.startsWith("http://m.ktbnetwork.com") || requestURL.startsWith("https://m.ktbnetwork.com")) {
				return true;
			} else {
				
				String userAgent = request.getHeader("user-agent");
			
				if(userAgent != null) {
					
					//boolean mobile1 = userAgent.matches(".*(iPhone|iPod|iPad|Android|Windows CE|BlackBerry|Symbian|Windows Phone|webOS|Opera Mini|Opera Mobi|POLARIS|IEMobile|lgtelecom|nokia|SonyEricsson).*");
					boolean mobile1 = userAgent.matches(".*(iPhone|iPod|Android|Windows CE|BlackBerry|Symbian|Windows Phone|webOS|Opera Mini|Opera Mobi|POLARIS|IEMobile|lgtelecom|nokia|SonyEricsson).*");
			        boolean mobile2 = userAgent.matches(".*(LG|SAMSUNG|Samsung).*");
			        
			        if(mobile1 || mobile2) {
			        	return true;
			        }
				}
			}
		}
	        
		return false;
    }

}
