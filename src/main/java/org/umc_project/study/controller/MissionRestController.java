package org.umc_project.study.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.umc_project.study.api.ApiResponse;
import org.umc_project.study.converter.MissionConverter;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.dto.MissionRequestDTO;
import org.umc_project.study.dto.MissionResponseDTO;
import org.umc_project.study.service.missionService.MissionCommandService;

@RestController
@RequiredArgsConstructor
public class MissionRestController {
    
    private final MissionCommandService missionCommandService;

    @PostMapping("/missions")
    public ApiResponse<MissionResponseDTO.AddResultDTO> mission(@RequestBody @Valid MissionRequestDTO.AddDTO request) {
        Mission mission = missionCommandService.addMission(request, request.getShopId());
        return ApiResponse.onSuccess(MissionConverter.toMissionResultDTO(mission));
    }
}
