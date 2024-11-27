package org.umc_project.study.service.reviewService;

import org.umc_project.study.domain.Review;
import org.umc_project.study.dto.ReviewRequestDTO;

public interface ReviewCommandService {

    Review createReview(ReviewRequestDTO request, Long shopId, Long userId);

}
