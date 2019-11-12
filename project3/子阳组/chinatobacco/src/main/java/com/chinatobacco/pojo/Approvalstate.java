package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 申请状态表实体类
 */
public class Approvalstate {
	/**
	 * 状态编号
	 */
	private int apstaid;
	/**
	 * 状态名称
	 */
	private String apstaname;

	public Approvalstate(int apstaid, String apstaname) {
		super();
		this.apstaid = apstaid;
		this.apstaname = apstaname;
	}

	public Approvalstate() {
		super();
	}

	public int getApstaid() {
		return apstaid;
	}

	public void setApstaid(int apstaid) {
		this.apstaid = apstaid;
	}

	public String getApstaname() {
		return apstaname;
	}

	public void setApstaname(String apstaname) {
		this.apstaname = apstaname;
	}

}
