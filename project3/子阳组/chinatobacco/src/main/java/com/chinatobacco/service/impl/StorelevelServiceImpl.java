package com.chinatobacco.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.StorelevelDao;
import com.chinatobacco.pojo.Storelevel;
import com.chinatobacco.service.StorelevelService;

@Service
public class StorelevelServiceImpl implements StorelevelService {
	@Autowired
	private StorelevelDao storeleveDao;

	@Override
	public List<Storelevel> selectAll() {
		return storeleveDao.selectAll();
	}

	@Override
	public Storelevel selectOne(int lvid) {
		return storeleveDao.selectOne(lvid);
	}

	@Override
	public boolean add(Storelevel storelevel) {
		return storeleveDao.add(storelevel) > 0 ? true : false;
	}

	@Override
	public boolean delete(int lvid) {
		return false;
	}

	@Override
	public boolean update(Storelevel storelevel) {
		return storeleveDao.update(storelevel) > 0 ? true : false;
	}

}
