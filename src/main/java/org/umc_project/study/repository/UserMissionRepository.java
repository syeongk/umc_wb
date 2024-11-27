package org.umc_project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umc_project.study.domain.User;
import org.umc_project.study.domain.mapping.UserMission;

public interface UserMissionRepository extends JpaRepository<UserMission, Long> {
}
