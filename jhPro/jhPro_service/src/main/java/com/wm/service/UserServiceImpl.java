package com.wm.service;


import com.wm.bean.User;
import com.wm.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    UserMapper um;
	
	@Override
	public User getUserBYId(int uid) {
		// TODO Auto-generated method stub
		return um.getByUid(uid);
	}

}
