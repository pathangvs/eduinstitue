package com.example.eventplanner.repository;

import com.example.eventplanner.model.appliedcourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface appliedRepository  extends JpaRepository<appliedcourse,Integer> {
}
