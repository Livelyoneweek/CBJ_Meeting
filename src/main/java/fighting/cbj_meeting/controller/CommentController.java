package fighting.cbj_meeting.controller;

import fighting.cbj_meeting.dto.CommentRequestDto;
import fighting.cbj_meeting.dto.CommentUpdateDto;
import fighting.cbj_meeting.model.Comment;
import fighting.cbj_meeting.repository.CommentRepository;
import fighting.cbj_meeting.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentRepository commentRepository;
    private final CommentService commentService;

    // 댓글 작성 하는 API
    @PostMapping("/islogin/comment/write")
    public Comment createComment(@RequestBody CommentRequestDto requestDto) {
        Comment comment = new Comment(requestDto);
        return commentRepository.save(comment);
    }

    // 댓글 불러오는 API
    @GetMapping("/api/comment/get/{post}")
    public List<Comment> getCommnets(@PathVariable Long post) {
        return commentRepository.findAllByPostOrderByCreatedAtDesc(post);
    }

    //  댓글 한개 조회하는 API
//    @GetMapping("/api/comments/commentOne/{id}")
//    public Optional<Comment> getDetails(@PathVariable Long id) {
//        return commentRepository.findById(id);
//    }

    // 댓글 수정하는 API
    @PutMapping("/islogin/comment/edit/{id}")
    public Long updateComment(@PathVariable Long id, @RequestBody CommentUpdateDto requestDto) {
        commentService.update(id,requestDto);
        return id;
    }

    //댓글 삭제하는  API
    @DeleteMapping("/islogin/comment/delete/{id}")
    public Long deleteComment(@PathVariable Long id) {
        commentRepository.deleteById(id);
        return id;
    }


}
