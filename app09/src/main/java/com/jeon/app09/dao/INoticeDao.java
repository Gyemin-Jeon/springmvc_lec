package com.jeon.app09.dao;

import java.util.List;

import com.jeon.app09.dto.AttachDto;
import com.jeon.app09.dto.NoticeDto;

public interface INoticeDao {
  List<NoticeDto> selectNoticeList();
  NoticeDto selectNoticeById(int noticeId);
  List<AttachDto> selectAttachListByNoticeId(int noticeId);
  AttachDto selectAttachById(int attachId);
  int insertNotice(NoticeDto noticeDto);
  int insertAttach(AttachDto attachDto);
  int deleteNotice(int noticeId);
  int updateAttachDownloadCount(int attachId);
}