package com.jeon.app02.domain;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component // Spring Container 에 address 라는 이름의 bean 이 만들어집니다.
@ToString  // toString() 메소드 오버라이드
public class Contact {

  private String mobile = "010-1111-1111";
  private String email = "admin@naver.com";
  
}
