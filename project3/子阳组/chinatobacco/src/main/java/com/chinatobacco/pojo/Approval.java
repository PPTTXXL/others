package com.chinatobacco.pojo;

/**
 * @author King.zy
 * @category 资金申请审批表实体类
 */
public class Approval {
	/**
	 * 申请表编号（日期加随机数）
	 */
	private int approvalid;
	/**
	 * 用户编号
	 */
	private int uid;
	/**
	 * 用户对象
	 */
	private User user;
	/**
	 * 申请表状态编号
	 */
	private int apstaid;
	/**
	 * 申请表状态对象
	 */
	private Approvalstate approvalstate;
	/**
	 * 申请金额
	 */
	private double approvalnum;
	/**
	 * 申请事项
	 */
	private String reason;

	public Approval() {
		super();
	}

	public Approval(int approvalid, int uid, User user, int apstaid, Approvalstate approvalstate, double approvalnum,
			String reason) {
		super();
		this.approvalid = approvalid;
		this.uid = uid;
		this.user = user;
		this.apstaid = apstaid;
		this.approvalstate = approvalstate;
		this.approvalnum = approvalnum;
		this.reason = reason;
	}

	public int getApprovalid() {
		return approvalid;
	}

	public void setApprovalid(int approvalid) {
		this.approvalid = approvalid;
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

	public int getApstaid() {
		return apstaid;
	}

	public void setApstaid(int apstaid) {
		this.apstaid = apstaid;
	}

	public Approvalstate getApprovalstate() {
		return approvalstate;
	}

	public void setApprovalstate(Approvalstate approvalstate) {
		this.approvalstate = approvalstate;
	}

	public double getApprovalnum() {
		return approvalnum;
	}

	public void setApprovalnum(double approvalnum) {
		this.approvalnum = approvalnum;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Approval(int uid, double approvalnum, String reason) {
		super();
		this.uid = uid;
		this.approvalnum = approvalnum;
		this.reason = reason;
	}

	public Approval(double approvalnum, String reason) {
		super();
		this.approvalnum = approvalnum;
		this.reason = reason;
	}
	
	
}
