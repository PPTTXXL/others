package com.chinatobacco.dao;

import java.util.List;

import com.chinatobacco.pojo.Location;

/**
 * @author King.zy
 * @category 库位表数据访问接口
 */
public interface LocationDao {
	/**
	 * 查询所有库位信息（多表联查-仓库名称，货架名称）
	 * 
	 * @return 库位对象集合
	 */
	public List<Location> selectAll();

	/**
	 * 查询一个库位信息（多表联查-仓库名称，货架名称）
	 * 
	 * @param locid库位id
	 * @return 库位对象
	 */
	public Location selectOne(int locid);

	/**
	 * 添加一个库位
	 * 
	 * @param location库位对象
	 * @return 1或0
	 */
	public int add(Location location);

	/**
	 * 删除一个库位
	 * 
	 * @param locid库位id
	 * @return 1或0
	 */
	public int delete(int locid);

	/**
	 * 修改一个库位
	 * 
	 * @param location库位对象
	 * @return 1或0
	 */
	public int update(Location location);
}
