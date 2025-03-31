package data1;

import java.util.ArrayList;

public class DataEx02 {
    public static void main(String[] args) {

        ArrayList<String> data1 = new ArrayList<String>();
        data1.add("1");
        data1.add("홍길동");
        data1.add("010-111-111");
        data1.add("20");
        data1.add("서울");

        ArrayList<String> data2 = new ArrayList<String>();
        data1.add("2");
        data1.add("박문수");
        data1.add("010-222-222");
        data1.add("22");
        data1.add("경기도");

        ArrayList<String> data3 = new ArrayList<String>();
        data1.add("3");
        data1.add("임꺽정");
        data1.add("010-333-333");
        data1.add("25");
        data1.add("강원도");

        ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();

        datas.add(data1);
        datas.add(data2);
        datas.add(data3);

        System.out.println(datas.toString());
    }
}
