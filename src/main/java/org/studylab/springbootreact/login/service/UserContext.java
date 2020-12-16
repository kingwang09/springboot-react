package org.studylab.springbootreact.login.service;

import org.studylab.springbootreact.login.model.User;

public interface UserContext {

  public User getCurrentUser();

  public void setCurrentUser(User user);
}
