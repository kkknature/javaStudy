package com.exam;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {
    public static void main(String[] args) {

        try {
            // localhost
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress1.getHostAddress());

            // remote
            InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
            for (InetAddress inetAddress : inetAddresses) {
                System.out.println(inetAddress.getHostAddress());
                System.out.println(inetAddress.getHostName());
            }

        } catch (UnknownHostException e) {
            System.out.println("[에러]: " + e.getMessage());
        }
    }
}
