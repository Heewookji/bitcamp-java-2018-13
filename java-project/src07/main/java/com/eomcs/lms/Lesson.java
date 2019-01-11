// 수업 데이터를 저장할 새 데이터 타입
package com.eomcs.lms;

import java.sql.Date;

public class Lesson {
  int no;
  String title;
  String contents;
  Date startDate;
  Date endDate;
  int totalHours;
  int dayHours;
}
