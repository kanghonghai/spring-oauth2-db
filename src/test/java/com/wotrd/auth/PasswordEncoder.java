package com.wotrd.auth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Slf4j
public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        log.info("secret:  "+encoder.encode("123456"));
    }

}
