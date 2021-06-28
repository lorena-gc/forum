package gomes.forum.service;

import gomes.forum.dto.PostDTO;
import gomes.forum.enumerated.Type;
import gomes.forum.model.Post;
import gomes.forum.repository.PostRepository;
import gomes.forum.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    VoteRepository voteRepository;

    public void createPost(PostDTO postDTO){
        postDTO.setCreatedDate(new Date());
        postRepository.save(PostDTO.toPost(postDTO));
    }
    public List<PostDTO> list(){
        List<PostDTO> listDTO = new ArrayList<>();
        for (Post post : postRepository.findAll()) {
            PostDTO dto = PostDTO.toDTO(post);
            dto.setCountUpVote(voteRepository.countVote(post.getId(), Type.UP));
            dto.setCountDownVote(voteRepository.countVote(post.getId(), Type.DOWN));

            listDTO.add(dto);
        }
        return listDTO;
    }
}
