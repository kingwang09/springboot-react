package org.studylab.springbootreact.login.model;

import lombok.*;
import org.studylab.springbootreact.login.constant.UserRole;

/**
 * @Class User
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
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private String userName;
  private UserRole role;
}
