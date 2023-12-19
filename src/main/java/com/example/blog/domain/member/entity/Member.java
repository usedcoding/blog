package com.example.blog.domain.member.entity;

import com.example.blog.global.jpa.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Comment;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
public class Member extends BaseEntity {
    //DB에 comment 작성 가능한 annotation
    @Comment("유저 아이디")
    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String nickname;

    private String email;

    private String password;

    //private Boolean isActive;


}