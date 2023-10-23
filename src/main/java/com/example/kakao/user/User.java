package com.example.kakao.user;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="user_tb")
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false, unique = true)
    private String username; // 인증시 필요한 필드
    @Column(length = 256, nullable = false)
    private String password;
    @Column(length = 45, nullable = false)
    private String userPicUrl;
    private String location;

    @Builder
    public User(int id, String username, String password, String userPicUrl, String location) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userPicUrl = userPicUrl;
        this.location = location;
    }

}
