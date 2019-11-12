package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ComtypeDao;
import com.chinatobacco.pojo.Comtype;
import com.chinatobacco.service.ComtypeService;

@Service
public class ComtypeServiceImpl implements ComtypeService {
	@Autowired
	private ComtypeDao comtypeDao;

	@Override
	public List<Comtype> selectAll() {
		List<Comtype> list = comtypeDao.selectAll();
		return list;
	}

	@Override
	public Comtype selectOne(int comtypeid) {
		Comtype comtype = comtypeDao.selectOne(comtypeid);
		return comtype;
	}

	@Override
	public boolean add(Comtype comtype) {
		return comtypeDao.add(comtype) > 0 ? true : false;
	}

	@Override
	public boolean delete(int comtypeid) {

		return false;
	}

	@Override
	public boolean update(Comtype comtype) {
		return comtypeDao.update(comtype) > 0 ? true : false;
	}

}
