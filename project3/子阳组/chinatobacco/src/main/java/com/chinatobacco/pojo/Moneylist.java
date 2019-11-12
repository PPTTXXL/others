package com.chinatobacco.pojo;

import java.util.Date;

/**
 * @author King.zy
 * @category 财务流水表实体类
 */
public class Moneylist {
	/**
	 * 流水编号
	 */
	private int mlid;
	/**
	 * 流水类型编号
	 */
	private int id;
	/**
	 * 流水类型对象
	 */
	private Moneylisttype moneylisttype;
	/**
	 * 金额
	 */
	private double moneynum;
	/**
	 * 日期
	 */
	private Date date;

	public String getSdate() {
		return sdate;
	}

	public void setSdate(String sdate) {
		this.sdate = sdate;
	}

	private String sdate;
	/**
	 * 资金方向
	 */
	private String direction;

	public Moneylist() {
		super();
	}

	public Moneylist(int mlid, int id, Moneylisttype moneylisttype, double moneynum, Date date, String direction) {
		super();
		this.mlid = mlid;
		this.id = id;
		this.moneylisttype = moneylisttype;
		this.moneynum = moneynum;
		this.date = date;
		this.direction = direction;
	}

	public int getMlid() {
		return mlid;
	}

	public void setMlid(int mlid) {
		this.mlid = mlid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Moneylisttype getMoneylisttype() {
		return moneylisttype;
	}

	public void setMoneylisttype(Moneylisttype moneylisttype) {
		this.moneylisttype = moneylisttype;
	}

	public double getMoneynum() {
		return moneynum;
	}

	public void setMoneynum(double moneynum) {
		this.moneynum = moneynum;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
