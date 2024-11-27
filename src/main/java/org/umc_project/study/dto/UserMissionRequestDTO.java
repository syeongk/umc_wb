package org.umc_project.study.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.umc_project.study.domain.enums.MissionStatus;

public class UserMissionRequestDTO {

    @Getter
    public static class progressDTO{
        Long userId;
        Long missionId;
    }
}
