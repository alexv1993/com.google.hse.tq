package com.google.hse.tq;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Alex on 21.12.2017.
 */
public class QuartzTest {

    public static void main(String[] args) {
        try {
            Scheduler schedule = StdSchedulerFactory.getDefaultScheduler();
            schedule.start();
            schedule.shutdown();
        } catch (SchedulerException ex) {
            ex.printStackTrace();
        }
    }

}
