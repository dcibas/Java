package com.codeacademy.voteapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeacademy.voteapp.dto.ResultsDto;
import com.codeacademy.voteapp.entity.Results;
import com.codeacademy.voteapp.mapper.ResultsMapper;
import com.codeacademy.voteapp.repository.ResultsRepo;

@Service
public class ResultsService {

	
	@Autowired
	ResultsRepo resultsRepo;
	
	@Autowired
	ResultsMapper resultsMapper;
	
	
	public ResultsDto findById(Long id){
		
		Results result = resultsRepo.findById(id).orElse(null);
		
		ResultsDto resultsDto = resultsMapper.toDto(result);
		
		return resultsDto;
		
	}
	
	public List<ResultsDto> findAllResults(){
		
		List<Results> result = (ArrayList<Results>) resultsRepo.findAll();
		
		return resultsMapper.toDtoList(result);
		
	}
	
	public ResultsDto createResult(ResultsDto resultsDto) {
		
		Results result = resultsMapper.fromDto(resultsDto);
		
		resultsRepo.save(result);
		
		return resultsMapper.toDto(result);
		
	}
	
	public ResultsDto updateResult(ResultsDto resultsDto) {
		
		Results result = resultsMapper.fromDto(resultsDto);
		
		resultsRepo.save(result);
		
		return resultsMapper.toDto(result);
		
	}
	
	public void deleteResult(Long id) {
		
		resultsRepo.deleteById(id);
		
	}
	
}
