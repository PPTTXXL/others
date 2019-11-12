package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.CityDao;
import com.chinatobacco.pojo.Approvalstate;
import com.chinatobacco.pojo.City;
import com.chinatobacco.service.CityServcice;
@Service
public class CityServiceImpl implements CityServcice {
@Autowired
private CityDao cityDao;
	@Override
	public List<City> selectAll(String provinceId) {
		List<City> list = cityDao.selectAll(provinceId);
		return list;
	}

	@Override
	public City selectOne(String cityId) {
		City city = cityDao.selectOne(cityId);
		return city;
	}

}
