package com.exam;

public class JuminCheckEx01 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java JuminCheckEx01 <주민등록번호>");
            System.exit(0);
        }

        if (args[0].length() != 14) {
            System.out.println("14자리를 입력하셔야 합니다");
            System.exit(0);
        }

        String[] jumins = args[0].split("-");
        if (jumins[0].length() != 6 || jumins[1].length() != 7) {
            System.out.println("앞자리와 뒷자리의 길이가 틀립니다.");
            System.exit(0);
        }

        System.out.println("정상 입력");

        // - 제거
        String strJumin = args[0].replaceAll("-", "");
        System.out.println(strJumin);

        // 한 글자씩 분리
        //System.out.println(strJumin.substring(0, 1));
        //System.out.println(strJumin.substring(1, 2));
        //System.out.println(strJumin.substring(2, 3));

        int[] nums = {Integer.parseInt(strJumin.substring(0, 1))
                , Integer.parseInt(strJumin.substring(1, 2))
                , Integer.parseInt(strJumin.substring(2, 3))
                , Integer.parseInt(strJumin.substring(3, 4))
                , Integer.parseInt(strJumin.substring(4, 5))
                , Integer.parseInt(strJumin.substring(5, 6))
                , Integer.parseInt(strJumin.substring(6, 7))
                , Integer.parseInt(strJumin.substring(7, 8))
                , Integer.parseInt(strJumin.substring(8, 9))
                , Integer.parseInt(strJumin.substring(9, 10))
                , Integer.parseInt(strJumin.substring(10, 11))
                , Integer.parseInt(strJumin.substring(11, 12))
                , Integer.parseInt(strJumin.substring(12, 13))};

        nums[0] *= 2;
        nums[1] *= 3;
        nums[2] *= 4;
        nums[3] *= 5;
        nums[4] *= 6;
        nums[5] *= 7;
        nums[6] *= 8;
        nums[7] *= 9;
        nums[8] *= 2;
        nums[9] *= 3;
        nums[10] *= 4;
        nums[11] *= 5;

        int sum = 0;
        for (int i = 0; i < (nums.length - 1); i++) {
            sum += nums[i];
        }

        sum %= 11;
        sum = 11 - sum;
        sum %= 10;

        if (sum != nums[12]) {
            System.out.println("주민번호 형식이 틀림");
        } else {
            System.out.println("주민번호 형식이 맞음");
        }

        // int num01 = Integer.parseInt(strJumin.substring(0,1)) * 2;
        // int num02 = Integer.parseInt(strJumin.substring(1,2)) * 3;
        // int num03 = Integer.parseInt(strJumin.substring(2,3)) * 4;
        // int num04 = Integer.parseInt(strJumin.substring(3,4)) * 5;
        // int num05 = Integer.parseInt(strJumin.substring(4,5)) * 6;
        // int num06 = Integer.parseInt(strJumin.substring(5,6)) * 7;
        // int num07 = Integer.parseInt(strJumin.substring(6,7)) * 8;
        // int num08 = Integer.parseInt(strJumin.substring(7,8)) * 9;
        // int num09 = Integer.parseInt(strJumin.substring(8,9)) * 2;
        // int num10 = Integer.parseInt(strJumin.substring(9,10)) * 3;
        // int num11 = Integer.parseInt(strJumin.substring(10,11)) * 4;
        // int num12 = Integer.parseInt(strJumin.substring(11,12)) * 5;

        // int lastNum = Integer.parseInt(strJumin.substring(12,13));

        //int sum = num01 + num02 + num03 + num04 +num05 +num06 +num07 +num08 +num09 +num10 +num11 +num12;

        //int resultNum = sum % 11;
        //resultNum = 11 - resultNum;
        //resultNum = resultNum % 10;

        //if (lastNum == resultNum) {
        //    System.out.println("주민등록번호 형식이 맞음");
        //} else {
        //    System.out.println("주민등록번호 형식이 틀림");
        //}

    }
}
