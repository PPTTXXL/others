package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.IndentstateDao;
import com.chinatobacco.pojo.Indentstate;
import com.chinatobacco.service.IndentstateService;

@Service
public class IndentstateServiceImpl implements IndentstateService {
	@Autowired
	private IndentstateDao indentstateDao;

	@Override
	public List<Indentstate> selectAll() {
		List<Indentstate> list = indentstateDao.selectAll();
		return list;
	}

	@Override
	public Indentstate selectOne(int stateid) {
		Indentstate indentstate = indentstateDao.selectOne(stateid);
		return indentstate;
	}

	@Override
	public boolean add(Indentstate indentstate) {
		return indentstateDao.add(indentstate) > 0 ? true : false;
	}

	@Override
	public boolean delete(int stateid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Indentstate indentstate) {
		return indentstateDao.update(indentstate) > 0 ? true : false;
	}

}
