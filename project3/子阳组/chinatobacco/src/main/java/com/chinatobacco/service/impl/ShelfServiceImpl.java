package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ShelfDao;
import com.chinatobacco.pojo.Shelf;
import com.chinatobacco.service.ShelfService;
@Service
public class ShelfServiceImpl implements ShelfService {

	@Autowired
	private ShelfDao shelfDao;
	@Override
	public List<Shelf> selectAll() {
		List<Shelf> list=shelfDao.selectAll();
		return list;
	}

	@Override
	public Shelf selectOne(int shelfid) {
		Shelf shelf=shelfDao.selectOne(shelfid);
		return shelf;
	}

	@Override
	public boolean add(Shelf shelf) {
		return shelfDao.add(shelf) > 0 ? true : false;
	}

	@Override
	public boolean delete(int shelfid) {
		return false;
	}

	@Override
	public boolean update(Shelf shelf) {
		return shelfDao.update(shelf) > 0 ? true : false;
	}

}
