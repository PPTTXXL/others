package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.CommoditybagDao;
import com.chinatobacco.pojo.Commoditybag;
import com.chinatobacco.service.CommoditybagService;
@Service
public class CommoditybagServiceImpl implements CommoditybagService {

	@Autowired
	private CommoditybagDao commoditybagDao;
	
	@Override
	public List<Commoditybag> selectByIndet(int indentid) {
		List<Commoditybag> list = commoditybagDao.selectByIndet(indentid);
		return list;
	}

	@Override
	public boolean add(Commoditybag commoditybag) {
		
		return commoditybagDao.add(commoditybag)> 0 ? true : false;
	}

	@Override
	public boolean delete(int indentid) {
		return commoditybagDao.delete(indentid)> 0 ? true : false;
	}

	@Override
	public boolean update(Commoditybag commoditybag) {
		return commoditybagDao.update(commoditybag)> 0 ? true : false;
	}

}
