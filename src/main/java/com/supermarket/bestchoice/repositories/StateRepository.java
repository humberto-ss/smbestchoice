package com.supermarket.bestchoice.repositories;

import com.supermarket.bestchoice.domain.State;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StateRepository extends JpaRepository<State, Integer>{
    
}
