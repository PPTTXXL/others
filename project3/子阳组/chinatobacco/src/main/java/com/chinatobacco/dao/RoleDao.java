package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Role;

/**
 * @author King.zy
 * @category 角色的数据访问接口
 */
public interface RoleDao {
	/**
	 * 查询所有角色
	 * 
	 * @return 角色对象集合
	 */
	public List<Role> selectAll();

	/**
	 * 查询一个角色
	 * 
	 * @param roleid角色id
	 * @return 角色对象
	 */
	public Role selectOne(int roleid);

	/**
	 * 新增一个角色
	 * 
	 * @param role角色对象
	 * @return 1或0
	 */
	public int add(Role role);

	/**
	 * 删除一个角色
	 * 
	 * @param roleid角色编号
	 * @return 1或0
	 */
	public int delete(int roleid);

	/**
	 * 修改一个角色
	 * 
	 * @param role角色对象
	 * @return 1或0
	 */
	public int update(Role role);
}
