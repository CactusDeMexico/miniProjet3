package com.pancarte.gotham.repository;

import com.pancarte.gotham.model.Clock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("clockRepository")
public interface ClockRepository extends JpaRepository<Clock, Long> {

}
