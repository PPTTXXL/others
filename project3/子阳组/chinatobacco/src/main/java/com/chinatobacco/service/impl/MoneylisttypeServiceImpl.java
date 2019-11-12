package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.MoneylisttypeDao;
import com.chinatobacco.pojo.Moneylisttype;
import com.chinatobacco.service.MoneylisttypeService;
@Service
public class MoneylisttypeServiceImpl implements MoneylisttypeService {

	@Autowired
	private MoneylisttypeDao moneylisttypeDao;
	
	@Override
	public Moneylisttype selectOne(int id) {
		Moneylisttype moneylisttype=moneylisttypeDao.selectOne(id);
		return moneylisttype;
	}

	@Override
	public List<Moneylisttype> selectAll() {
		List<Moneylisttype> list=moneylisttypeDao.selectAll();
		return list;
	}

	@Override
	public boolean add(Moneylisttype moneylisttype) {
		return moneylisttypeDao.add(moneylisttype)>0?true: false;
	}

	@Override
	public boolean delete(int id) {
		return moneylisttypeDao.delete(id)>0?true: false;
	}

	@Override
	public boolean update(Moneylisttype moneylisttype) {
		return moneylisttypeDao.update(moneylisttype)>0?true: false;
	}

}
