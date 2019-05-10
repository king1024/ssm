package com.king.ssm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.king.ssm.datasource.DataSourceContextHolder;
import com.king.ssm.datasource.DataSourceType;
import com.king.ssm.mapper.HerosMapper;
import com.king.ssm.mapper.UserInfoMapper;
import com.king.ssm.model.Heros;
import com.king.ssm.model.UserInfo;

@Service
public class TestService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@Autowired
	private HerosMapper herosMapper;

	public List<UserInfo> getUsers(UserInfo users){
		DataSourceContextHolder.setDbType(DataSourceType.ONE);
		List<UserInfo> list=userInfoMapper.getUsers(users);
		for (UserInfo userInfo : list) {
			System.out.println(userInfo);
		}
		return list;
	}
	
	public List<Heros> getHeros(){
		DataSourceContextHolder.setDbType(DataSourceType.TWO);
		List<Heros> heros = herosMapper.getHeros();
		for (Heros heros2 : heros) {
			System.out.println(heros2);
		}
		return heros;
	}

}
