package arrays1;

import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {

        // Arrays 클래스
        // 배열을 쉽게 처리하는 메소드, 다 static임

        String[] strArray = {"aaa", "bbb", "ccc", "ddd", "eee"};

        // 배열의 내용값
        System.out.println(strArray);
        for ( String data : strArray) {
            System.out.println(data);
        }

        System.out.println(Arrays.toString(strArray));

        // 초기화
        Arrays.fill(strArray, "xxx");
        System.out.println(Arrays.toString(strArray));
        Arrays.fill(strArray, 0, 2, "yyy");
        System.out.println(Arrays.toString(strArray));

        // 내용값 비교
        String[] strArray1 = {"aaa", "bbb", "ccc"};
        String[] strArray2 = {"aaa", "bbb", "ccc"};

        System.out.println(strArray1 == strArray2);     // 참조값 비교
        //System.out.println(Arrays.equals(strArray1, strArray2));
        if ( Arrays.equals(strArray1, strArray2)) {
            System.out.println("내용값 같음");
        } else {
            System.out.println("내용값 다름");
        }

        // 정렬(sort)
        int[] intArray = {5, 2, 3, 1, 4};

        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        String[] nameArray = {"xMan", "Alex", "XMan", "Bob", "Curl", "flex", "alex"};

        Arrays.sort(nameArray);
        System.out.println(Arrays.toString(nameArray));

        // 내용 위치 검색
        int pos = Arrays.binarySearch(nameArray, "Curl");
        System.out.println(pos);

        int pos2 = Arrays.binarySearch(nameArray, "Tom");
        System.out.println(pos2);

    }
}
