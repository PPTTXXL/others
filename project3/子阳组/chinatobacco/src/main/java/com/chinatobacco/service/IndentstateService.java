package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Indentstate;

/**
 * @author King.zy
 * @category 订单状态的业务逻辑接口
 */
public interface IndentstateService {
	/**
	 * 查询所有订单状态
	 * 
	 * @return 订单状态对象集合
	 */
	public List<Indentstate> selectAll();

	/**
	 * 查询一个订单状态信息
	 * 
	 * @return 订单状态对象
	 */
	public Indentstate selectOne(int stateid);

	/**
	 * 新增一个订单状态
	 * 
	 * @param indentstate
	 *            订单状态对象
	 * @return boolean
	 */
	public boolean add(Indentstate indentstate);

	/**
	 * 删除一个订单状态对象
	 * 
	 * @param stateid订单状态id
	 * @return boolean
	 */
	public boolean delete(int stateid);

	/**
	 * 修改一个订单状态信息
	 * 
	 * @param indentstate订单状态对象
	 * @return boolean
	 */
	public boolean update(Indentstate indentstate);
}
