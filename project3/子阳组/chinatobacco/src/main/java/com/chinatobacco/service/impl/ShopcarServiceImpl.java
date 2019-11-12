package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ShopcarDao;
import com.chinatobacco.pojo.Shopcar;
import com.chinatobacco.service.ShopcarService;
@Service
public class ShopcarServiceImpl implements ShopcarService {
	@Autowired
	private ShopcarDao shopcarDao;
	@Override
	public List<Shopcar> selectAll(int storeid) {
		List<Shopcar> list=shopcarDao.selectAll(storeid);
		return list;
	}

	@Override
	public boolean add(Shopcar shopcar) {
		return shopcarDao.add(shopcar) > 0 ? true :false;
	}

	@Override
	public boolean delete(int[] carid) {
		return shopcarDao.delete(carid) > 0 ? true : false;
	}

	@Override
	public Shopcar selectOne(int comid, int storeid) {
		return shopcarDao.selectOne(comid, storeid);
	}

}
