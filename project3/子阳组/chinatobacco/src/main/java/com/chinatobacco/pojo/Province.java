package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 省实体类
 */
public class Province {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 省id
	 */
	private String provinceID;
	/**
	 * 省名称
	 */
	private String province;

	public Province() {
		super();
	}

	public Province(int id, String provinceID, String province) {
		super();
		this.id = id;
		this.provinceID = provinceID;
		this.province = province;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
