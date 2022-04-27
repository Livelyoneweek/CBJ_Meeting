package fighting.cbj_meeting.model;


import fighting.cbj_meeting.dto.CommentRequestDto;
import fighting.cbj_meeting.dto.CommentUpdateDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor // 기본생성자를 만듭니다.
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Comment extends Timestamped { // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String userid;

    @Column(nullable = false)
    private Long post;

    @Column(nullable = false)
    private String contents;


    public Comment(String userid, Long post, String contents) {
        this.userid = userid;
        this.post = post;
        this.contents = contents;

    }

    public Comment(CommentRequestDto requestDto) {
        this.userid = requestDto.getUserid();
        this.post = requestDto.getPost();
        this.contents = requestDto.getContents();

    }
    public void update(CommentUpdateDto requestDto) {

        this.contents = requestDto.getContents();
    }

}