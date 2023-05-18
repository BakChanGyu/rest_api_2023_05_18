package com.ll.rest.rest_api.boundedContext.member.repository;

import com.ll.rest.rest_api.boundedContext.member.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
}
