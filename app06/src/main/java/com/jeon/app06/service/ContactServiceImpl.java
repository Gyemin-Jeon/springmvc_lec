package com.jeon.app06.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeon.app06.dao.IContactDao;
import com.jeon.app06.dto.ContactDto;

@Service  // 서비스가 사용하는 @Component 입니다.
          // 비지니스 계층(Business Layer)에서 사용합니다.

public class ContactServiceImpl implements IContactService {

  @Autowired
  private IContactDao contactDao;
  
  @Override
  public List<ContactDto> getAllContact() {
    // Dao로부터 연락처 목록을 가져옵니다.
    List<ContactDto> contacts = contactDao.getContactList();
    // 연락처 목록을 반환합니다.
    return contacts;
  }

  @Override
  public ContactDto getContact(int contact_id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String register(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String modify(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String remove(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

}
