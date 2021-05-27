package com.demo.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.audit.entity.Shedlock;


@Repository
public interface ShedlockRepository  extends JpaRepository<Shedlock, String>{
	

}
