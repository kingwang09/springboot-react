package org.studylab.springbootreact.login.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.studylab.springbootreact.login.constant.UserRole;
import org.studylab.springbootreact.login.model.User;

/**
 * @Class SpringSecurityUserContext
 * @Description
 * @Author hyungeun.jin
 * @Since 2020. 12. 16.
 * @Version 1.0
 * @COPYRIGHT © WADIZ ALL RIGHTS RESERVED.
 * ------------------------------------------------------------------------
 * Modification Information
 * ------------------------------------------------------------------------
 * 수정일 || 수정자 || 수정내용
 * ------------------------------------------------------------------------
 * 2020. 12. 16. || 진형은 || 최초생성
 */
@Slf4j
@Service
public class SpringSecurityUserContext implements UserContext{
  @Override
  public User getCurrentUser() {
    SecurityContext context = SecurityContextHolder.getContext();
    Authentication authentication = context.getAuthentication();
    if(authentication == null) {
      return null;
    }
    String email = authentication.getName();//email

    return User.builder()
            .userName(email)
            .role(UserRole.USER)//authentication에서 role은 무엇인지?
            .build();
  }

  @Override
  public void setCurrentUser(User user) {
    //throw new RuntimeException("아직 구현되지 않았습니다...");
    throw new UnsupportedOperationException("아직 미구현되었음..");
  }
}
