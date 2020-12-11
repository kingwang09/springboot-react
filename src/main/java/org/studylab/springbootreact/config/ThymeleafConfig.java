package org.studylab.springbootreact.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import java.util.HashSet;

/**
 * @Class ThymeleafConfig
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
@Configuration
public class ThymeleafConfig {

//  @Bean
//  public ServletContextTemplateResolver templateResolver() {
//    ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
//    resolver.setPrefix("classpath:/templates/");
//    resolver.setSuffix(".html");
//    resolver.setTemplateMode("HTML5");
//    resolver.setCacheable(false);
//    resolver.setOrder(1);
//    return resolver;
//  }
//
//  @Bean
//  public SpringTemplateEngine templateEngine(final ServletContextTemplateResolver templateResolver) {
//    SpringTemplateEngine engine = new SpringTemplateEngine();
//    engine.setTemplateResolver(templateResolver);
//    return engine;
//  }
//
//  @Bean
//  public ThymeleafViewResolver thymeleafViewResolver(final SpringTemplateEngine templateEngine) {
//    ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//    resolver.setTemplateEngine(templateEngine);
//    return resolver;
//  }
}
