package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Waybill;

/**
 * @author King.zy
 * @category 配送单业务逻辑接口
 */
public interface WaybillService {
	/**
	 * 查询所有配送单（多表联查-商户名称）
	 * 
	 * @return 配送单对象集合
	 */
	public List<Waybill> selectAll();

	/**
	 * 查询某商户的配送单（多表联查-商户名称）
	 * 
	 * @param storeid商户编号
	 * @return 配送单对象集合
	 */
	public List<Waybill> selectByStore(int storeid);

	/**
	 * 查询某订单对应的配送单（多表联查-商户名称）
	 * 
	 * @param indentid订单id
	 * @return 配送单对象
	 */
	public Waybill selectByIndent(int indentid);

	/**
	 * 新增配送单
	 * 
	 * @param waybill配送单对象
	 * @return boolean
	 */
	public boolean add(Waybill waybill);

	/**
	 * 删除配送单
	 * 
	 * @param wayid配送单id
	 * @return boolean
	 */
	public boolean delete(int wayid);

	/**
	 * 修改配送单
	 * 
	 * @param waybill配送单对象
	 * @return boolean
	 */
	public boolean update(Waybill waybill);
}
