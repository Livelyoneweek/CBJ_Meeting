package fighting.cbj_meeting.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto {
    private String userid;
    private Long post;
    private String contents;

}
