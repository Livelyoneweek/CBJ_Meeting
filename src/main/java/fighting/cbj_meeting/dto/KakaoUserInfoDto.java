package fighting.cbj_meeting.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class KakaoUserInfoDto {

    private Long id;
    private String nickname;
    private String thumbnail;
    private String email;

    // @AllArgsConstructor 가 대신 생성해줌
//    public KakaoUserInfoDto (Long id, String nickname, String thumbnail, String email) {
//        this.id = id;
//        this.nickname = nickname;
//        this.thumbnail = thumbnail;
//        this.email = email;
//    }
}
