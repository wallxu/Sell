package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.StoreModel;
import com.le.isell.entity.StoreQueryModel;

@Repository
public interface StoreDao extends BaseDao<StoreModel,StoreQueryModel>{
	
}
