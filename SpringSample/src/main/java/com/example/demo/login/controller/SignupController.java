package com.example.demo.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.login.domain.model.SignupForm;

@Controller
public class SignupController {
    // ラジオボタンの実装
    private Map<String, String> radioMarriage;
    // ラジオボタンの初期化メソッド
    private Map<String, String> initRadioMarriage() {
        Map<String, String> radio = new LinkedHashMap<>();
        // 既婚、未婚をMapに格納
        radio.put("既婚", "true");
        radio.put("未婚", "false");

        return radio;
    }

    // ユーザー登録画面のGET用コントローラー
    @GetMapping("/signup")
    // 引数のフォームクラスに@ModelAttributeを付けると自動でModelクラスに登録(attribute)する。
    // つまり、「model.addAttribute("SignuoForm", form)」と同じ動きをする。
    public String getSignUp(@ModelAttribute SignupForm form, Model model) {
        // ラジオボタンの初期化メソッド呼び出し
        radioMarriage = initRadioMarriage();

        // ラジオボタン用のMapをモデルに登録
        model.addAttribute("radioMarriage", radioMarriage);

        return "login/signup";
    }

    // ユーザー登録画面のPOST用コントローラー
    @PostMapping("/signup")
    // データバインド結果の受け取る為にBindingResultクラスを追加する。
    // バリデーション実施する際に@Validatedを使う。バリデチェック結果をbindingResultに格納する
    public String postSignUp(@ModelAttribute @Validated SignupForm form, BindingResult bindingResult, Model model) {
        // データバインド失敗の場合
        if (bindingResult.hasErrors()) {
            // GETリクエスト用のメソッドを呼び出してユーザー登録画面に戻る。その際にラジオボタン用の変数も初期化。
            return getSignUp(form, model);
        }
        // formの中身をコンソールに出して確認
        System.out.println(form);
        // リダイレクトすると遷移先のcontrollerクラスのメソッドが呼ばれる。この場合LoginControllerのgetLoginメソッド。
        return "redirect:/login";
    }
}
