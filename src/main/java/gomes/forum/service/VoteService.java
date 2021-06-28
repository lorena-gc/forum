package gomes.forum.service;

import gomes.forum.dto.VoteDTO;
import gomes.forum.model.Post;
import gomes.forum.model.Vote;
import gomes.forum.repository.PostRepository;
import gomes.forum.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

    @Autowired
    PostRepository postRepository;

    public void vote(VoteDTO voteDTO, Long postId){
        Post post = postRepository.getById(postId);
        voteDTO.setCreatedDate(new Date());
        Vote vote = VoteDTO.toVote(voteDTO);
        vote.setPost(post);
        voteRepository.save(vote);
    }
}
