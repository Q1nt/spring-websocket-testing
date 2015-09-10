package base.controller;

import base.model.Message;
import base.model.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author sol
 * @since 10.09.15.
 */
@Controller
@RequestMapping("/")
public class ChatController {

    @RequestMapping
    public String viewApp() {
        return "index";
    }

    @MessageMapping("/chat")
    @SendTo("/topic/message")
    public OutputMessage sendMessage(Message message) {
        OutputMessage outputMessage = new OutputMessage();
        outputMessage.setMessage(message.getMessage());
        outputMessage.setId(message.getId());
        outputMessage.setDate(new Date());
        return outputMessage;
    }
}
