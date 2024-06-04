package com.example.slide7Java5.common.impl;

import com.example.slide7Java5.common.CommonService;
import com.example.slide7Java5.data.model.MailModel;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CommonServiceImpl implements CommonService {
    private final JavaMailSender mailSender;

    @Override
    public void sendMail(MailModel mailModel) throws Exception {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
        helper.setTo(mailModel.getTo());
        helper.setFrom(mailModel.getFrom());
        helper.setSubject(mailModel.getSubject());
        helper.setText(mailModel.getBody());
        helper.setReplyTo(mailModel.getFrom());
        mailSender.send(message);
    }
}
