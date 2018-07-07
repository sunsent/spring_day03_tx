package com.service;

import com.dao.AccountDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountServiceImpl implements AccountService {
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private AccountDao accountDao;
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED,readOnly = false)
    public void transferMoney(Integer from, Integer to, Double money) {
        //对转账者减钱
        accountDao.decreaseMoney(from,money);
        //int i=1/0;
        //对收账者加钱
        accountDao.increaseMoney(to,money);
    }
}
