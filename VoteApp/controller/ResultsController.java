package com.codeacademy.voteapp.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.codeacademy.voteapp.dto.ResultsDto;
import com.codeacademy.voteapp.dto.VotePostDto;
import com.codeacademy.voteapp.service.ResultsService;


@CrossOrigin(origins = {"http://localhost:5500","http://127.0.0.1:5500"})
@RestController
@RequestMapping("/api/results")
public class ResultsController {

	@Autowired
	ResultsService resultsService;
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{id}")
	public ResultsDto findById(@PathVariable(name="id") Long id) {
		
		return resultsService.findById(id);
		
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("")
	public List<ResultsDto> findAllResults() {
		
		return resultsService.findAllResults();
		
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
//	@PostMapping("")
//	public ResultsDto createResult(@Valid @RequestBody ResultsDto resultsDto) {
//		
//		return resultsService.createResult(resultsDto);
//		
//	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("")
	public ResultsDto createResult(@Valid @RequestBody VotePostDto votepostDto) throws Exception {
		
		return resultsService.createResult(votepostDto.getId());
		
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public ResultsDto updateResult(@Valid @RequestBody ResultsDto resultsDto, @PathVariable(name = "id") Long id) {
		
		return resultsService.updateResult(resultsDto);
		
	}
	
//	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public void deleteResult(@PathVariable(name = "id") Long id) {
		
		resultsService.deleteResult(id);
		
	}
	
}
