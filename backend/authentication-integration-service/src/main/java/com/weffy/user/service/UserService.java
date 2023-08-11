package com.weffy.user.service;

import com.weffy.user.dto.Request.UserSignInReqDto;
import com.weffy.user.dto.Response.UserInfoResDto;
import com.weffy.user.dto.Response.UserMainResDto;
import com.weffy.user.dto.Response.UserSignInResDto;
import com.weffy.user.entity.WeffyUser;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

public interface UserService {

    void signUp(UserSignInReqDto signinInfo, String role) throws IOException;
    UserSignInResDto signIn(UserSignInReqDto signinInfo) throws IOException, InterruptedException;
    WeffyUser findById(Long userId);
    WeffyUser findByEmail(String email);
    UserMainResDto mainUser(String userId);
    UserInfoResDto getUser(WeffyUser weffyUser);

    void setUser(WeffyUser weffyUser, MultipartFile profileImg, String nickName);

    void setPassword(WeffyUser weffyUser, String password);

    void deleteUser(WeffyUser weffyUser);
}