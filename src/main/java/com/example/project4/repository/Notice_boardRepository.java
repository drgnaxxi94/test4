package com.example.project4.repository;


import com.example.project4.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface Notice_boardRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByCreatedBy(String email);
}
