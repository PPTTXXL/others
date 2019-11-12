package com.chinatobacco.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinatobacco.dao.AccountDao;
import com.chinatobacco.pojo.Account;
import com.chinatobacco.service.AccountService;

    @Service
    public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;

	@Override
	public List<Account> selectAll() {
		List<Account> list = accountDao.selectAll();
		return list;
	}

	@Override
	public Account selectOne(int accid) {
		Account account = accountDao.selectOne(accid);
		return account;
	}

	@Override
	public boolean add(Account Account) {
		return accountDao.add(Account) > 0 ? true : false;
	}

	@Override
	public boolean delete(int accid) {
		return accountDao.delete(accid) > 0 ? true : false;
	}

	@Override
	public boolean update(Account Account) {
		return accountDao.update(Account) > 0 ? true : false;
	}

}
