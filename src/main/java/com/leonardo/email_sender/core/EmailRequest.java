package com.leonardo.email_sender.core;

public record EmailRequest(String to, String subject, String body) {
}