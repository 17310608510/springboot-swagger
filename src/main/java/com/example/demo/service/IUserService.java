package com.example.demo.service;

import com.example.demo.dto.GetByIdDTO;
import com.example.demo.vo.UserVO;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月17日 下午5:38:04 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
public interface IUserService {
	/**
	 * 根据id获取用户信息
	 * 
	 * @param dto
	 * @return
	 */
	public UserVO getUserById(GetByIdDTO dto);
}
