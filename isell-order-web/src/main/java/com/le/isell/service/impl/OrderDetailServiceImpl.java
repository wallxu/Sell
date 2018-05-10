package com.le.isell.service.impl;


import com.le.isell.dao.OrderDetailDao;
import com.le.isell.entity.OrderDetailModel;
import com.le.isell.entity.OrderDetailQueryModel;
import com.le.isell.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderDetailServiceImpl extends BaseServiceImpl<OrderDetailModel,OrderDetailQueryModel> implements OrderDetailService {
	private OrderDetailDao orderDetailDao;

	@Autowired
	public void setOrderDetailDao(OrderDetailDao orderDetailDao) {
		this.orderDetailDao = orderDetailDao;
		super.setDao(orderDetailDao);
	}
}