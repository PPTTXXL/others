package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.RepertoryDao;
import com.chinatobacco.pojo.Repertory;
import com.chinatobacco.service.RepertoryService;
@Service
public class RepertoryServiceImpl implements RepertoryService {

	@Autowired
	private RepertoryDao repertoryDao;
	
	@Override
	public List<Repertory> selectAll() {
		List<Repertory> list=repertoryDao.selectAll();
		return list;
	}

	@Override
	public Repertory selectByComid(int comid) {
		Repertory repertory=repertoryDao.selectByComid(comid);
		return repertory;
	}

	@Override
	public boolean add(Repertory repertory) {
		return repertoryDao.add(repertory)>0?true: false;
	}

	@Override
	public boolean delete(int comid) {
		return repertoryDao.delete(comid)>0?true: false;
	}

	@Override
	public boolean update(Repertory repertory) {
		return repertoryDao.update(repertory)>0?true: false;
	}

}
