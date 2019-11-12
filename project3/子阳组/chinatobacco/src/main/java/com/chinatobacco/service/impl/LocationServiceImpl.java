package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.LocationDao;
import com.chinatobacco.pojo.Location;
import com.chinatobacco.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {
	@Autowired
	private LocationDao locationDao;

	@Override
	public List<Location> selectAll() {
		List<Location> list = locationDao.selectAll();
		return list;
	}

	@Override
	public Location selectOne(int locid) {
		Location location = locationDao.selectOne(locid);
		return location;
	}

	@Override
	public boolean add(Location location) {
		return locationDao.add(location) > 0 ? true : false;
	}

	@Override
	public boolean delete(int locid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Location location) {
		return locationDao.update(location) > 0 ? true : false;
	}

}
