package org.umc_project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umc_project.study.domain.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
