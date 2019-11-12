package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Approvalstate;

/**
 * @author King.zy
 * @category 申请状态数据访问接口
 */
public interface ApprovalstateDao {
	/**
	 * 查询所有状态信息
	 * 
	 * @return 状态对象集合
	 */
	public List<Approvalstate> selectAll();

	/**
	 * 查询一个状态对象
	 * 
	 * @param apstaid状态编号
	 * @return 状态对象
	 */
	public Approvalstate selectOne(int apstaid);

	/**
	 * 新增一种状态
	 * 
	 * @param approvalstate状态对象
	 * @return 1或0
	 */
	public int add(Approvalstate approvalstate);

	/**
	 * 批量删除状态
	 * 
	 * @param apstaid状态编号数组
	 * @return 1或0
	 */
	public int delete(int[] apstaid);

	/**
	 * 修改状态信息
	 * 
	 * @param approvalstate状态对象
	 * @return 1或0
	 */
	public int update(Approvalstate approvalstate);

}
