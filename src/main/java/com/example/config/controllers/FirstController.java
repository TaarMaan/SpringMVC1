package com.example.config.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {
    //при пустом запросе все сработает, но вернется null, в местах где он ожилает значение переменной
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("Hello, " + name);
        return "first/hello";
    }
    //Если не передать параметры в реквесте, то вернется ошибка. Но памяти меньше расходуется,
    //т.к. при сервлет способе используется больше памяти, так как загружается вся страница
    // чтобы этого избежать, можно добавить в @RequestParam("name", required = false), после
    // чего как и в первом способе будет возвращаться null
    @GetMapping("/goodbye")
    public String goodbyePage(@RequestParam("name")String name){
        System.out.println("Hello, " + name);
        return "first/goodbye";

    }
}
