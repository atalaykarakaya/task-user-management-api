package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Task;
import com.example.demo.enums.Priority;
import com.example.demo.enums.Status;

public interface TaskRepository extends JpaRepository<Task, Long> {
	List<Task> findByStatus(Status status);
	List<Task> findByPriority(Priority priority);
	List<Task> findByStatusAndPriority(Status status, Priority priority);
}
