package com.RIVINE.service;

import com.RIVINE.exception.ProductException;
import com.RIVINE.modal.Cart;
import com.RIVINE.modal.CartItem;
import com.RIVINE.modal.User;
import com.RIVINE.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
