package org.studylab.springbootreact.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Class WebMvcConfig
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
//@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

  public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("/").setViewName("redirect:/index.html");
    registry.addViewController("/login/form").setViewName("login");
  }

  @Override
  public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/static/**")
            .addResourceLocations("/static/")
            .setCachePeriod(31_556_926)
    ;
  }
}
