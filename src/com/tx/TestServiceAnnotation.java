package com.tx;

import com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class TestServiceAnnotation {
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void test1(){
        accountService.transferMoney(1,2,500.0);
    }
}
