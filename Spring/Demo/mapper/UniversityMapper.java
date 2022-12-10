package com.example.demo.com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.com.example.demo.dto.UniversityDto;
import com.example.demo.com.example.demo.entity.University;
import com.example.demo.com.example.demo.service.StudentService;

@Service
public class UniversityMapper {

	@Autowired
	StudentService studentService;
	
	public UniversityDto toDto(University entity) {
		if(entity == null) {
			return null;
		}
	
		UniversityDto dto = new UniversityDto();
		dto.setId(entity.getId());
		dto.setCode(entity.getCode());
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		dto.setEstablishmentYear(entity.getEstablishmentYear());
		dto.setRating(entity.getRating());
		dto.setEmail(entity.getEmail());
		
		dto.setStudents(studentService.findStudentsByUniversityId(entity.getId()));
		
		return dto;
	
}

	public University fromDto(UniversityDto dto) {
		
		if(dto == null) {
			return null;
		}
		
		University entity = new University();
		entity.setId(dto.getId());
		entity.setCode(dto.getCode());
		entity.setName(dto.getName());
		entity.setAddress(dto.getAddress());
		entity.setEstablishmentYear(dto.getEstablishmentYear());
		entity.setRating(dto.getRating());
		entity.setEmail(dto.getEmail());
		
		return entity;
		
	}
	
	public List<UniversityDto> toDto(List<University> entities){
		
		List<UniversityDto> dtos = new ArrayList<>();
		
		for(University entity : entities) {
			dtos.add(toDto(entity));
		}
		
		return dtos;	
		
	}
	
}
