package com.neusoft.elmboot.controller;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.elmboot.po.Cart;
import com.neusoft.elmboot.service.CartService;

@RestController
@RequestMapping("/CartController")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("/listCart")
	public List<Cart> listCart(Cart cart) throws Exception{
		return cartService.listCart(cart);
	}
	
	@Insert("insert into cart values(null,#{foodId},#{businessId},#{userId},1)")
	@RequestMapping("/saveCart")
	public int saveCart(Cart cart) throws Exception{
		return cartService.saveCart(cart);
	}
	
	@Update("update cart set quantity=#{quantity} where foodId=#{foodId} and businessId=#{businessId} and userId=#{userId}")
	@RequestMapping("/updateCart")
	public int updateCart(Cart cart) throws Exception{
		return cartService.updateCart(cart);
	}
	
	@RequestMapping("/removeCart")
	public int removeCart(Cart cart) throws Exception{
		return cartService.removeCart(cart);
	}
}
