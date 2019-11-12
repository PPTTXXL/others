package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.RoleDao;
import com.chinatobacco.pojo.Role;
import com.chinatobacco.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public List<Role> selectAll() {
		List<Role> list=roleDao.selectAll();
		return list;
	}

	@Override
	public Role selectOne(int roleid) {
		Role role=roleDao.selectOne(roleid);
		return role;
	}

	@Override
	public boolean add(Role role) {
		return roleDao.add(role)>0?true: false;
	}

	@Override
	public boolean delete(int roleid) {
		return roleDao.delete(roleid)>0?true: false;
	}

	@Override
	public boolean update(Role role) {
		return roleDao.update(role)>0?true: false;
	}

}
