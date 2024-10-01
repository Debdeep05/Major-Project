package com.RIVINE.service;

import com.RIVINE.exception.CartItemException;
import com.RIVINE.exception.UserException;
import com.RIVINE.modal.Cart;
import com.RIVINE.modal.CartItem;
import com.RIVINE.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
