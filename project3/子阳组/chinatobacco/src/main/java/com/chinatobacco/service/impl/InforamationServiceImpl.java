package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.InforamationDao;
import com.chinatobacco.pojo.Inforamation;
import com.chinatobacco.service.InforamationService;

@Service
public class InforamationServiceImpl implements InforamationService {
	@Autowired
	private InforamationDao inforamationDao;

	@Override
	public List<Inforamation> selectAll() {
		List<Inforamation> list = inforamationDao.selectAll();
		return list;
	}

	@Override
	public List<Inforamation> selectEight() {
		List<Inforamation> list = inforamationDao.selectEight();
		return list;
	}

	@Override
	public Inforamation selectOne(int infoid) {
		Inforamation inforamation = inforamationDao.selectOne(infoid);
		return inforamation;
	}

	@Override
	public boolean add(Inforamation inforamation) {
		return inforamationDao.add(inforamation) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] infoid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Inforamation inforamation) {
		return inforamationDao.update(inforamation) > 0 ? true : false;
	}

}
