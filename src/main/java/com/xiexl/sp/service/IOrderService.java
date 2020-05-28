package com.xiexl.sp.service;

import com.xiexl.sp.model.Orders;
import com.xiexl.sp.model.Users;

public interface IOrderService {
     void addOrder(Orders orders, Users users);
}