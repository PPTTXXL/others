package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Indentstate;

/**
 * @author King.zy
 * @category 订单状态数据访问接口
 */
public interface IndentstateDao {
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
	 * @return 1或0
	 */
	public int add(Indentstate indentstate);

	/**
	 * 删除一个订单状态对象
	 * 
	 * @param stateid订单状态id
	 * @return 1或0
	 */
	public int delete(int stateid);

	/**
	 * 修改一个订单状态信息
	 * 
	 * @param indentstate订单状态对象
	 * @return 1或0
	 */
	public int update(Indentstate indentstate);
}
