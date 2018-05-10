package com.le.isell.service.impl;


import com.le.isell.dao.GoodsDao;
import com.le.isell.entity.GoodsModel;
import com.le.isell.entity.GoodsQueryModel;
import com.le.isell.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<GoodsModel,GoodsQueryModel> implements GoodsService {
	private GoodsDao goodsDao = null;

	@Autowired
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
		super.setDao(goodsDao);
	}
}