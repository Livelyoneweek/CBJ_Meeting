package fighting.cbj_meeting.service;

import fighting.cbj_meeting.dto.CommentUpdateDto;
import fighting.cbj_meeting.model.Comment;
import fighting.cbj_meeting.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final CommentRepository commentRepository;
    // 댓글 업데이트 함수
    @Transactional
    public Long update(Long id, CommentUpdateDto requestDto) {
        Comment comment = commentRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        comment.update(requestDto);
        return comment.getId();
    }
}