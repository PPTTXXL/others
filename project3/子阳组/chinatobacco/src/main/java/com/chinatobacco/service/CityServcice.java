package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.City;

/**
 * @author King.zy
 * @category 城市的业务逻辑接口
 */
public interface CityServcice {
	/**
	 * 根据省份id查询出所有的城市列表
	 * 
	 * @param provinceId
	 * @return
	 */
	public List<City> selectAll(String provinceId);

	/**
	 * 根据城市id，查询出对应的城市对象
	 * 
	 * @param cityId
	 * @return
	 */
	public City selectOne(String cityId);
}
