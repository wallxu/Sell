package com.le.isell.service.impl;


import com.le.isell.dao.StoreDao;
import com.le.isell.entity.StoreModel;
import com.le.isell.entity.StoreQueryModel;
import com.le.isell.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StoreServiceImpl extends BaseServiceImpl<StoreModel,StoreQueryModel> implements StoreService {
	private StoreDao storeDao = null;

	@Autowired
	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
		super.setDao(storeDao);
	}
}