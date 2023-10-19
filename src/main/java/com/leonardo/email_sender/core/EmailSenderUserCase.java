package com.leonardo.email_sender.core;

public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
