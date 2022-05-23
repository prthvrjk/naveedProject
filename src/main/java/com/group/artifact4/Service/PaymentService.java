package com.group.artifact4.Service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class PaymentService{

    @Scheduled(fixedDelayString = "${naveed.delay}")
    public static void displayTime(){
        Date currentTime = new Date();
         System.out.println(currentTime);
    }
}
