package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.WaybillDao;
import com.chinatobacco.pojo.Waybill;
import com.chinatobacco.service.WaybillService;
@Service
public class WaybillServiceImpl implements WaybillService {

	@Autowired
	private WaybillDao waybillDao;
	
	@Override
	public List<Waybill> selectAll() {
		return waybillDao.selectAll();
	}

	@Override
	public List<Waybill> selectByStore(int storeid) {
		return waybillDao.selectByStore(storeid);
	}

	@Override
	public Waybill selectByIndent(int indentid) {
		return waybillDao.selectByIndent(indentid);
	}

	@Override
	public boolean add(Waybill waybill) {
		return waybillDao.add(waybill)>0?true:false;
	}

	@Override
	public boolean delete(int wayid) {
		return false;
	}

	@Override
	public boolean update(Waybill waybill) {
		return waybillDao.update(waybill)>0?true:false;
	}

}
