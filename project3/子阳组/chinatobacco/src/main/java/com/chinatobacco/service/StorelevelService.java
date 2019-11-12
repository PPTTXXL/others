package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Storelevel;

/**
 * @author King.zy
 * @category 商户的业务逻辑接口
 */
public interface StorelevelService {
	/**
	 * 查询所有商户等级
	 * 
	 * @return 商户等级对象集合
	 */
	public List<Storelevel> selectAll();

	/**
	 * 查询一个商户等级
	 * 
	 * @param lvid商户等级编号
	 * @return 商户等级对象
	 */
	public Storelevel selectOne(int lvid);

	/**
	 * 添加一个商户等级
	 * 
	 * @param storelevel商户等级对象
	 * @return boolean
	 */
	public boolean add(Storelevel storelevel);

	/**
	 * 删除一个商户等级对象
	 * 
	 * @param lvid商户等级编号
	 * @return boolean
	 */
	public boolean delete(int lvid);

	/**
	 * 修改一个商户等级对象
	 * 
	 * @param storelevel商户等级对象
	 * @return boolean
	 */
	public boolean update(Storelevel storelevel);
}
