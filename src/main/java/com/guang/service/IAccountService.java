package com.guang.service;

import com.guang.domain.Account;

import java.util.List;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/26 19:46
 * @funtion
 */
public interface IAccountService {
    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> selectAll();

    /**
     * 插入保存所有数据，保存账户信息
     * @param account
     */
    public void save(Account account);
}
