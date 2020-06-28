package cn.wocding.wchat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @ResponseBody
    @RequestMapping(path = "demo")
    public Object index() {
        Map<String, String> index = new HashMap<String, String>();
        index.put("demo", "wchat demo");
        return index;
    }

}
