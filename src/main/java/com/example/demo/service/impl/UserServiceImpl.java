package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.GetByIdDTO;
import com.example.demo.service.IUserService;
import com.example.demo.vo.UserVO;

import lombok.extern.slf4j.Slf4j;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月17日 下午5:39:07 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@Service
@Slf4j
public class UserServiceImpl implements IUserService{
	@Override
	public UserVO getUserById(GetByIdDTO dto) {
		// 模拟数据
		UserVO obj = new UserVO();
		obj.setUserId(dto.getId());
		obj.setNickName("Minbo");
		obj.setBlogUrl("https://hemin.blog.csdn.net/");
		obj.setWechat("hemin_it");

		log.info("获取成功，dto={}，返回数据obj={}", JSON.toJSONString(dto), JSON.toJSONString(obj));
		return obj;
	}
}
