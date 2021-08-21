package com.ike.school.demo.repository;

import com.ike.school.demo.entity.ScoreStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreStudent,Long> {

}
