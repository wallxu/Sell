package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.OrderModel;
import com.le.isell.entity.OrderQueryModel;

@Repository
public interface OrderDao extends BaseDao<OrderModel,OrderQueryModel>{
	
}
