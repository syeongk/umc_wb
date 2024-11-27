package org.umc_project.study.converter;

import lombok.RequiredArgsConstructor;
import org.umc_project.study.domain.Review;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.domain.User;
import org.umc_project.study.dto.ReviewRequestDTO;
import org.umc_project.study.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class ShopConverter {

    public static ReviewResponseDTO toReviewResultDTO(Review review){
        return ReviewResponseDTO.builder()
                .reviewId(review.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Review toReview(ReviewRequestDTO request, Shop shop, User user){
        return Review.builder()
                .rating(request.getRating())
                .content(request.getContent())
                .reviewReply(null)
                .shop(shop)
                .user(user)
                .reviewImageList(null)
                .build();

    }
}
