package com.chinatobacco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.Collect;

/**
 * @author King.zy
 * @category 我的收藏数据访问接口
 */
public interface CollectDao {
	/**
	 * 查询所有收藏（管理员权限）（多表联查-商品名称）
	 * 
	 * @return 收藏对象集合
	 */
	public List<Collect> selectAll();

	/**
	 * 查询某商户的所有收藏（多表联查-商品名称）
	 * 
	 * @param storeid商户编号
	 * @return 收藏对象集合
	 */
	public List<Collect> selectByStoreid(int storeid);

	public Collect selectOneByStoreid(@Param("storeid") int storeid, @Param("comid") int comid);

	/**
	 * 条件查询（多表联查-商品名称）
	 * 
	 * @param collect收藏对象
	 * @return 收藏对象集合
	 */
	public List<Collect> selectQuery(Collect collect);

	/**
	 * 新增收藏
	 * 
	 * @param collect收藏对象
	 * @return 1或0
	 */
	public int add(Collect collect);

	/**
	 * 批量删除收藏
	 * 
	 * @param collid收藏编号
	 * @return 1或0
	 */
	public int delete(int[] collid);

}
