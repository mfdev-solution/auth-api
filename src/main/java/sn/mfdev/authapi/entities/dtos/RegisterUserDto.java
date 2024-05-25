package sn.mfdev.authapi.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegisterUserDto {
    private String email;

    private String password;

    private String fullName;
}
