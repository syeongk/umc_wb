package org.umc_project.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import org.umc_project.study.domain.Food;
import org.umc_project.study.domain.Review;
import org.umc_project.study.domain.User;
import org.umc_project.study.domain.common.BaseEntity;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserFood extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id")
    private Food food;

}
