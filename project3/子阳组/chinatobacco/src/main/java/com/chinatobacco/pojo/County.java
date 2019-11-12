package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 区县实体类
 */
public class County {
	/**
	 * 编号
	 */
	private int id;
	/**
	 * 区县编号
	 */
	private String areaID;
	/**
	 * 区县名称
	 */
	private String areas;
	/**
	 * 城市编号
	 */
	private String cityID;

	public County() {
		super();
	}

	public County(int id, String areaID, String areas, String cityID) {
		super();
		this.id = id;
		this.areaID = areaID;
		this.areas = areas;
		this.cityID = cityID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAreaID() {
		return areaID;
	}

	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}

	public String getAreas() {
		return areas;
	}

	public void setAreas(String areas) {
		this.areas = areas;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

}
