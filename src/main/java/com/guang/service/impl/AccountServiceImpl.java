package com.guang.service.impl;

import com.guang.dao.IAccountDao;
import com.guang.domain.Account;
import com.guang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/26 19:49
 * @funtion
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    public IAccountDao dao;

    @Override
    public List<Account> selectAll() {
        System.out.println("Service业务层，查询所有的账户");
        return dao.selectAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("Service业务层，保存账户");
    }
}
