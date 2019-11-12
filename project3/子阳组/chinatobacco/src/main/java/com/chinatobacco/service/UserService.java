package com.chinatobacco.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinatobacco.pojo.User;

/**
 * @author King.zy
 * @category 员工的业务逻辑接口
 */
public interface UserService {
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
	public List<User> selectByName(String uname);

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
	 * @return boolean
	 */
	public boolean add(User user);

	/**
	 * 删除员工
	 * 
	 * @param uid工号
	 * @return boolean
	 */
	public boolean delete(int uid);

	/**
	 * 修改员工
	 * 
	 * @param user员工对象
	 * @return boolean
	 */
	public boolean update(User user);
}
