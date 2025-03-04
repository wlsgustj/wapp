package com.test.controller;

import com.test.dto.LectureDto;
import com.test.dto.UserDto;
import com.test.service.likes.LikesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LikesController {

    @Autowired
    LikesService likesService;

    @PostMapping("/user/login/likes/insert")
    public String insert(@RequestParam(value = "lecNo") String lecNo, // 찜 추가
                         HttpServletRequest request) {
        System.out.println(lecNo);

        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute("userLogin");

        likesService.insertLecture(userDto.getUserNo(), lecNo);
        System.out.println("Success insert likes " + userDto.getUserNo() + " " + lecNo);

        return "redirect:/";
    }

    @PostMapping("/user/login/likes/delete")
    public String delete(@RequestParam(value = "lecNo") String lecNo, // 찜 해제
                         HttpServletRequest request) {
        System.out.println(lecNo);

        HttpSession session = request.getSession();
        UserDto userDto = (UserDto) session.getAttribute("userLogin");

        likesService.deleteLecture(userDto.getUserNo(), lecNo);
        System.out.println("Success delete likes " + userDto.getUserNo() + " " + lecNo);

        return "redirect:/";
    }

}
