package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Waybill;

/**
 * @author King.zy
 * @category 配送单数据访问接口
 */
public interface WaybillDao {
	/**
	 * 查询所有配送单（多表联查-订单）
	 * 
	 * @return 配送单对象集合
	 */
	public List<Waybill> selectAll();

	/**
	 * 查询某商户的配送单（多表联查-订单）
	 * 
	 * @param storeid商户编号
	 * @return 配送单对象集合
	 */
	public List<Waybill> selectByStore(int storeid);

	/**
	 * 查询某订单对应的配送单（多表联查-订单）
	 * 
	 * @param indentid订单id
	 * @return 配送单对象
	 */
	public Waybill selectByIndent(int indentid);

	/**
	 * 新增配送单
	 * 
	 * @param waybill配送单对象
	 * @return 1或0
	 */
	public int add(Waybill waybill);

	/**
	 * 删除配送单
	 * 
	 * @param wayid配送单id
	 * @return 1或0
	 */
	public int delete(int wayid);

	/**
	 * 修改配送单
	 * 
	 * @param waybill配送单对象
	 * @return 1或0
	 */
	public int update(Waybill waybill);
}
