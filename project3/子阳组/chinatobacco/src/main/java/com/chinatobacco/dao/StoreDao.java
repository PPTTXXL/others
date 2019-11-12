package com.chinatobacco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.Store;

/**
 * @author King.zy
 * @category 商户的数据访问层
 */
public interface StoreDao {
	/**
	 * 根据商户编号查询商户对象
	 * 
	 * @param storeid商户编号
	 * @return 商户对象
	 */
	public Store selectOne(int storeid);

	/**
	 * 查询所有商户（多表联查-商户等级名称）
	 * 
	 * @return 商户对象集合
	 */
	public List<Store> selectAll();

	/**
	 * 根据等级查询商户（多表联查-商户等级名称）
	 * 
	 * @param lvid等级编号
	 * @return 商户对象集合
	 */
	public List<Store> selectByLv(int lvid);

	/**
	 * 查询商户通过工号密码
	 * 
	 * @param storeid工号
	 * @param password密码
	 * @return 商户对象
	 */
	public Store selectByPass(@Param("storeid") int storeid, @Param("password") String password);

	/**
	 * 模糊查询（前后通配）（多表联查-商户等级名称）
	 * 
	 * @param storename商户名字
	 * @return 商户对象集合
	 */
	public List<Store> selectByName(@Param("storename") String storename);

	/**
	 * 新增一个商户
	 * 
	 * @param store商户对象
	 * @return 1或0
	 */
	public int add(Store store);

	/**
	 * 删除一个商户
	 * 
	 * @param storeid商户id
	 * @return 1或0
	 */
	public int delete(int storeid);

	/**
	 * 修改一个商户
	 * 
	 * @param store商户对象
	 * @return 1或0
	 */
	public int update(Store store);
}
