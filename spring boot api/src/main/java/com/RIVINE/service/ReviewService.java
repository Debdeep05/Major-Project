package com.RIVINE.service;

import java.util.List;

import com.RIVINE.exception.ProductException;
import com.RIVINE.modal.Review;
import com.RIVINE.modal.User;
import com.RIVINE.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
