package com.codeacademy.voteapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.codeacademy.voteapp.dto.VotePostDto;
import com.codeacademy.voteapp.entity.VotePost;
import com.codeacademy.voteapp.mapper.VotePostMapper;
import com.codeacademy.voteapp.repository.VotePostRepo;


public class VotePostService {
	
	@Autowired
	VotePostRepo votepostRepo;
	
	@Autowired
	VotePostMapper votepostMapper;

	public VotePostDto findVotePostById(Long id){
		
		VotePost votePost = votepostRepo.findById(id).orElse(null);
		
		VotePostDto votePostDto = votepostMapper.toDto(votePost);
		
		return votePostDto;
		
	}
	
	public List<VotePostDto> findAllVotePosts(){
		
		List<VotePost> votePost = (ArrayList<VotePost>) votepostRepo.findAll();
		
		return votepostMapper.toDtoList(votePost);
		
	}
	
	public VotePostDto createVotePost(VotePostDto votePostDto) {
		
		VotePost votePost = votepostMapper.fromDto(votePostDto);
		
		votepostRepo.save(votePost);
		
		return votepostMapper.toDto(votePost);
		
	}
	
	public VotePostDto updateVotePost(VotePostDto votePostDto) {
		
		VotePost votePost = votepostMapper.fromDto(votePostDto);
		
		votepostRepo.save(votePost);
		
		return votepostMapper.toDto(votePost);
		
	}
	
	public void deleteVotePost(Long id) {
		
		votepostRepo.deleteById(id);
		
	}
	
}
