package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.ApprovalstateDao;
import com.chinatobacco.pojo.Account;
import com.chinatobacco.pojo.Approval;
import com.chinatobacco.pojo.Approvalstate;
import com.chinatobacco.service.ApprovalstateService;

@Service
public class ApprovalstateServiceImpl implements ApprovalstateService {
	
	
	@Autowired
	private ApprovalstateDao approvalstateDao;

	@Override
	public List<Approvalstate> selectAll() {
		List<Approvalstate> list = approvalstateDao.selectAll();
		return list;
	}

	@Override
	public Approvalstate selectOne(int apstaid) {
		Approvalstate approvalstate = approvalstateDao.selectOne(apstaid);
		return approvalstate;
	}

	@Override
	public boolean add(Approvalstate approvalstate) {
		return approvalstateDao.add(approvalstate)> 0 ? true : false;
	}

	@Override
	public boolean delete(int[] apstaid) {
		return approvalstateDao.delete(apstaid)> 0 ? true : false;
	}

	@Override
	public boolean update(Approvalstate approvalstate) {
		return approvalstateDao.update(approvalstate)> 0 ? true : false;
	}

}
