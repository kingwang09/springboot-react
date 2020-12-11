package org.studylab.springbootreact.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Class HelloController
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
@RequestMapping("/greeting")
public class GreetingController {

  @GetMapping(value="")
  public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    model.addAttribute("name", name);
    return "greeting";
  }
}
