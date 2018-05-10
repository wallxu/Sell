package com.le.isell.dao;

import org.springframework.stereotype.Repository;

import com.le.isell.entity.GoodsModel;
import com.le.isell.entity.GoodsQueryModel;

@Repository
public interface GoodsDao extends BaseDao<GoodsModel,GoodsQueryModel>{
	
}
