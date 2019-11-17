package site.pengcheng.springbootlogging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author pengchengbai
 * @description
 * @date 2019-11-17 15:20
 */
@RestController
@Slf4j
public class PingController {
    // 不打印日志
    @GetMapping("/ping")
    public String ping() {
        return "pang";
    }

    // 打印日志
    @GetMapping("pingLog")
    public String pingWithLog() {
        log.info("calling /pingLog");
        return "pangLog";
    }
}
