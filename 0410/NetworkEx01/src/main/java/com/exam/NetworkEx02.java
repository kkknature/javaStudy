package com.exam;

import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx02 {
    public static void main(String[] args) {

        // URL (Uniform Resource Locator)
        // https://search.naver.com:445/dir2/dirv1/directory/search.naver?where=nexearch&query=starwars&sm=top_hty&fbm=1&ie=utf8
        // http:       - protocol(전송규약 ; Hyper Text Transfer Protocol (client <- html -> web server))
        // https:       - http + secure
        // //           - 구분자
        // search.naver.com:445     - ip, port
        // /            - 구분자
        // dir2/dirv1/directory/search.naver    - 경로, 처리 파일명
        // ?            - 구분자
        // where=nexearch&query=starwars&sm=top_hty&fbm=1&ie=utf8   - 쿼리문자열(옵션값)

        String url = "https://search.naver.com:445/dir2/dirv1/directory/search.naver?where=nexearch&query=starwars&sm=top_hty&fbm=1&ie=utf8";
        // protocol / 도메인 / 나머지

        String[] arrUrls = url.split("/");
        for (String url1 : arrUrls) {
            System.out.println(url1);
        }

        try {
            URL objurl = new URL(url);
            System.out.println(objurl.getProtocol());
            System.out.println(objurl.getHost());
            System.out.println(objurl.getPort());

            System.out.println(objurl.getPath());
            System.out.println(objurl.getQuery());

        } catch (MalformedURLException e) {
            System.out.println("[에러]: " + e.getMessage());
        }
    }
}
