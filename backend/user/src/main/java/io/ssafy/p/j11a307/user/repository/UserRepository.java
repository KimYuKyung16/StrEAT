package io.ssafy.p.j11a307.user.repository;

import io.ssafy.p.j11a307.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByKakaoId(Long kakaoId);

    Boolean existsByKakaoId(Long kakaoId);
}
