package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Approval;

/**
 * @author King.zy
 * @category 资金申请审批表数据访问接口
 */
public interface ApprovalDao {
	/**
	 * 查询所有申请表（多表联查-用户姓名，状态名称）
	 * 
	 * @return 申请表对象集合
	 */
	public List<Approval> selectAll();

	/**
	 * 查询一个申请表对象（多表联查-用户姓名，状态名称）
	 * 
	 * @param approvalid申请表编号
	 * @return 申请表对象
	 */
	public Approval selectOne(int approvalid);

	/**
	 * 查询该用户的申请表（多表联查-用户姓名，状态名称）
	 * 
	 * @param uid员工编号
	 * @return 申请表对象集合
	 */
	public List<Approval> selectByUid(int uid);

	/**
	 * 条件查询申请表（多表联查-用户姓名，状态名称）
	 * 
	 * @param approval申请表对象
	 * @return 申请表对象集合
	 */
	public List<Approval> selectQuery(Approval approval);

	/**
	 * 新增一个申请表
	 * 
	 * @param approval申请表对象
	 * @return 1或0
	 */
	public int add(Approval approval);

	/**
	 * 批量删除申请表
	 * 
	 * @param approvalid申请表编号数组
	 * @return 1或0
	 */
	public int delete(int[] approvalid);

	/**
	 * 修改一个申请表
	 * 
	 * @param approval申请表对象
	 * @return 1或0
	 */
	public int update(Approval approval);
}
