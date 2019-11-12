package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.CommodityDao;
import com.chinatobacco.pojo.Commodity;
import com.chinatobacco.service.CommodityService;

@Service
public class CommodityServiceImpl implements CommodityService {
	
	@Autowired
	private CommodityDao commodityDao;

	@Override
	public List<Commodity> selectAll() {
		List<Commodity> list = commodityDao.selectAll();
		return list;
	}

	@Override
	public Commodity selectOne(int comid) {
		Commodity commodity = commodityDao.selectOne(comid);
		return commodity;
	}

	@Override
	public List<Commodity> selectByType(int comtypeid) {
		List<Commodity> list = commodityDao.selectByType(comtypeid);
		return list;
	}

	@Override
	public List<Commodity> selectByState(int stareid) {
		List<Commodity> list = commodityDao.selectByState(stareid);
		return list;
	}

	@Override
	public List<Commodity> selectQuery(Commodity commodity) {
		List<Commodity> list = commodityDao.selectQuery(commodity);
		return list;
	}

	@Override
	public List<Commodity> selectByName(String comname) {
		List<Commodity> list = commodityDao.selectByName(comname);
		return list;
	}

	@Override
	public boolean add(Commodity commodity) {
		return commodityDao.add(commodity)> 0 ? true : false;
	}

	@Override
	public boolean delete(int[] comid) {
		return commodityDao.delete(comid)> 0 ? true : false;
	}

	@Override
	public boolean update(Commodity commodity) {
		return commodityDao.update(commodity)> 0 ? true : false;
	}

}
