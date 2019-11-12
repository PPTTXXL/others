package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.CountyDao;
import com.chinatobacco.pojo.County;
import com.chinatobacco.service.CountyService;

@Service
public class CountyServiceImpl implements CountyService {
	@Autowired
	private CountyDao countyDao;

	@Override
	public List<County> findAreasByCid(String cityID) {
		List<County> list = countyDao.findAreasByCid(cityID);
		return list;
	}

	@Override
	public County findObject(String areaID) {
		County county = countyDao.findObject(areaID);
		return county;
	}

}
