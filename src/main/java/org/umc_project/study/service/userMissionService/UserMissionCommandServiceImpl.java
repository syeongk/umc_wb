package org.umc_project.study.service.userMissionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.umc_project.study.api.code.status.ErrorStatus;
import org.umc_project.study.api.exception.handler.MissionHandler;
import org.umc_project.study.api.exception.handler.UserHandler;
import org.umc_project.study.converter.UserMissionConverter;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.User;
import org.umc_project.study.domain.mapping.UserMission;
import org.umc_project.study.dto.UserMissionRequestDTO;
import org.umc_project.study.repository.MissionRepository;
import org.umc_project.study.repository.UserMissionRepository;
import org.umc_project.study.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserMissionCommandServiceImpl implements UserMissionCommandService {
    private final UserRepository userRepository;
    private final UserMissionRepository userMissionRepository;
    private final MissionRepository missionRepository;

    @Override
    @Transactional
    public UserMission progressMission(UserMissionRequestDTO.progressDTO request, Long userId, Long missionId){
        User user = userRepository.findById(userId).orElseThrow(() -> new UserHandler(ErrorStatus.USER_NOT_FOUND));
        Mission mission = missionRepository.findById(missionId).orElseThrow(() -> new MissionHandler(ErrorStatus.MISSION_NOT_FOUND));

        UserMission userMission = UserMissionConverter.toUserMission(request, user, mission);

        return userMissionRepository.save(userMission);
    }
}
