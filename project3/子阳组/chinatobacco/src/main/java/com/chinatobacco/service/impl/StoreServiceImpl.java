package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.StoreDao;
import com.chinatobacco.pojo.Store;
import com.chinatobacco.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDao storeDao;

	@Override
	public List<Store> selectAll() {
		return storeDao.selectAll();
	}

	@Override
	public List<Store> selectByLv(int lvid) {
		return storeDao.selectByLv(lvid);
	}

	@Override
	public List<Store> selectByName(String storename) {
		return storeDao.selectByName(storename);
	}

	@Override
	public boolean add(Store store) {
		return storeDao.add(store) > 0 ? true : false;
	}

	@Override
	public boolean delete(int storeid) {
		return false;
	}

	@Override
	public boolean update(Store store) {
		return storeDao.update(store) > 0 ? true : false;
	}

	@Override
	public Store selectByPass(int storeid, String password) {
		return storeDao.selectByPass(storeid, password);
	}

	@Override
	public Store selectOne(int storeid) {
		return storeDao.selectOne(storeid);
	}

}
