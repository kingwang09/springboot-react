package org.studylab.springbootreact.greeting.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Class GreetingController
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 12. 9.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 12. 9. || 진형은 || 최초생성
 */
@RequestMapping("/api/v1/greeting")
@RestController
public class GreetingController {

  @GetMapping("/hello")
  public HashMap greeting(){
    HashMap result = new HashMap<>();
    result.put("message", "hello springboot-react build");
    return result;
  }
}
