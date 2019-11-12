package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 员工用户实体类
 */
public class User {
	/**
	 * 员工编号
	 */
	private int uid;
	/**
	 * 角色编号
	 */
	private int roleid;
	/**
	 * 角色对象
	 */
	private Role role;
	/**
	 * 员工姓名
	 */
	private String uname;
	/**
	 * 密码
	 */ 
	private String password;
	/**
	 * 性别
	 */
	private String usex;
	/**
	 * 地址
	 */
	private String uaddr;

	public User() {
		super();
	}

	public User(int uid, int roleid, Role role, String uname, String password, String usex, String uaddr) {
		super();
		this.uid = uid;
		this.roleid = roleid;
		this.role = role;
		this.uname = uname;
		this.password = password;
		this.usex = usex;
		this.uaddr = uaddr;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

	public String getUaddr() {
		return uaddr;
	}

	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}

}
