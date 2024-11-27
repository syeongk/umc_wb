package org.umc_project.study.service.missionService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.umc_project.study.api.code.status.ErrorStatus;
import org.umc_project.study.api.exception.handler.ShopHandler;
import org.umc_project.study.converter.MissionConverter;
import org.umc_project.study.domain.Mission;
import org.umc_project.study.domain.Shop;
import org.umc_project.study.dto.MissionRequestDTO;
import org.umc_project.study.repository.MissionRepository;
import org.umc_project.study.repository.ShopRepository;

@Service
@RequiredArgsConstructor
public class MissionCommandServiceImpl implements MissionCommandService  {

    private final ShopRepository shopRepository;
    private final MissionRepository missionRepository;

    @Override
    @Transactional
    public Mission addMission(MissionRequestDTO request, Long shopId){
        Shop shop = shopRepository.findById(shopId).orElseThrow(() -> new ShopHandler(ErrorStatus.SHOP_NOT_FOUND));

        Mission mission = MissionConverter.toMission(request, shop);

        return missionRepository.save(mission);
    }
}
