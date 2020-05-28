package com.xiexl.sp.service.impl;

import com.xiexl.sp.dao.orders.OrdersMapper;
import com.xiexl.sp.dao.users.UsersMapper;
import com.xiexl.sp.model.Orders;
import com.xiexl.sp.model.Users;
import com.xiexl.sp.service.IOrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl  implements IOrderService {

    @Resource
    private UsersMapper usersMapper;

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    @Transactional
    public void addOrder(Orders orders, Users users) {
        usersMapper.insertSelective(users);
        int i = 1/0;
        ordersMapper.insertSelective(orders);
    }
}