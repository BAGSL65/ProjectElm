package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.CartMapper;
import com.neusoft.po.Cart;
import com.neusoft.service.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private CartMapper cartmapper;
	@Override
	public List<Cart> listCart(Cart cart) {
		return cartmapper.listCart(cart);
	}
	
	@Override
	public int saveCart(Cart cart) {
		return cartmapper.saveCart(cart);
	}
	
	@Override
	public int updateCart(Cart cart) {
		return cartmapper.updateCart(cart);
	}
	
	@Override
	public int removeCart(Cart cart) {
		return cartmapper.removeCart(cart);
	}
}
