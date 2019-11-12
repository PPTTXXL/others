package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.County;

/**
 * @author King.zy
 * @category 区县的数据访问接口
 */
public interface CountyDao {
	/**
	 * 根据城市id，查询出所有的区县列表
	 * 
	 * @param cityId
	 * @return
	 */
	public List<County> findAreasByCid(String cityID);

	/**
	 * 根据区县id查询出对应的区县对象
	 * 
	 * @param areaId
	 * @return
	 */
	public County findObject(String areaID);
}
