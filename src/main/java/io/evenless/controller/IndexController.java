package io.evenless.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rodrigodearkor on 10/13/14.
 */

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {

        return "index";
    }
}
