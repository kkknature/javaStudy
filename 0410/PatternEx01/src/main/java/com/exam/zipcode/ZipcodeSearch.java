package com.exam.zipcode;

import java.util.ArrayList;

public class ZipcodeSearch {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java ZipcodeSearchEx01 동이름");
            System.exit(0);
        }

        if (args[0].length() <2) {
            System.out.println("동이름을 2자 이상 입력");
            System.exit(0);
        }

        ZipcodeDAO dao = new ZipcodeDAO();
        ArrayList<ZipcodeTO> lists = dao.selectZipcode(args[0]);

        for (ZipcodeTO to : lists) {
            String data = String.format("[%s] %s %s %s %s %s",
                    to.getZipcode(), to.getSido(), to.getGugun(),
                    to.getDong(), to.getRi(), to.getBunji());
            System.out.println(data);
        }
    }
}
