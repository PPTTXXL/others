package com.chinatobacco.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author King.zy
 * @category 订单表
 */
public class Indent {
	/**
	 * 订单编号
	 */
	private int indentid;
	/**
	 * 商户编号
	 */
	private int storeid;
	/**
	 * 商品包对象集合
	 */
	private List<Commoditybag> cbaglist;
	/**
	 * 商户对象
	 */
	private Store store;
	/**
	 * 总价
	 */
	private double grossprice;
	/**
	 * 创建时间
	 */
	private Date createdate;
	private String screatedate;
	/**
	 * 成交时间
	 */
	private Date enddate;

	public String getScreatedate() {
		return screatedate;
	}

	public void setScreatedate(String screatedate) {
		this.screatedate = screatedate;
	}

	public String getSenddate() {
		return senddate;
	}

	public void setSenddate(String senddate) {
		this.senddate = senddate;
	}

	private String senddate;
	/**
	 * 状态编号
	 */
	private int stateid;

	/**
	 * 订单状态对象
	 */
	private Indentstate indentstate;
	/**
	 * 支付单号
	 */
	private String payid;

	public Indent() {
		super();
	}

	public Indent(int indentid, int storeid, List<Commoditybag> cbaglist, Store store, double grossprice,
			Date createdate, Date enddate, int stateid, Indentstate indentstate, String payid) {
		super();
		this.indentid = indentid;
		this.storeid = storeid;
		this.cbaglist = cbaglist;
		this.store = store;
		this.grossprice = grossprice;
		this.createdate = createdate;
		this.enddate = enddate;
		this.stateid = stateid;
		this.indentstate = indentstate;
		this.payid = payid;
	}

	public int getIndentid() {
		return indentid;
	}

	public void setIndentid(int indentid) {
		this.indentid = indentid;
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

	public double getGrossprice() {
		return grossprice;
	}

	public void setGrossprice(double grossprice) {
		this.grossprice = grossprice;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public int getStateid() {
		return stateid;
	}

	public void setStateid(int stateid) {
		this.stateid = stateid;
	}

	public Indentstate getIndentstate() {
		return indentstate;
	}

	public void setIndentstate(Indentstate indentstate) {
		this.indentstate = indentstate;
	}

	public String getPayid() {
		return payid;
	}

	public void setPayid(String payid) {
		this.payid = payid;
	}

	public List<Commoditybag> getCbaglist() {
		return cbaglist;
	}

	public void setCbaglist(List<Commoditybag> cbaglist) {
		this.cbaglist = cbaglist;
	}

}
