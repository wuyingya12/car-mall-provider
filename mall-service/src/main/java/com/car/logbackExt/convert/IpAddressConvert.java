package com.car.logbackExt.convert;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.car.logbackExt.utils.LocalIpAddressUtil;

/**
 * Created by zd.yao on 2017/5/24.
 */
public class IpAddressConvert extends ClassicConverter {

    private static String ip= LocalIpAddressUtil.resolveLocalAddress().getHostAddress();
    @Override
    public String convert(ILoggingEvent event) {
        return ip;
    }
}
