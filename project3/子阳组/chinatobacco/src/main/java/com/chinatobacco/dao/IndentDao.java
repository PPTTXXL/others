package com.chinatobacco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.Indent;

/**
 * @author King.zy
 * @category 订单的数据访问接口
 */
public interface IndentDao {
	/**
	 * 查询所有订单（多表联查-商户名称）
	 * 
	 * @return 订单对象集合
	 */
	public List<Indent> selectAll();

	/**
	 * 查询该商户的所有订单（多表联查-商户名称）
	 * 
	 * @return 订单对象集合
	 */
	public List<Indent> selectByStoreid(int storeid);

	/**
	 * 根据订单状态查询订单（多表联查-商户名称）
	 * 
	 * @return
	 */
	public List<Indent> selectByStateid(int stateid);

	/**
	 * 根据订单状态查询该商户的订单（多表联查-商户名称）
	 * 
	 * @param storeid商户id
	 * @param stateid状态ID
	 * @return
	 */
	public List<Indent> findForStoreByState(@Param("storeid") int storeid, @Param("stateid") int stateid);

	/**
	 * 根据订单编号查询订单（多表联查-商户名称）
	 * 
	 * @param indentid订单编号
	 * @return 订单对象
	 */
	public Indent selectByIndentid(int indentid);

	/**
	 * 条件查询（多表联查-商户名称）
	 * 
	 * @param indent订单对象
	 * @return 订单对象集合
	 */
	public List<Indent> selectQuery(Indent indent);

	/**
	 * 新增订单
	 * 
	 * @param indent订单对象
	 * @return 1或0
	 */
	public int add(Indent indent);

	/**
	 * 删除订单
	 * 
	 * @param indentid订单编号
	 * @return 1或0
	 */
	public int delete(int indentid);

	/**
	 * 修改订单
	 * 
	 * @param indent订单对象
	 * @return 1或0
	 */
	public int update(Indent indent);
}
