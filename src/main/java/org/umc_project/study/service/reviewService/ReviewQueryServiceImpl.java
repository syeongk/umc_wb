package org.umc_project.study.service.reviewService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.umc_project.study.domain.Review;
import org.umc_project.study.repository.ReviewRepository;

@Service
@RequiredArgsConstructor
public class ReviewQueryServiceImpl implements ReviewQueryService {

    private final ReviewRepository reviewRepository;

    @Override
    public void createReview(Review review){
        reviewRepository.save(review);
    }
}
