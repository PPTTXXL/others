package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ApprovalDao;
import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Approval;
import com.chinatobacco.service.ApprovalService;
@Service
public class ApprovalServiceImpl implements ApprovalService {
	
	
    @Autowired
    private ApprovalDao approvalDao;
     
	@Override
	public List<Approval> selectAll() {
		List<Approval> list = approvalDao.selectAll();
		return list;
	}

	@Override
	public Approval selectOne(int approvalid) {
		Approval approval = approvalDao.selectOne(approvalid);
		return approval;
	}

	@Override
	public List<Approval> selectByUid(int uid) {
		List<Approval> list = approvalDao.selectByUid(uid);
		return list;
	}

	@Override
	public List<Approval> selectQuery(Approval approval) {
		List<Approval> list = approvalDao.selectQuery(approval);
		return list;
	}

	@Override
	public boolean add(Approval approval) {
		return approvalDao.add(approval)> 0 ? true : false;
	}

	@Override
	public boolean delete(int[] approvalid) {
		return approvalDao.delete(approvalid)> 0 ? true : false;
	}

	@Override
	public boolean update(Approval approval) {
		return approvalDao.update(approval)> 0 ? true : false;
	}

}
