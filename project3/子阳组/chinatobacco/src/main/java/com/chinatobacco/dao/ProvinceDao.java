package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Province;

/**
 * @author King.zy
 * @category 省的数据访问接口
 */
public interface ProvinceDao {
	/**
	 * 查询所有省份
	 * 
	 * @return 省份列表
	 */
	public List<Province> findAll();

	/**
	 * 根据省份id查询省份对象
	 * 
	 * @param provinceID
	 * @return
	 */
	public Province findObject(String provinceID);
}
