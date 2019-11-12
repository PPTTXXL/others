package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 财务账户表实体类
 */
public class Account {
	/**
	 * 账户号码（人为设定）
	 */
	private int accid;
	/**
	 * 账户余额
	 */
	private double balance;

	public Account(int accid, double balance) {
		super();
		this.accid = accid;
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
