package com.RIVINE.service;

import java.util.List;

import com.RIVINE.exception.ProductException;
import com.RIVINE.modal.Rating;
import com.RIVINE.modal.User;
import com.RIVINE.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
