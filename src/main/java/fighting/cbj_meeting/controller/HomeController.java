package fighting.cbj_meeting.controller;

import fighting.cbj_meeting.dto.UserRoleEnum;
import fighting.cbj_meeting.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //홈페이지 이동 API
    @GetMapping("/")
    public String moveIndex (Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        if(userDetails ==null) {
            return "index";
        }else {
            if (userDetails.getUser().getRole() == UserRoleEnum.ADMIN) {
                model.addAttribute("admin_role",true);
                model.addAttribute("username", userDetails.getUsername());
                return "index";
            }

            model.addAttribute("username", userDetails.getUsername());
            return "index";
        }
    }

    @GetMapping("/move/history")
    public String moveCBJ () {
        return "History";
    }

    @GetMapping("/move/member")
    public String moveCBJ2 () {
        return "Member";
    }


    @GetMapping("/move/join")
    public String moveCBJ3 () {
        return "Join";
    }


    @GetMapping("/move/noticeboard")
    public String noticeboard (Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        if(userDetails ==null) {
            return "NoticeBoard";
        }else {
            if (userDetails.getUser().getRole() == UserRoleEnum.ADMIN) {
                model.addAttribute("admin_role",true);
                model.addAttribute("username", userDetails.getUsername());
                return "NoticeBoard";
            }

            model.addAttribute("username", userDetails.getUsername());
            return "NoticeBoard";
        }

    }

    @GetMapping("/move/noticeboarddetail")
    public String noticeboarddetail (Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {

        if(userDetails ==null) {
            return "NoticeBoardDetail";
        }else {
            if (userDetails.getUser().getRole() == UserRoleEnum.ADMIN) {
                model.addAttribute("admin_role",true);
                model.addAttribute("username", userDetails.getUsername());
                return "NoticeBoardDetail";
            }

            model.addAttribute("username", userDetails.getUsername());
            return "NoticeBoardDetail";
        }

    }

}