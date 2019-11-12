package com.chinatobacco.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.IndentDao;
import com.chinatobacco.pojo.Indent;
import com.chinatobacco.service.IndentService;

@Service
public class IndentServiceImpl implements IndentService {
	@Resource
	private IndentDao indentDao;

	@Override
	public List<Indent> selectAll() {
		List<Indent> list = indentDao.selectAll();
		return list;
	}

	@Override
	public List<Indent> selectByStoreid(int storeid) {
		List<Indent> list = indentDao.selectByStoreid(storeid);
		return list;
	}

	@Override
	public List<Indent> selectByStateid(int stateid) {
		List<Indent> list = indentDao.selectByStateid(stateid);
		return list;
	}

	@Override
	public List<Indent> findForStoreByState(int storeid, int stateid) {
		List<Indent> list = indentDao.findForStoreByState(storeid, stateid);
		return list;
	}
	@Override
	public Indent selectByIndentid(int indentid) {
		Indent indent = indentDao.selectByIndentid(indentid);
		return indent;
	}

	@Override
	public List<Indent> selectQuery(Indent indent) {
		List<Indent> list = indentDao.selectQuery(indent);
		return list;
	}

	@Override
	public boolean add(Indent indent) {
		return indentDao.add(indent) > 0 ? true : false;
	}

	@Override
	public boolean delete(int indentid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Indent indent) {
		return indentDao.update(indent) > 0 ? true : false;
	}

}
