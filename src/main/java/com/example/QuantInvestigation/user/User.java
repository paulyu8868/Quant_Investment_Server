package com.example.QuantInvestigation.user;

import com.example.QuantInvestigation.account.Account;
import com.example.QuantInvestigation.utils.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseTimeEntity {
    @Column
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; // 고유 식별자

    @Column(nullable = false)
    private String id; // 로그인 ID

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String appKey;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String appSecret;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String accessToken; // 증권사 Token

    @Column(nullable = false)
    private String accountNumber; // 계좌번호

    public User createUser(String id, String password, String appKey, String appSecret, String accessToken, String accountNumber) {
        this.id = id;
        this.password = password;
        this.appKey= appKey;
        this.appSecret = appSecret;
        this.accessToken = accessToken;
        this.accountNumber = accountNumber;
        return this;
    }
}
