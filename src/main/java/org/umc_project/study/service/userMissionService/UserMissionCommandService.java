package org.umc_project.study.service.userMissionService;

import org.umc_project.study.domain.mapping.UserMission;
import org.umc_project.study.dto.UserMissionRequestDTO;

public interface UserMissionCommandService {
    UserMission progressMission(UserMissionRequestDTO.progressDTO request, Long userId, Long missionId);
}
