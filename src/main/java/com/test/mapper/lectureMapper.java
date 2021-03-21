package com.test.mapper;

import com.test.dto.LectureDto;
import org.apache.ibatis.annotations.Param;
import java.util.ArrayList;

public interface lectureMapper {
    ArrayList<LectureDto> readBasicDataList();
    void insertLecture(@Param("category") String category,
                       @Param("name") String name,
                       @Param("price") String price,
                       @Param("regDate") String regDate,
                       @Param("lecImg") String lecImg);

    void deleteLecture(@Param("lecNo") String lecNo);
    LectureDto readBasicDataByLecNo(@Param("lecNo") String lecNo);
    ArrayList<LectureDto> readBasicDataByLecName(@Param("lecName") String lecName);
    ArrayList<LectureDto> readBasicDataByLecCategory(@Param("lecCategory") String lecCategory);
    ArrayList<LectureDto> readBasicDataByLecPrice(@Param("minPrice") String minPrice, @Param("maxPrice") String maxPrice);
}
