package com.tx;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestService {
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void test1(){
        accountService.transferMoney(1,2,500.0);
    }
}
