package com.ead.authuser.services.impl;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;
import com.ead.authuser.repositories.UserCourseRespository;
import com.ead.authuser.services.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCourseServiceImpl implements UserCourseService {

    final
    UserCourseRespository userCourseRepository;

    public UserCourseServiceImpl(UserCourseRespository userCourseRepository) {
        this.userCourseRepository = userCourseRepository;
    }

    @Override
    public boolean existsByUserAndCourseId(UserModel userModel, UUID courseId) {
        return userCourseRepository.existsByUserAndCourseId(userModel, courseId);
    }

    @Override
    public UserCourseModel save(UserCourseModel userCourseModel) {
        return userCourseRepository.save(userCourseModel);
    }
}
