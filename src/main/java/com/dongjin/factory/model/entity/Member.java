package com.dongjin.factory.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.Comment;

import java.time.ZonedDateTime;

@Entity
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Comment("PK")
    private Long id;

    @Column(unique = true)
    @Comment("로그인 아이디")
    @NotNull
    private String username; // auth id

    @Comment("로그인 비밀번호")
    private String password;

    @Comment("생성 일시")
    @NotNull
    private ZonedDateTime created;
    @Comment("수정자")
    @NotNull
    private Long modifier;
    @Comment("수정 일시")
    @NotNull
    private ZonedDateTime modified;

    @Comment("수정 일시")
    @NotNull
    private String roles;
}
