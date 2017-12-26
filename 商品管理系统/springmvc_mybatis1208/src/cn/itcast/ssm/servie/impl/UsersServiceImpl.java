package cn.itcast.ssm.servie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.CheckLoginMapper;
import cn.itcast.ssm.po.Users;
import cn.itcast.ssm.servie.UsersService;
@Service
public class UsersServiceImpl  implements UsersService{
	@Autowired
	private CheckLoginMapper checkLoginMapper;
	public Users CheckLogin(Users users) {
	  Users users2 =checkLoginMapper.CheckLogin(users);
		
		return users2;
	}
}
