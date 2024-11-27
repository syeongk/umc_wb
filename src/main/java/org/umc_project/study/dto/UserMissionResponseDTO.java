package org.umc_project.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.umc_project.study.domain.enums.MissionStatus;

public class UserMissionResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class progressResultDTO{
        Long userId;
        Long missionId;
        MissionStatus missionStatus;

    }
}
