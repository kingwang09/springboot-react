package org.studylab.springbootreact.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.studylab.springbootreact.login.constant.UserRole;


/**
 * @Class SecurityConfig
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
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  public void configure(final AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder.inMemoryAuthentication()
            .withUser("hyungeun.jin@wadiz.kr")
              .password("hyungeun.jin").roles(UserRole.USER.name());
  }

  @Override
  protected void configure(final HttpSecurity httpSecurity) throws Exception {
    httpSecurity.authorizeRequests()
            .antMatchers("/static/**").permitAll()
            //.antMatchers("/").hasAnyRole(UserRole.ANONYMOUS.name(), UserRole.USER.name())
            .antMatchers("/").hasAnyRole(UserRole.USER.name())
            .antMatchers("/login/*").hasAnyRole(UserRole.ANONYMOUS.name(), UserRole.USER.name())
            .antMatchers("/logout/*").hasAnyRole(UserRole.ANONYMOUS.name(), UserRole.USER.name())
            .antMatchers("/greeting").hasAnyRole(UserRole.USER.name())
            .antMatchers("/**").hasRole("USER")
            .and()
              .formLogin()
                .loginPage("/login/form")
                .loginProcessingUrl("/login")
                .failureUrl("/login/form?error")
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/greeting")
            .and()
              .httpBasic()
            .and()
              .logout()
              .logoutUrl("/logout")
              .logoutSuccessUrl("/login?logout")
            .and()
              .csrf().disable();
  }
}
