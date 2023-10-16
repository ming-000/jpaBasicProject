package com.example.jpaspringdemo.company.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "company_id", columnDefinition = "bytea")
    private UUID companyId;
    // 매장id
    private UUID storeId;
    // 매장등록 번호
    private String storeRegisterNumber;
    // 대표자명
    private String representativeName;
    // 주소
    private String address;
    // 성세주소
    private String detailAddress;
    // 이메일
    private String email;
    // 핸드폰
    private String phoneNumber;
    // 생성날짜
    private String createDate;
}
