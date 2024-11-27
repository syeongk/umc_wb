package org.umc_project.study.converter;

import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.domain.User;
import org.umc_project.study.domain.mapping.UserMission;
import org.umc_project.study.domain.mapping.UserMission;
import org.umc_project.study.dto.MissionRequestDTO;
import org.umc_project.study.dto.MissionResponseDTO;
import org.umc_project.study.dto.UserMissionRequestDTO;
import org.umc_project.study.dto.UserMissionResponseDTO;

import java.time.LocalDateTime;

public class UserMissionConverter {
    public static UserMissionResponseDTO.progressResultDTO toUserMissionResultDTO(UserMission userMission){
        return UserMissionResponseDTO.progressResultDTO.builder()
                .userId(userMission.getUser().getId())
                .missionId(userMission.getMission().getId())
                .missionStatus(userMission.getStatus())
                .build();
    }

    public static UserMission toUserMission(UserMissionRequestDTO.progressDTO request, User user, Mission mission){
        return UserMission.builder()
                .user(user)
                .mission(mission)
                .build();

    }
}
