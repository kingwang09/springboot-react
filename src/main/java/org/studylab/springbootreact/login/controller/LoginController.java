package org.studylab.springbootreact.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Class LoginController
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 12. 11.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 12. 11. || 진형은 || 최초생성
 */
@Controller
@RequestMapping("/login")
public class LoginController {
  @GetMapping("/form")
  public String loginForm(){
    return "login";
  }
}
