package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.CartModel;
import com.le.isell.entity.CartQueryModel;

@Repository
public interface CartDao extends BaseDao<CartModel,CartQueryModel>{
	
}
