package gomes.forum.repository;

import gomes.forum.enumerated.Type;
import gomes.forum.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoteRepository extends JpaRepository<Vote, Long>{

    @Query(value = "SELECT count(v.id) FROM Vote v WHERE v.post.id = ?1 AND v.type = ?2")
    Long countVote (Long postId, Type type);
}
