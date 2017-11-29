package com.weds.antd.appserver.utils;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateUtils {

    public static Timestamp unixTimeToJavaTimestamp(String timestampStr) {
        long unixTime = Long.valueOf(timestampStr);
        if (13 == timestampStr.length()) {
            unixTime = unixTime / 1000;
        }
        return Timestamp.valueOf(LocalDateTime.from(Instant.ofEpochSecond(unixTime).atZone(ZoneId.of("GMT-4"))));
    }
}
