package com.codeacademy.voteapp.service;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeacademy.voteapp.dto.UserVotesDto;
import com.codeacademy.voteapp.dto.VotePostDto;
import com.codeacademy.voteapp.entity.UserVotes;
import com.codeacademy.voteapp.entity.VotePost;
import com.codeacademy.voteapp.entity.VotingChoice;
import com.codeacademy.voteapp.mapper.UserVotesMapper;
import com.codeacademy.voteapp.mapper.VotePostMapper;
import com.codeacademy.voteapp.repository.UserVotesRepo;
import com.codeacademy.voteapp.repository.VotePostRepo;
import com.codeacademy.voteapp.repository.VotingChoiceRepo;

@Service
public class VotePostService {
	
	@Autowired
	UserVotesRepo userVotesRepo;
	
	@Autowired
	VotePostRepo votepostRepo;
	
	@Autowired
	VotePostMapper votepostMapper;
	
	@Autowired
	UserVotesMapper userVotesMapper;

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
	
	public UserVotesDto voteVotePost(UserVotesDto userVotesDto) {
		
		UserVotes userVote = userVotesMapper.fromDto(userVotesDto);
		
		userVotesRepo.save(userVote);
		
		return userVotesMapper.toDto(userVote);
		
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
