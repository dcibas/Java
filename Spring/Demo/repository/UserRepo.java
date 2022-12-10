package com.example.demo.com.example.demo.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.com.example.demo.dto.UserDto;
import com.example.demo.com.example.demo.entity.Student;
import com.example.demo.com.example.demo.entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
	
}
