package com.guang.controller;

import com.guang.domain.Account;
import com.guang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Guang
 * @version 1.0
 * @date 2019/11/28 9:30
 * @funtion
 */
@Controller
public class AccountController {

    @Autowired
    public IAccountService accountService;

    @RequestMapping("/account/selectAll")
    public String selectAll(Model model){
        System.out.println("controller表现层，查询所有用户");

        List<Account> list = accountService.selectAll();
        model.addAttribute("list",list);

        //在springMvc.xml文件中的视图解析器已经加了前缀后缀
        return "list";
    }
}
