package com.example.TestBoot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DruidRepository extends JpaRepository<DruidEntity, Integer> {
}
