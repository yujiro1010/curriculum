package com.example.demo.trySpring;

import lombok.Data;

// @Dataを付けるとgetterやsetterなどを自動で生成してくれる。SpringではなくLombokの機能。開発時のちょっとした仕様変更に
// すぐ対応できて便利。他にも色々機能がある。
@Data
// ドメインクラス。リポジトリークラスやサービスクラスなどの間で渡すクラスのこと。DTO(Data Transfer Object)ともいう。
public class Employee {
    private int employeeId; // 従業員ID
    private String employeeName; // 従業員名
    private int age; // 年齢
}
