package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    // GetMappingアノテーションを付けるとHTTPリクエストのGETメソッドを処理できるようになる。
    // この場合だとlocalhost:8080/helloへのGETリクエストに対する処理をgetHelloメソッドで行う。
    @GetMapping("/hello")
    public String getHello() {
        // hello.htmlに画面遷移
        return "hello";
    }
    // PostMappingアノテを付けることでPOSTメソッドで送られてきた場合の処理を行う。
    @PostMapping("/hello")
    // メソッドの引数にRequestParamを付けることで、画面からの入力内容を受け取れる。
    // アノテーションの引数にはhtmlのname属性の値を指定する。
    public String postRequest(@RequestParam("text1")String str, Model model) {
        // 画面から受け取った文字列をModelに登録
        // 画面から指定したキーの値を受け取れる。
        model.addAttribute("sample", str);
        // helloResponseに画面遷移
        return "helloResponse";
    }
}
