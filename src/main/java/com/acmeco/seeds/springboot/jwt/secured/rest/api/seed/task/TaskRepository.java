package com.acmeco.seeds.springboot.jwt.secured.rest.api.seed.task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}