package com.example.membernacosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/7/7 11:41
 */
@RestController
@RequestMapping("config")
public class NacosConfigClientController {

    /*
     * 1. client 会拉去nacos server 配置中心的 member-nacos-config-client-dev.yaml 配置文件。
     * 2. config:
     *      ip: "122.22.22.22"
     *      name: "RainbowJier"
     * 3. @Value("${config.ip}") 会将config.ip 赋值给configIp。
     *
     * */
    @Value("${config.ip}")
    private String configIp;

    @Value("${config.name}")
    private String name;


    @GetMapping("getIp")
    public String getConfigIp() {
        return configIp;
    }
}
