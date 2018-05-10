package com.le.isell.service.impl;


import com.le.isell.dao.CartDao;
import com.le.isell.entity.CartModel;
import com.le.isell.entity.CartQueryModel;
import com.le.isell.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartServiceImpl extends BaseServiceImpl<CartModel,CartQueryModel> implements CartService {
	private CartDao cartDao = null;

	@Autowired
	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
		super.setDao(cartDao);
	}

}