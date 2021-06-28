package gomes.forum.controller;

import gomes.forum.dto.PostDTO;
import gomes.forum.dto.VoteDTO;
import gomes.forum.service.PostService;
import gomes.forum.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/post")
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    VoteService voteService;

    @RequestMapping(method = RequestMethod.POST)
    public void createPost(@RequestBody PostDTO postDTO){
        postService.createPost(postDTO);
    }

    @RequestMapping(value = "/{postId}/vote", method = RequestMethod.POST)
    public void vote(@PathVariable Long postId, @RequestBody VoteDTO voteDTO){
        voteService.vote(voteDTO, postId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<PostDTO> list(){
        return postService.list();
    }

}
