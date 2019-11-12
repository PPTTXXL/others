package com.chinatobacco.service;

import java.util.Date;
import java.util.List;

import com.chinatobacco.pojo.Moneylist;

/**
 * @author King.zy
 * @category 财务流水表业务逻辑接口
 */
public interface MoneylistService {
	// 每条流水都是在某一项涉及资金流动的操作中自动添加进来，
	// 所以不设置修改，删除只有管理员有权限，查询分为以下几种，
	// 以应对不同业务逻辑需求

	/**
	 * 查询所有流水表信息（多表联查-流水类型）
	 * 
	 * @return 流水对象集合
	 */
	public List<Moneylist> selectAll();

	/**
	 * 查询某个类型的流水（多表联查-流水类型）
	 * 
	 * @param id类型id
	 * @return 流水对象集合
	 */
	public List<Moneylist> selectByType(int id);

	/**
	 * 查询某天的流水（多表联查-流水类型）
	 * 
	 * @param date日期
	 * @return 流水对象集合
	 */
	public List<Moneylist> selectByDate(Date date);

	/**
	 * 条件查询
	 * 
	 * @param moneylist流水对象
	 * @return 流水对象集合
	 */
	public List<Moneylist> selectQuery(Moneylist moneylist);

	/**
	 * 模糊查询（前后通配）
	 * 
	 * @param direction资金方向
	 * @return 流水对象集合
	 */
	public List<Moneylist> selectByDirection(String direction);

	/**
	 * 添加一条流水
	 * 
	 * @param moneylist流水对象
	 * @return boolean
	 */
	public boolean add(Moneylist moneylist);

	/**
	 * 删除一条流水
	 * 
	 * @param mlid流水id
	 * @return boolean
	 */
	public boolean delete(int mlid);
	// 没有修改
}
