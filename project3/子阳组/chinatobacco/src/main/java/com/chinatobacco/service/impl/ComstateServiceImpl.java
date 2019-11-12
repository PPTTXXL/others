package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ComstateDao;
import com.chinatobacco.pojo.Comstate;
import com.chinatobacco.service.ComstateService;

@Service
public class ComstateServiceImpl implements ComstateService {
	@Autowired
	private ComstateDao comstateDao;

	@Override
	public List<Comstate> selectAll() {
		List<Comstate> list = comstateDao.selectAll();
		return list;
	}

	@Override
	public Comstate selectOne(int stareid) {
		Comstate comstate = comstateDao.selectOne(stareid);
		return comstate;
	}

	@Override
	public boolean add(Comstate comstate) {
		return comstateDao.add(comstate) > 0 ? true : false;
	}

	@Override
	public boolean delete(int stareid) {

		return false;
	}

	@Override
	public boolean update(Comstate comstate) {

		return comstateDao.update(comstate) > 0 ? true : false;
	}

}
