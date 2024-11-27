package org.umc_project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umc_project.study.domain.Mission;

public interface MissionRepository extends JpaRepository<Mission, Long>{
}
