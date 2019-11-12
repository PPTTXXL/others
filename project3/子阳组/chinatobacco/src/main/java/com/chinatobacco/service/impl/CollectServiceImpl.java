package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.CollectDao;
import com.chinatobacco.pojo.City;
import com.chinatobacco.pojo.Collect;
import com.chinatobacco.service.CollectService;

@Service
public class CollectServiceImpl implements CollectService {

	@Autowired
	private CollectDao collectDao;

	@Override
	public List<Collect> selectAll() {
		List<Collect> list = collectDao.selectAll();
		return list;
	}

	@Override
	public List<Collect> selectByStoreid(int storeid) {
		List<Collect> list = collectDao.selectByStoreid(storeid);
		return list;
	}

	@Override
	public List<Collect> selectQuery(Collect collect) {
		List<Collect> list = collectDao.selectQuery(collect);
		return list;
	}

	@Override
	public boolean add(Collect collect) {
		return collectDao.add(collect) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] collid) {
		return collectDao.delete(collid) > 0 ? true : false;
	}

	@Override
	public Collect selectOneByStoreid(int storeid, int comid) {
		return collectDao.selectOneByStoreid(storeid, comid);
	}

}
