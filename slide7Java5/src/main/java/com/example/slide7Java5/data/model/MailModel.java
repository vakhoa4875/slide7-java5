package com.example.slide7Java5.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailModel {
    @Value("${spring.mail.username}")
    String from = "ehehe@gmail.com";
    String to = "vakhoa4875@gmail.com";
    String subject = "Hello World!";
    String body = "Hello World!!!";
    List<String> cc = new ArrayList<>();
    List<String> bcc = new ArrayList<>();
    List<File> files = new ArrayList<>();

    public MailModel(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }
}
