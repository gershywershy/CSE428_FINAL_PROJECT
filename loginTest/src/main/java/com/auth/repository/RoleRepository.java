package com.auth.repository;

import com.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

	public interface RoleRepository extends JpaRepository<Role, Long>{
	}
