package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Comstate;

/**
 * @author King.zy
 * @category 商品状态表业务逻辑层
 */
public interface ComstateService {
	/**
	 * 查询所有商品状态
	 * 
	 * @return 商品状态对象集合
	 */
	public List<Comstate> selectAll();

	/**
	 * 查询一个商品状态
	 * 
	 * @param stareid商品状态编号
	 * @return 商品状态对象
	 */
	public Comstate selectOne(int stareid);

	/**
	 * 添加一种商品状态
	 * 
	 * @param comstate商品状态对象
	 * @return 1或0
	 */
	public boolean add(Comstate comstate);

	/**
	 * 删除一种商品状态
	 * 
	 * @param stareid商品状态编号
	 * @return 1或0
	 */
	public boolean delete(int stareid);

	/**
	 * 修改商品状态名称
	 * 
	 * @param comstate商品状态对象
	 * @return 1或0
	 */
	public boolean update(Comstate comstate);
}
