package com.test.service.lecture;

import com.test.dto.LectureDto;

import java.util.ArrayList;

public interface LectureService {
    ArrayList<LectureDto> readBasicDataList();

    void insertLecture(String category, String name, String price, String date, String img);

    void deleteLecture(String lecNo);

    LectureDto readBasicDataByLecNo(String lecNo);
    ArrayList<LectureDto> readBasicDataByLecName(String lecName);
    ArrayList<LectureDto> readBasicDataByLecCategory(String lecCategory);
    ArrayList<LectureDto> readBasicDataByLecPrice(String minPrice, String maxPrice);
}
