package com.ifsbank.agent.util;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 功能描述: 
 *
 * @param: 
 * @return: 
 * @author: furunxin
 * @date: 2018/9/11 上午11:03
 */
public class IpUtil {

    public static String getLocalHostIp(){
        String ipAddress = null;
        try {
            ipAddress =InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return ipAddress;
    }
}
