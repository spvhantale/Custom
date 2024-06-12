package com.swapnil.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/handle-recording")
public class MYService {

	@PostMapping
    public String handleRecording(@RequestParam("RecordingUrl") String recordingUrl) {
        System.out.println("Recording URL: " + recordingUrl);

        return "<Response><Say>Thank you for your message. Goodbye!</Say></Response>";
    }
}
