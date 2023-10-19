package com.leonardo.email_sender.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
