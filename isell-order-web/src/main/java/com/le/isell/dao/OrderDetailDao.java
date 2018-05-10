package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.OrderDetailModel;
import com.le.isell.entity.OrderDetailQueryModel;

@Repository
public interface OrderDetailDao extends BaseDao<OrderDetailModel,OrderDetailQueryModel>{
	
}
