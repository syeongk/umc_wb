package org.umc_project.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.umc_project.study.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
