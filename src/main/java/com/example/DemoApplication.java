package com.example;

import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    public ServletRegistrationBean<StatViewServlet> druidStatViewServlet() {
//        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
////        registrationBean.addInitParameter("allow", "127.0.0.1");// IP白名单 (没有配置或者为空，则允许所有访问)
//        registrationBean.addInitParameter("deny", "");// IP黑名单 (存在共同时，deny优先于allow)
//        registrationBean.addInitParameter("loginUsername", "root");
//        registrationBean.addInitParameter("loginPassword", "1234");
//        registrationBean.addInitParameter("resetEnable", "false");
//        return registrationBean;
//    }
}
