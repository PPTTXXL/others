package com.chinatobacco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.Shopcar;

/**
 * @author King.zy
 * @category 购物车的数据访问接口
 */
public interface ShopcarDao {
	/**
	 * 查询当前商户所有购物车信息（多表联查-商品）
	 * 
	 * @param storeid商户id
	 * @return 购物车对象集合
	 */
	public List<Shopcar> selectAll(int storeid);

	public Shopcar selectOne(@Param("comid")int comid, @Param("storeid")int storeid);

	/**
	 * 添加一条购物车信息
	 * 
	 * @param shopcar购物车对象
	 * @return 1或0
	 */
	public int add(Shopcar shopcar);

	/**
	 * 批量删除购物车信息
	 * 
	 * @param carid购物车id
	 * @return 1或0
	 */
	public int delete(int[] carid);
}
