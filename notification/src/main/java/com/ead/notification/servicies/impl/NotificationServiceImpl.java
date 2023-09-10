package com.ead.notification.servicies.impl;

import com.ead.notification.models.NotificationModel;
import com.ead.notification.repositories.NotificationRepository;
import com.ead.notification.servicies.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public NotificationModel saveNotification(NotificationModel notificationModel) {
        return notificationRepository.save(notificationModel);
    }
}
