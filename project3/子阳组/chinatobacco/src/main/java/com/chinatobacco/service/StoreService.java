package com.chinatobacco.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.Store;

/**
 * @author King.zy
 * @category 商户的业务逻辑层
 */
public interface StoreService {
	
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
	 * 模糊查询（前后通配）（多表联查-商户等级名称）
	 * 
	 * @param storename商户名字
	 * @return 商户对象集合
	 */
	public List<Store> selectByName(String storename);

	/**
	 * 新增一个商户
	 * 
	 * @param store商户对象
	 * @return boolean
	 */
	public boolean add(Store store);

	/**
	 * 删除一个商户
	 * 
	 * @param storeid商户id
	 * @return boolean
	 */
	public boolean delete(int storeid);

	/**
	 * 修改一个商户
	 * 
	 * @param store商户对象
	 * @return boolean
	 */
	public boolean update(Store store);
	/**
	 * 查询商户通过工号密码
	 * 
	 * @param storeid工号
	 * @param password密码
	 * @return 商户对象
	 */
	public Store selectByPass(@Param("storeid") int storeid, @Param("password") String password);
}
