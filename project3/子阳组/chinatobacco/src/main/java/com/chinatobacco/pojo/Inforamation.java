package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 信息表实体类
 */
public class Inforamation {
	/**
	 * 信息编号
	 */
	private int infoid;
	/**
	 * 员工编号
	 */
	private int uid;
	/**
	 * 员工对象
	 */
	private User user;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 概要
	 */
	private String outline;
	/**
	 * 正文
	 */
	private String info;

	public Inforamation() {
		super();
	}

	public Inforamation(int infoid, int uid, User user, String title, String outline, String info) {
		super();
		this.infoid = infoid;
		this.uid = uid;
		this.user = user;
		this.title = title;
		this.outline = outline;
		this.info = info;
	}

	public int getInfoid() {
		return infoid;
	}

	public void setInfoid(int infoid) {
		this.infoid = infoid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOutline() {
		return outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
