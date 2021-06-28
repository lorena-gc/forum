package gomes.forum.dto;

import gomes.forum.enumerated.Type;
import gomes.forum.model.Post;
import gomes.forum.model.Vote;

import java.util.Date;

public class VoteDTO {

    private Long id;

    private Type type;

    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public static Vote toVote(VoteDTO dto){
        Vote vote = new Vote();
        vote.setId(dto.getId());
        vote.setType(dto.getType());
        vote.setCreatedDate(dto.getCreatedDate());
        return vote;
    }
}
