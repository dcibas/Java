package com.codeacademy.voteapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codeacademy.voteapp.entity.VotePost;

@Repository
public interface VotePostRepo extends CrudRepository<VotePost, Long> {


}
