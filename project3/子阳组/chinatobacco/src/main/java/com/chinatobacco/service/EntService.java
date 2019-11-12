package com.chinatobacco.service;

import java.util.List;

import com.chinatobacco.pojo.Ent;

/**
 * @author King.zy
 * @category 仓库表业务逻辑接口
 */
public interface EntService {
	/**
	 * 查询所有仓库
	 * 
	 * @return 仓库对象集合
	 */
	public List<Ent> selectAll();

	/**
	 * 查询一个仓库
	 * 
	 * @param entid仓库编号
	 * @return 仓库对象
	 */
	public Ent selectOne(int entid);

	/**
	 * 添加仓库对象
	 * 
	 * @param ent仓库对象
	 * @return 1或0
	 */
	public boolean add(Ent ent);

	/**
	 * 删除一个仓库
	 * 
	 * @param entid仓库编号
	 * @return 1或0
	 */
	public boolean delete(int entid);

	/**
	 * 修改一个仓库信息
	 * 
	 * @param ent
	 *            仓库对象
	 * @return 1或0
	 */
	public boolean update(Ent ent);
}
