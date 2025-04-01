package file1;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class FileEx01 {
    public static void main(String[] args) {

        // File

        // file / directory
        // 절대경로 / 상대경로

        // 디렉토리
        File dir1 = new File("C:\\java");   // Window
        File dir2 = new File("C:/java");    // Mac, Linux

        // 파일
        File file1 = new File("C:\\java\\file.txt");
        File file2 = new File("C:/java/file.txt");
        File file3 = new File("C:/java", "file.txt");

        File file4 = new File("../java/file.txt");

        // 존재유무 : exists
        System.out.println(dir1.exists());
        System.out.println(file1.exists());

        // 파일 / 디렉토리 구분
        System.out.println(dir1.isDirectory());
        System.out.println(file1.isFile());

        // 파일 / 디렉토리 성격
        System.out.println(dir2.canRead());
        System.out.println(dir2.canWrite());
        System.out.println(dir2.isHidden());

        System.out.println(dir1.getName());
        System.out.println(dir1.getParent());
        System.out.println(dir1.getPath());

        File file = new File("C:/java/ideaIU-2024.3.5.exe");
        System.out.println(file.getName());
        System.out.println(file.getParent());

        // 파일 크기
        System.out.println(file.length() + "Byte");
        // MB 단위 출력
        System.out.println(file.length() / (1024 * 1024) + "MByte");

        // 변경 일자
        // timestamp
        System.out.println(file.lastModified());
        long fileDate = file.lastModified();
        Date date = new Date(fileDate);
        System.out.println(date.toLocaleString());

        // Calendar 클래스로 표현
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fileDate);
    }
}
