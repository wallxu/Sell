package com.le.isell.dao;

import com.le.isell.entity.CustomerModel;
import com.le.isell.entity.CustomerQueryModel;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerDao extends BaseDao<CustomerModel, CustomerQueryModel>{
	public CustomerModel getByCustomerId(String customerId);
}
