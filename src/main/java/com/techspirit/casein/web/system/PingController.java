package com.techspirit.casein.web.system;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @CrossOrigin
    @GetMapping(value = "/ping")
    public ResponseEntity<?> read () {
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
}
