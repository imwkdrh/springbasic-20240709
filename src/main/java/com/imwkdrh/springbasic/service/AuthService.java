package com.imwkdrh.springbasic.service;

import com.imwkdrh.springbasic.dto.PostUserRequestDto;
import com.imwkdrh.springbasic.dto.SignInRequestDto;

public interface AuthService {
    String signUp(PostUserRequestDto dto);

    String signIn(SignInRequestDto dto);
}