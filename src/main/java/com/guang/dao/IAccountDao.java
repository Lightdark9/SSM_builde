package com.guang.dao;

import com.guang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/26 19:41
 * @funtion
 */
@Repository
public interface IAccountDao {
    /**
     * 查询所有账户信息
     * @return
     */
    @Select("select * from account")
    public List<Account> selectAll();

    /**
     * 插入保存所有数据，保存账户信息
     * @param account
     */
    @Insert("insert into account (name,money) value (#{name},#{money})")
    public void save(Account account);

}
