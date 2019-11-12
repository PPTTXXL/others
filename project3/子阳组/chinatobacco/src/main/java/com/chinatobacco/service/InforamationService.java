package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Inforamation;

/**
 * @author King.zy
 * @category 信息的业务逻辑接口
 */
public interface InforamationService {
	/**
	 * 查询所有信息(多表联查-员工姓名)
	 * 
	 * @return 信息对象集合
	 */
	public List<Inforamation> selectAll();

	/**
	 * 显示首页的8条信息，以时间倒序排列(多表联查-员工姓名)
	 * 
	 * @return 信息对象集合
	 */
	public List<Inforamation> selectEight();

	/**
	 * 显示一条信息详情(多表联查-员工姓名)
	 * 
	 * @param infoid信息编号
	 * @return 信息对象
	 */
	public Inforamation selectOne(int infoid);

	/**
	 * 添加一条信息
	 * 
	 * @param inforamation信息对象
	 * @return boolean
	 */
	public boolean add(Inforamation inforamation);

	/**
	 * 批量删除信息
	 * 
	 * @param infoid
	 *            信息编号数组
	 * @return boolean
	 */
	public boolean delete(int[] infoid);

	/**
	 * 修改信息
	 * 
	 * @param inforamation信息对象
	 * @return boolean
	 */
	public boolean update(Inforamation inforamation);

}
