package com.example.demo.com.example.demo.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.com.example.demo.entity.Role;
import com.example.demo.com.example.demo.enu.Roles;

@Repository
public interface RoleRepo extends CrudRepository<Role, Long> {

	Optional<Role> findByRole(Roles name);
	
}
