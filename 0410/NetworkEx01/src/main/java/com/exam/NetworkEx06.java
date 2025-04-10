package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkEx06 {
    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            URL url = new URL("http://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=4077b69c05acd353dca3801ac558d3c5&targetDt=20250405");
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line = br.readLine();
            line = line.replaceAll("><", ">\n<");

            //System.out.println(line);

            String[] lines = line.split("\n");

            for (String data : lines) {
                if (data.trim().startsWith("<rank>")) {
                    data = data.replaceAll("<rank>", "").replaceAll("</rank>", "");
                    System.out.println(data);
                }
                if (data.trim().startsWith("<movieNm>")) {
                    data = data.replaceAll("<movieNm>", "").replaceAll("</movieNm>", "");
                    System.out.println(data);
                }
            }

        } catch (IOException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (br != null) try { br.close(); } catch (IOException e) {}
        }
    }
}
