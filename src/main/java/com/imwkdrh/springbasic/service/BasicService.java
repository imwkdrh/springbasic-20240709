package com.imwkdrh.springbasic.service;

import org.springframework.http.ResponseEntity;

import com.imwkdrh.springbasic.service.implement.BasicServiceImplement;

public interface BasicService {
    ResponseEntity<String> getService();
}
