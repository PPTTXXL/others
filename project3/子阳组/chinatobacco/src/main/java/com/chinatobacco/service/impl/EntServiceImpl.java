package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.EntDao;
import com.chinatobacco.pojo.Ent;
import com.chinatobacco.service.EntService;

@Service
public class EntServiceImpl implements EntService {
	@Autowired
	private EntDao entDao;

	@Override
	public List<Ent> selectAll() {
		List<Ent> list = entDao.selectAll();
		return list;
	}

	@Override
	public Ent selectOne(int entid) {
		Ent ent = entDao.selectOne(entid);
		return ent;
	}

	@Override
	public boolean add(Ent ent) {
		return entDao.add(ent) > 0 ? true : false;
	}

	@Override
	public boolean delete(int entid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Ent ent) {
		return entDao.update(ent) > 0 ? true : false;
	}

}
