package com.bcd.springjwt.aggregate;

import jakarta.persistence.*;
import lombok.*;

@ToString
@NoArgsConstructor
@Getter
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;

    private String password;

    private String role;

    @Builder
    public UserEntity(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void savePassword(String password) {
        this.password = password;
    }

    public void setRoleAdmin() {
        this.role = "ROLE_ADMIN";
    }
}
