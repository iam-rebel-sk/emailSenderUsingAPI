package org.geekster;

import com.sun.mail.util.logging.MailHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIemailSystem {

    @GetMapping("email/API")
    public Email getEmail(){
        Email e1 = new Email("Hey! I'm your email body");
        MailHandlerBase.sendMail(e1.toString());
        return e1;
    }
}
