package com.example.blog.domain.member.entity;

import com.example.blog.global.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;
    @Column(unique = true)
    private String nickname;
    private String email;
    private String password;

    private Boolean isActive;


}