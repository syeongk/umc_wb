package org.umc_project.study.service.reviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.umc_project.study.api.code.status.ErrorStatus;
import org.umc_project.study.api.exception.handler.ShopHandler;
import org.umc_project.study.api.exception.handler.UserHandler;
import org.umc_project.study.converter.ReviewConverter;
import org.umc_project.study.domain.Review;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.domain.User;
import org.umc_project.study.dto.ReviewRequestDTO;
import org.umc_project.study.repository.ReviewRepository;
import org.umc_project.study.repository.ShopRepository;
import org.umc_project.study.repository.UserRepository;


@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final ShopRepository shopRepository;

    @Override
    @Transactional
    public Review createReview(ReviewRequestDTO request, Long shopId, Long userId){

        Shop shop = shopRepository.findById(shopId).orElseThrow(() -> new ShopHandler(ErrorStatus.SHOP_NOT_FOUND));
        User user = userRepository.findById(userId).orElseThrow(() -> new UserHandler(ErrorStatus.USER_NOT_FOUND));

        Review review = ReviewConverter.toReview(request, shop, user);
//        review.setShop(shop);
//        review.setUser(user);
//        review.setReviewImages(reviewImages);

        return reviewRepository.save(review);
    }

}
