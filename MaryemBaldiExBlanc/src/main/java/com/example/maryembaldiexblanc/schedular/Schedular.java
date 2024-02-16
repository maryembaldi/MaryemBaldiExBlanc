package com.example.maryembaldiexblanc.schedular;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
@Component
@AllArgsConstructor
@Slf4j
public class Schedular {


        @Scheduled(cron = "0 * * * * *")

        @Scheduled(cron = "0/5 * * * * *" )
        public String afficher() {

            return null;
        }
        public static long calculateDayDifference(LocalDate date1, LocalDate date2) {
            return ChronoUnit.DAYS.between(date1, date2);
        }
    }

