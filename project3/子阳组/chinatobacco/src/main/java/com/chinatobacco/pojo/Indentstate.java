package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 订单状态实体类
 */
public class Indentstate {
	/**
	 * 订单状态编号
	 */
	private int stateid;
	/**
	 * 订单状态名称
	 */
	private String statename;

	public Indentstate() {
		super();
	}

	public Indentstate(int stateid, String statename) {
		super();
		this.stateid = stateid;
		this.statename = statename;
	}

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

}
