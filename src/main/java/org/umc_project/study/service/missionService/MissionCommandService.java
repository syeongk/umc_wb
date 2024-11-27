package org.umc_project.study.service.missionService;

import jakarta.validation.Valid;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.dto.MissionRequestDTO;

public interface MissionCommandService {

    Mission addMission(MissionRequestDTO.@Valid AddDTO request, Long shopId);
}
