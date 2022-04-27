package fighting.cbj_meeting.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChatDto {

    private String username;
    private String content;


    public ChatDto(String username, String content) {
        this.username = username;
        this.content = content;
    }


}
