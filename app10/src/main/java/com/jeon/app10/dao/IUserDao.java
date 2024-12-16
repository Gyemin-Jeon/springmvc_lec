package com.jeon.app10.dao;

import java.util.List;
import java.util.Map;

import com.jeon.app10.dto.UserDto;

public interface IUserDao {
  List<UserDto> selectUserList(Map<String, Object> map);
  int selectUserCount();
}