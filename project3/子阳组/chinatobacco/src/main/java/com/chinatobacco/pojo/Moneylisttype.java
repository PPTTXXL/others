package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 财务流水状态表实体类
 */
public class Moneylisttype {
	/**
	 * 流水类型编号
	 */
	private int id;
	/**
	 * 流水类型名称
	 */
	private String name;

	public Moneylisttype() {
		super();
	}

	public Moneylisttype(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
