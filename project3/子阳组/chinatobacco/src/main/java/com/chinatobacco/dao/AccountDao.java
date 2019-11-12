package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Account;


/**
 * @author King.zy
 * @category 财务账户数据访问接口
 */
public interface AccountDao {
	/**
	 * 查询所有账户信息
	 * 
	 * @return 账户对象集合
	 */
	public List<Account> selectAll();

	/**
	 * 根据账号查询账户对象
	 * 
	 * @param accid账号
	 * @return 账户对象
	 */
	public Account selectOne(int accid);

	/**
	 * 添加一个账户对象
	 * 
	 * @param Account账户对象
	 * @return 1或0
	 */
	public int add(Account Account);

	/**
	 * 根据账号删除一个账户对象
	 * 
	 * @param accid账号
	 * @return 1或0
	 */
	public int delete(int accid);

	/**
	 * 修改账户信息
	 * 
	 * @param Account账户对象
	 * @return 1或0
	 */
	public int update(Account Account);
}
