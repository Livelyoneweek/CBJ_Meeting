package fighting.cbj_meeting.controller;

import fighting.cbj_meeting.dto.ChatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class ChattingController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message")
    @SendTo("/topic/message")
    public ChatDto chatting(ChatDto chatDto) throws Exception {
        Thread.sleep(100); // simulated delay
        return chatDto;
    }


//    @MessageMapping("/hello2")
//    public void greeting2(HelloMessage message) throws Exception {
//        Thread.sleep(100); // simulated delay
//        simpMessagingTemplate.convertAndSend("/queue/message2"  ,message.getName());
//
//    }



}
