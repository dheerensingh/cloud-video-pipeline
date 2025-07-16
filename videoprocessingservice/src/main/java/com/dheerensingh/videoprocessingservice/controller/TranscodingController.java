package com.dheerensingh.videoprocessingservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Tells Spring that this class will handle web requests
@RestController
// Maps all requests starting with /api/v1 to this controller
@RequestMapping("/api/v1")
public class TranscodingController {

    // Defines a record to represent the incoming JSON data. Clean and simple.
    public record TranscodeRequest(String bucket, String key) {}

    // Maps POST requests to /api/v1/transcode to this method
    @PostMapping("/transcode")
    public ResponseEntity<String> transcodeVideo(@RequestBody TranscodeRequest request) {
        System.out.println("Received request to transcode file: " + request.key() + " from bucket: " + request.bucket());
        
        // For now, just return a success message
        return ResponseEntity.ok("Transcode request received for: " + request.key());
    }
}