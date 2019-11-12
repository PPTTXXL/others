package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Shopcar;

/**
 * @author King.zy
 * @category 购物车的业务逻辑接口
 */
public interface ShopcarService {
	/**
	 * 查询当前商户所有购物车信息（多表联查-商品）
	 * 
	 * @param storeid商户id
	 * @return 购物车对象集合
	 */
	public List<Shopcar> selectAll(int storeid);
	public Shopcar selectOne(int comid, int storeid);

	/**
	 * 添加一条购物车信息
	 * 
	 * @param shopcar购物车对象
	 * @return boolean
	 */
	public boolean add(Shopcar shopcar);

	/**
	 * 批量删除购物车信息
	 * 
	 * @param carid购物车id
	 * @return boolean
	 */
	public boolean delete(int[] carid);
}
