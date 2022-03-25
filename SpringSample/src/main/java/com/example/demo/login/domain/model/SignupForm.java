package com.example.demo.login.domain.model;

import java.util.Date;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
    @NotBlank // 必須入力
    @Email // メールアドレス形式
    private String userId;
    @NotBlank
    @Length(min = 4, max = 100) // 長さ４桁から１００桁まで
    @Pattern(regexp = "^[a-zA-Z0-9]+$") // 半角英数字のみ
    private String password;
    @NotBlank
    private String userName;
    // @DateTimeFormatを付けることで画面から渡されてきた文字列を日付型に変換。pattern属性にどんなフォーマットでデータが渡されてくるかを指定。
    @DateTimeFormat(pattern = "yy/MM/dd")
    @NotNull // 必須入力
    private Date birthday;
    @Min(20) // 値が20から100まで
    @Max(100)
    private int age;
    @AssertFalse // falseのみ可能
    private boolean marriage;
}
