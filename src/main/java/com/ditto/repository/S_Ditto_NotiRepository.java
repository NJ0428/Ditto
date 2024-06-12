package com.ditto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.ditto.entity.S_Ditto_NotiEntity;



public interface S_Ditto_NotiRepository extends JpaRepository<S_Ditto_NotiEntity, Long>, QuerydslPredicateExecutor<S_Ditto_NotiEntity>{
	
	
}
