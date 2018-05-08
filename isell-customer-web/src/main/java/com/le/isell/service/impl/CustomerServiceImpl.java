package com.le.isell.service.impl;

import com.le.isell.dao.CustomerDao;
import com.le.isell.entity.CustomerModel;
import com.le.isell.entity.CustomerQueryModel;
import com.le.isell.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2018/5/7.
 */
@Service
@Transactional
public class CustomerServiceImpl extends BaseServiceImpl<CustomerModel, CustomerQueryModel> implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

    @Override
    public CustomerModel getByCustomerId(String customerId) {
        return customerDao.getByCustomerId(customerId);
    }
}
