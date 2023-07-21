package org.diwakar.dataservice.exception;

public class UserNotFoundException extends RuntimeException {

  private String message;

  public UserNotFoundException() {
    super();
  }

  public UserNotFoundException(String message) {
    super(message);
  }
}
