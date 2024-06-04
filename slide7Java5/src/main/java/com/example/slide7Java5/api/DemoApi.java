package com.example.slide7Java5.api;

import com.example.slide7Java5.common.CommonService;
import com.example.slide7Java5.data.model.MailModel;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class DemoApi {
    private final CommonService commonService;

    @PostMapping("/sendMailWithCustomBody")
    public Map<?, ?> doPostSendMailWithCustomBody(@RequestBody MailModel mailModel) {
        var resultMap = new HashMap<String, Object>();
        try {
            commonService.sendMail(mailModel);
            resultMap.put("success", true);
        } catch (Exception e) {
            resultMap.put("success", false);
            throw new RuntimeException(e);
        }
        return resultMap;
    }

    @PostMapping("/sendMail")
    public Map<?, ?> doPostSendMail() {
        var resultMap = new HashMap<String, Object>();
        try {
            commonService.sendMail(new MailModel());
            resultMap.put("success", true);
        } catch (Exception e) {
            resultMap.put("success", false);
            throw new RuntimeException(e);
        }
        return resultMap;
    }
}
