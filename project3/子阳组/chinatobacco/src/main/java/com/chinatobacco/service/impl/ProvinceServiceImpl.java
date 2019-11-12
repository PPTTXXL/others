package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ProvinceDao;
import com.chinatobacco.pojo.Province;
import com.chinatobacco.service.ProvinceService;
@Service
public class ProvinceServiceImpl implements ProvinceService {
	
	@Autowired
	private ProvinceDao provinceDao;
	
	@Override
	public List<Province> findAll() {
		List<Province> list=provinceDao.findAll();
		return list;
	}

	@Override
	public Province findObject(String provinceID) {
		Province province=provinceDao.findObject(provinceID);
		return province;
	}

}
