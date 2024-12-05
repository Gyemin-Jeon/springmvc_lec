package com.jeon.app06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeon.app06.dto.ContactDto;
import com.jeon.app06.service.IContactService;

@RequestMapping(value="/contact")

@Controller  // 컨트롤러가 사용하는 @Component 입니다.

public class ContactController {
 
  @Autowired
  private IContactService contactService;
  
  @RequestMapping(value="/list.do")
  public String list(Model model) {
    // 서비스로부터 연락처 목록을 받아옵니다.
    List<ContactDto> contacts = contactService.getAllContact();
    // JSP로 전달(forward)하기 위해서 Model에 저장합니다.
    model.addAttribute("contacts", contacts);
    // JSP 경로를 작성합니다.
    return "contact/list";  // "/WEB_INF/views/contact/list.jsp"
  }
  
}
