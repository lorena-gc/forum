package gomes.forum.dto;

import gomes.forum.model.Post;

import java.util.Date;

public class PostDTO {
    private Long id;
    private String content;
    private Date createdDate;
    private Long countUpVote;
    private Long countDownVote;

    public Long getCountUpVote() {
        return countUpVote;
    }

    public void setCountUpVote(Long countUpVote) {
        this.countUpVote = countUpVote;
    }

    public Long getCountDownVote() {
        return countDownVote;
    }

    public void setCountDownVote(Long countDownVote) {
        this.countDownVote = countDownVote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public static Post toPost(PostDTO dto){
        Post post = new Post();
        post.setId(dto.getId());
        post.setContent(dto.getContent());
        post.setCreatedDate(dto.getCreatedDate());
        return post;
    }

    public static PostDTO toDTO(Post post){
        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        dto.setContent(post.getContent());
        dto.setCreatedDate(post.getCreatedDate());
        return dto;
    }
}
