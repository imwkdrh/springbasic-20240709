package com.imwkdrh.springbasic.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter@NoArgsConstructor@AllArgsConstructor
public class SignInRequestDto {
    @NotBlank
    private String userId;
    @NotBlank
    private String password;
}
