package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ApprovalstateDao;
import com.chinatobacco.dao.InforamationDao;
import com.chinatobacco.dao.UserDao;
import com.chinatobacco.pojo.Approvalstate;
import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.pojo.User;
import com.chinatobacco.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	private ApprovalstateDao approvalstateDao;
	private InforamationDao intoramationDao;

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

	@Override
	public List<User> selectByRole(int roleid) {
		return userDao.selectByRole(roleid);
	}

	@Override
	public List<User> selectByName(String uname) {
		return userDao.selectByName(uname);
	}

	@Override
	public List<User> selectQuery(User user) {
		return userDao.selectQuery(user);
	}

	@Override
	public User selectById(int uid) {
		return userDao.selectById(uid);
	}

	@Override
	public User selectByPass(int uid, String password) {
		return userDao.selectByPass(uid, password);
	}

	@Override
	public boolean add(User user) {
		return userDao.add(user) > 0 ? true : false;
	}

	@Override
	public boolean delete(int uid) {
		return false;
	}

	@Override
	public boolean update(User user) {
		return userDao.update(user) > 0 ? true : false;
	}

}
