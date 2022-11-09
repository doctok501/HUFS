package com.example.simplejpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "m_id")
    private Long id;
    private String m_name;
    private String m_password;
    private String m_email;

}
