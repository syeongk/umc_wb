package org.umc_project.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.umc_project.study.domain.enums.MemberStatus;
import org.umc_project.study.domain.enums.MissionStatus;

import java.time.LocalDateTime;

public class MissionResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AddResultDTO {
        Long missionId;
        LocalDateTime createdAt;
    }

}
