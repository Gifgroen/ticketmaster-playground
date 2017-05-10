package com.gifgroen.ticketmaster.model.internal;

import java.util.Date;

/**
 * Created by karsten on 10/05/2017.
 */
public class Dates {
    Start start;
    End end;
    Access access;
    String timezone;
    Status status;
    boolean spanMultipleDays;

    @Override
    public String toString() {
        return "Dates{" +
                "start=" + start +
                ", end=" + end +
                ", access=" + access +
                ", timezone='" + timezone + '\'' +
                ", status=" + status +
                ", spanMultipleDays=" + spanMultipleDays +
                '}';
    }

    public class Start {
        Date localDate;
        String localTime;
        Date dateTime;
        boolean dateTBA;
        boolean timeTBA;
        boolean noSpecificTime;

        @Override
        public String toString() {
            return "Start{" +
                    "localDate=" + localDate +
                    ", localTime='" + localTime + '\'' +
                    ", dateTime=" + dateTime +
                    ", dateTBA=" + dateTBA +
                    ", timeTBA=" + timeTBA +
                    ", noSpecificTime=" + noSpecificTime +
                    '}';
        }
    }

    class End {
        Date localDate;
        Date localTime;
        Date dateTime;
        boolean approximate;
        boolean noSpecificTime;

        @Override
        public String toString() {
            return "End{" +
                    "localDate=" + localDate +
                    ", localTime=" + localTime +
                    ", dateTime=" + dateTime +
                    ", approximate=" + approximate +
                    ", noSpecificTime=" + noSpecificTime +
                    '}';
        }
    }

    class Access {
        String startDateTime;
        boolean startApproximate;
        String endDateTime;
        boolean endApproximate;

        @Override
        public String toString() {
            return "Access{" +
                    "startDateTime='" + startDateTime + '\'' +
                    ", startApproximate=" + startApproximate +
                    ", endDateTime='" + endDateTime + '\'' +
                    ", endApproximate=" + endApproximate +
                    '}';
        }
    }

    class Status {
        String code;

        @Override
        public String toString() {
            return "Status{" +
                    "code='" + code + '\'' +
                    '}';
        }
    }
}
