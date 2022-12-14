package com.codeacademy.voteapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.codeacademy.voteapp.entity.VotePost;

public interface VotePostRepo extends CrudRepository<VotePost, Long> {
	
	

}
