package com.imwkdrh.springbasic.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.imwkdrh.springbasic.dto.PostSample1RequestDto;
import com.imwkdrh.springbasic.service.SampleService;

@Service
public class SampleServiceImplement implements SampleService {

    @Override
    public ResponseEntity<String> postSample1(PostSample1RequestDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body("성공");
    }

}
