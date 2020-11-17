package com.example.demo.util;

import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月17日 下午5:35:24 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Slf4j
public class HttpStatusCodeUtil {
	
	/**
	 * 设置http响应码
	 * 
	 * @param response
	 * @param statusCode
	 */
	public static void setCode(HttpServletResponse response, Integer statusCode) {
		try {
			response.setStatus(statusCode);
		} catch (Exception ex) {
			log.error("设置http响应码异常：" + ex.getMessage(), ex);
		}
	}
}
