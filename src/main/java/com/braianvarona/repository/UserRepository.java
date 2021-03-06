package com.braianvarona.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.braianvarona.entity.User;

/**
 * User Repository
 * 
 * @author Braian Varona
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findById(Long id);
}