package com.jeon.app08.dao;

import java.util.List;

import com.jeon.app08.dto.FileDto;

public interface IFileDao {
  List<FileDto> selectFileList();
  int insertFile(FileDto fileDto);
}
