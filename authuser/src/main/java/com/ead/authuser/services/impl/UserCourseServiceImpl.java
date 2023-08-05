package com.ead.authuser.services.impl;

import com.ead.authuser.repositories.UserCourseRespository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    final
    UserCourseRespository userCourseRepository;

    public UserCourseServiceImpl(UserCourseRespository userCourseRepository) {
        this.userCourseRepository = userCourseRepository;
    }
}
