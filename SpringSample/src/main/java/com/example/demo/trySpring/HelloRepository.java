package com.example.demo.trySpring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

// @Controllerをコントローラクラスに付ける要領でレポジトリークラスにもアノテを
// 付けることでDIに登録される
@Repository
public class HelloRepository {

    // Springが用意しているJDBC用のクラス(JdbcTemplate)を使ってSELECT文を実行する。
    // @Autowiredを付けることでインスタンスを生成する。
    // @Autowiredを使わないといちいちnewを使う必要があり、@Autowiredを書くことで、他クラスとの繋がりを宣言する記述が大幅に減る
    // @Autowiredを書くことでアプリケーションの大元がクラスの繋がりを理解してつなげる処理をしてくれる。
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Map<String, Object> findOne(int id){
        String query = "SELECT"
                + " employee_id,"
                + " employee_name,"
                + " age "
                + "FROM employee "
                + "WHERE employee_id=?";
        Map<String, Object> employee = jdbcTemplate.queryForMap(query, id);

        return employee;
    }
}
