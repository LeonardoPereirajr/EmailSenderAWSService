package com.leonardo.email_sender.application;

import com.leonardo.email_sender.adapters.EmailSenderGateway;
import com.leonardo.email_sender.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUserCase {

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailSenderGateway) {
        this.emailSenderGateway = emailSenderGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
