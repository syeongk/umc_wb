package org.umc_project.study.converter;

import lombok.RequiredArgsConstructor;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.Review;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.domain.User;
import org.umc_project.study.dto.MissionRequestDTO;
import org.umc_project.study.dto.MissionResponseDTO;
import org.umc_project.study.dto.ReviewRequestDTO;
import org.umc_project.study.dto.ReviewResponseDTO;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class MissionConverter {
    public static MissionResponseDTO toMissionResultDTO(Mission mission){
        return MissionResponseDTO.builder()
                .missionId(mission.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Mission toMission(MissionRequestDTO request, Shop shop){
        return Mission.builder()
                .content(request.getContent())
                .duration(request.getDuration())
                .successCriteria(request.getSuccessCriteria())
                .point(request.getPoint())
                .shop(shop)
                .build();

    }
}
