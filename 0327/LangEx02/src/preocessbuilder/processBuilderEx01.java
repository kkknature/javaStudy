package preocessbuilder;

public class processBuilderEx01 {
    public static void main(String[] args) throws Exception {

        ProcessBuilder pb
                //= new ProcessBuilder("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe", "www.daum.net");
            = new ProcessBuilder("C:/Windows/system32/notepad.exe");

        pb.start();
    }
}
