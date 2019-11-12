package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 商户表实体类
 */
public class Store {
	/**
	 * 商户编号
	 */
	private int storeid;
	/**
	 * 商户等级编号
	 */
	private int lvid;
	/**
	 * 商户等级对象
	 */
	private Storelevel storelevel;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 商户名称
	 */
	private String storename;
	/**
	 * 商户地址
	 */
	private String storeaddr;

	public Store() {
		super();
	}

	public Store(int storeid, int lvid, Storelevel storelevel, String password, String storename, String storeaddr) {
		super();
		this.storeid = storeid;
		this.lvid = lvid;
		this.storelevel = storelevel;
		this.password = password;
		this.storename = storename;
		this.storeaddr = storeaddr;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public int getLvid() {
		return lvid;
	}

	public void setLvid(int lvid) {
		this.lvid = lvid;
	}

	public Storelevel getStorelevel() {
		return storelevel;
	}

	public void setStorelevel(Storelevel storelevel) {
		this.storelevel = storelevel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStoreaddr() {
		return storeaddr;
	}

	public void setStoreaddr(String storeaddr) {
		this.storeaddr = storeaddr;
	}

}
