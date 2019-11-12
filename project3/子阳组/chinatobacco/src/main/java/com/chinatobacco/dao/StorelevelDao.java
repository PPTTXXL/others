package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Storelevel;

/**
 * @author King.zy
 * @category 商户等级数据访问接口
 */
public interface StorelevelDao {
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
	 * @return 1和0
	 */
	public int add(Storelevel storelevel);

	/**
	 * 删除一个商户等级对象
	 * 
	 * @param lvid商户等级编号
	 * @return 1或0
	 */
	public int delete(int lvid);

	/**
	 * 修改一个商户等级对象
	 * 
	 * @param storelevel商户等级对象
	 * @return 1或0
	 */
	public int update(Storelevel storelevel);
}
