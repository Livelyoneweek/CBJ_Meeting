package fighting.cbj_meeting.repository;

import fighting.cbj_meeting.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);

    List<Comment> findAllByPostOrderByCreatedAtDesc(Long post);
}
