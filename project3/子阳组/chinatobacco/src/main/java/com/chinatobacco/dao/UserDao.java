package com.chinatobacco.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.User;

/**
 * @author King.zy
 * @category 员工的数据访问接口
 */
public interface UserDao {
	/**
	 * 查询所有员工（多表联查-角色名称）
	 * 
	 * @return 员工对象集合
	 */
	public List<User> selectAll();

	/**
	 * 查询员工通过角色（多表联查-角色名称）
	 * 
	 * @param roleid角色id
	 * @return 员工对象集合
	 */
	public List<User> selectByRole(int roleid);

	/**
	 * 查询员工（模糊查询，前后通配）（多表联查-角色名称）
	 * 
	 * @param uname员工姓名
	 * @return 员工对象集合
	 */
	public List<User> selectByName( @Param("uname") String uname);

	/**
	 * 条件查询（多表联查-角色名称）
	 * 
	 * @param user员工对象
	 * @return 员工对象集合
	 */
	public List<User> selectQuery(User user);

	/**
	 * 查询员工通过工号（多表联查-角色名称）
	 * 
	 * @param uid工号
	 * @return 员工对象
	 */
	public User selectById(int uid);

	/**
	 * 查询员工通过工号密码
	 * 
	 * @param uid工号
	 * @param password密码
	 * @return 员工对象
	 */
	public User selectByPass(@Param("uid") int uid, @Param("password") String password);

	/**
	 * 添加员工
	 * 
	 * @param user员工对象
	 * @return 1或0
	 */
	public int add(User user);

	/**
	 * 删除员工
	 * 
	 * @param uid工号
	 * @return 1或0
	 */
	public int delete(int uid);

	/**
	 * 修改员工
	 * 
	 * @param user员工对象
	 * @return 1或0
	 */
	public int update(User user);

}
