package com.chinatobacco.pojo;

import java.util.Date;

/**
 * @author King.zy
 * @category 配送单实体类
 */
public class Waybill {
	/**
	 * 运单编号
	 */
	private int wayid;
	/**
	 * 订单编号
	 */
	private int indentid;
	/**
	 * 订单对象
	 */
	private Indent indent;
	/**
	 * 商户编号
	 */
	private int storeid;
	/**
	 * 商户对象
	 */
	private Store store;
	/**
	 * 配送时间
	 */
	private Date waydate;
	/**
	 * 地址
	 */
	private String wayaddr;

	public Waybill() {
		super();
	}

	public Waybill(int wayid, int indentid, Indent indent, int storeid, Store store, Date waydate, String wayaddr) {
		super();
		this.wayid = wayid;
		this.indentid = indentid;
		this.indent = indent;
		this.storeid = storeid;
		this.store = store;
		this.waydate = waydate;
		this.wayaddr = wayaddr;
	}

	public int getWayid() {
		return wayid;
	}

	public void setWayid(int wayid) {
		this.wayid = wayid;
	}

	public int getIndentid() {
		return indentid;
	}

	public void setIndentid(int indentid) {
		this.indentid = indentid;
	}

	public Indent getIndent() {
		return indent;
	}

	public void setIndent(Indent indent) {
		this.indent = indent;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Date getWaydate() {
		return waydate;
	}

	public void setWaydate(Date waydate) {
		this.waydate = waydate;
	}

	public String getWayaddr() {
		return wayaddr;
	}

	public void setWayaddr(String wayaddr) {
		this.wayaddr = wayaddr;
	}

}
