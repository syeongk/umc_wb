package org.umc_project.study.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.umc_project.study.api.ApiResponse;
import org.umc_project.study.converter.ReviewConverter;
import org.umc_project.study.domain.Review;
import org.umc_project.study.dto.ReviewRequestDTO;
import org.umc_project.study.dto.ReviewResponseDTO;
import org.umc_project.study.service.reviewService.ReviewCommandService;

@RestController
@RequiredArgsConstructor
public class ReviewRestController {

    private final ReviewCommandService reviewCommandService;

    @PostMapping("/reviews")
    public ApiResponse<ReviewResponseDTO> review(@RequestBody @Valid ReviewRequestDTO request) {
        Review review = reviewCommandService.createReview(request, request.getUserId(), request.getShopId());
        return ApiResponse.onSuccess(ReviewConverter.toReviewResultDTO(review));
    }
}
