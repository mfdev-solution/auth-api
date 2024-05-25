package sn.mfdev.authapi.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
public class LoginUserDto {

    private String email;

    private String password;

}
