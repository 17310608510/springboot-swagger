package com.example.demo.util;

import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月17日 下午5:16:57 
 * @version 1.0 
 * @parameter 
 * @since 基类
 * @return 
 */
public class BaseController {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public JsonResult getJsonResult(Object model,BindingResult result) {
		if(result.hasErrors()) {
			StringBuilder stringBuilder = new StringBuilder();
			List<ObjectError> allErrors = result.getAllErrors();
		    for(ObjectError objectError : allErrors) {
		    	String defaultMessage = objectError.getDefaultMessage();
		    	//验证失败时提示内容一起拼接返回
		    	stringBuilder.append(defaultMessage).append(";");
		    }
		
		
		}
		
		return null;
	}
	
}
