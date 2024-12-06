package com.jeon.app06.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.jeon.app06.dto.ContactDto;

public interface IContactService {
  Map<String, Object> getAllContact();
  ContactDto getContact(int contact_id);
  String register(HttpServletRequest request);
  String modify(HttpServletRequest request);
  String remove(HttpServletRequest request);
}