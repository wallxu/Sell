package com.le.isell.service.impl;


import com.le.isell.dao.OrderDao;
import com.le.isell.entity.OrderModel;
import com.le.isell.entity.OrderQueryModel;
import com.le.isell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl extends BaseServiceImpl<OrderModel,OrderQueryModel> implements OrderService {
	private OrderDao orderDao =null;

	@Autowired
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
		super.setDao(orderDao);
	}
}