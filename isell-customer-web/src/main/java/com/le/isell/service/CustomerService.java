package com.le.isell.service;

import com.le.isell.entity.CustomerModel;
import com.le.isell.entity.CustomerQueryModel;

/**
 * Created by Administrator on 2018/5/7.
 */
public interface CustomerService extends BaseService<CustomerModel, CustomerQueryModel> {

    public CustomerModel getByCustomerId(String customerId);
}
