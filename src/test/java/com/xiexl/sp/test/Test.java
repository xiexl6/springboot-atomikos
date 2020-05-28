package com.xiexl.sp.test;

import com.xiexl.sp.App;
import com.xiexl.sp.model.Orders;
import com.xiexl.sp.model.Users;
import com.xiexl.sp.service.IOrderService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class Test {

    @Resource
    private IOrderService iOrderService;

    @org.junit.Test
    public void test(){
        Users users = new Users();
        users.setUsername("enjoy");
        users.setPasswd("123");
        users.setId(1);

        Orders orders = new Orders();
        orders.setAccount(12);
        orders.setName("apple");
        orders.setUserId(1);
        iOrderService.addOrder(orders,users);
    }


}
