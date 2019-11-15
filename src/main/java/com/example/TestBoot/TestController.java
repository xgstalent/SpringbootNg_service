package com.example.TestBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private DruidRepository druidRepository;

    @RequestMapping("/test1")
    public Object test1() {
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("key1", "我是key1");
        returnMap.put("key2", "我是key2");
        returnMap.put("key3", "我是key3");
        return returnMap;
    }

    @RequestMapping("/test2")
    public Object test2() {
        List<DruidEntity> all = druidRepository.findAll();
        return all;
    }

    @RequestMapping("/test3")
    public Object test3() {
        ArrayList<DruidEntity> list = new ArrayList<>();
        for (int i = 3; i < 13; i++) {
            DruidEntity entity = new DruidEntity();
            entity.setId(i);
            entity.setName(i + "name");
            entity.setAge(i);
            list.add(entity);
        }
        return druidRepository.saveAll(list);
    }

    @RequestMapping("/test4")
    public void test4() {
        druidRepository.deleteAll();
    }

}
