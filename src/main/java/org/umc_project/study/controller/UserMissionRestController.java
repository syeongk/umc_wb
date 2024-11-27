package org.umc_project.study.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.umc_project.study.api.ApiResponse;
import org.umc_project.study.converter.MissionConverter;
import org.umc_project.study.converter.UserMissionConverter;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.mapping.UserMission;
import org.umc_project.study.dto.MissionRequestDTO;
import org.umc_project.study.dto.MissionResponseDTO;
import org.umc_project.study.dto.UserMissionRequestDTO;
import org.umc_project.study.dto.UserMissionResponseDTO;
import org.umc_project.study.service.missionService.MissionCommandService;
import org.umc_project.study.service.userMissionService.UserMissionCommandService;

@RestController
@RequiredArgsConstructor
public class UserMissionRestController {
    private final UserMissionCommandService userMissionCommandService;

    @PostMapping("/missions/in-progress")
    public ApiResponse<UserMissionResponseDTO.progressResultDTO> mission(
            @RequestBody @Valid UserMissionRequestDTO.progressDTO request) {
        UserMission userMission = userMissionCommandService.progressMission(request, request.getUserId(), request.getMissionId());
        return ApiResponse.onSuccess(UserMissionConverter.toUserMissionResultDTO(userMission));
    }
}
