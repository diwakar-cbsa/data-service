package org.diwakar.dataservice.controller;

import org.diwakar.dataservice.entity.UserEntity;
import org.diwakar.dataservice.service.UserService;
import org.diwakar.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);
  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public ResponseEntity getUser(@RequestParam String email) {
    logger.info("Finding user details for : {}", email);
    UserEntity user = userService.getUser(email);
    return new ResponseEntity(user, HttpStatus.OK);
  }

  @PostMapping("/")
  public ResponseEntity getUser(@RequestBody UserEntity user) {
    logger.info("Inserting user details : {}", user);
    UserEntity res = userService.create(user);
    return new ResponseEntity(res, HttpStatus.OK);
  }
}
