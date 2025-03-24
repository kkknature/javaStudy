public class ArrayEx04 {
    public static void main(String[] args) {
        
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        for(int i = 0; i < season.length ; i++) {
            System.out.println("Season[" + i + "] : " + season[i]);
        }

        // 내용만 향상된 for로 출력
        for(String data : season) {
            System.out.println(data);
        }
    }
}
    
 
