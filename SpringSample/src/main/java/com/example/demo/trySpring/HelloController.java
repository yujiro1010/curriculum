package com.example.demo.trySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Controllerクラスにアノテを付けることでDI(依存性注入)ができるようになる。
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    // GetMappingアノテーションを付けるとHTTPリクエストのGETメソッドを処理できるようになる。
    // この場合だとlocalhost:8080/helloへのGETリクエストに対する処理をgetHelloメソッドで行う。
    @GetMapping("/hello")
    public String getHello() {
        // hello.htmlに画面遷移
        return "hello";
    }
    // PostMappingアノテを付けることでPOSTメソッドで送られてきた場合の処理を行う。
    @PostMapping("/hello/response")
    // メソッドの引数にRequestParamを付けることで、画面からの入力内容を受け取れる。
    // アノテーションの引数にはhtmlのname属性の値を指定する。
    public String postRequest(@RequestParam("text1")String str, Model model) {
        // 画面から受け取った文字列をModelに登録
        // 画面から指定したキーの値を受け取れる。
        model.addAttribute("sample", str);
        // helloResponseに画面遷移
        return "helloResponse";
    }

    @PostMapping("/hello/db")
    public String postDbRequest(@RequestParam("text2")String str, Model model) {
        // Stringからintに変換
        int id = Integer.parseInt(str);

        // 1件検索
        Employee employee = helloService.findOne(id);

        // 検索結果をModelに登録
        model.addAttribute("id", employee.getEmployeeId());
        model.addAttribute("name", employee.getEmployeeName());
        model.addAttribute("age", employee.getAge());

        // helloResponseDB.htmlに画面遷移
        return "helloResponseDB";
    }
}
