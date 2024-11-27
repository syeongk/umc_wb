package org.umc_project.study.service.missionService;

import org.umc_project.study.domain.Mission;
import org.umc_project.study.dto.MissionRequestDTO;

public interface MissionCommandService {

    Mission addMission(MissionRequestDTO request, Long shopId);
}
