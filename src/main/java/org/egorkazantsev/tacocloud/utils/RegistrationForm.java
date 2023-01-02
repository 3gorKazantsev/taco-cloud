package org.egorkazantsev.tacocloud.utils;

import lombok.Data;
import org.egorkazantsev.tacocloud.domain.User;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String fullName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(
                username,
                passwordEncoder.encode(password),
                fullName, street, city, state, zip, phone);
    }
}
