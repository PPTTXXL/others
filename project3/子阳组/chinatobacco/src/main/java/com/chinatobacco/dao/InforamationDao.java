package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Inforamation;

/**
 * @author King.zy
 * @category 信息的数据访问接口
 */
public interface InforamationDao {
	/**
	 * 查询所有信息(多表联查-员工姓名)
	 * 
	 * @return 信息对象集合
	 */
	public List<Inforamation> selectAll();

	/**
	 * 显示首页的8条信息，以编号倒序排列(多表联查-员工姓名)
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
	 * @return 1或0
	 */
	public int add(Inforamation inforamation);

	/**
	 * 批量删除信息
	 * 
	 * @param infoid
	 *            信息编号数组
	 * @return 1或0
	 */
	public int delete(int[] infoid);

	/**
	 * 修改信息
	 * 
	 * @param inforamation信息对象
	 * @return 1或0
	 */
	public int update(Inforamation inforamation);

}
