package com.chinatobacco.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.MoneylistDao;
import com.chinatobacco.pojo.Moneylist;
import com.chinatobacco.service.MoneylistService;

@Service
public class MoneylistServiceImpl implements MoneylistService {

	@Autowired
	private MoneylistDao moneylistDao;
	
	@Override
	public List<Moneylist> selectAll() {
		List<Moneylist> list =moneylistDao.selectAll();
		return list;
	}

	@Override
	public List<Moneylist> selectByType(int id) {
		List<Moneylist>list=moneylistDao.selectByType(id);
		return list;
	}

	@Override
	public List<Moneylist> selectByDate(Date date) {
		List<Moneylist> list=moneylistDao.selectByDate(date);
		return list;
	}

	@Override
	public List<Moneylist> selectQuery(Moneylist moneylist) {
		List<Moneylist> list=moneylistDao.selectQuery(moneylist);
		return list;
	}

	@Override
	public List<Moneylist> selectByDirection(String direction) {
		List<Moneylist> list=moneylistDao.selectByDirection(direction);
		return list;
	}

	@Override
	public boolean add(Moneylist moneylist) {
		return moneylistDao.add(moneylist)>0?true: false;
	}

	@Override
	public boolean delete(int mlid) {
		return moneylistDao.delete(mlid)>0?true: false;
	}

}
