// StringBuffer is used because the log may be updated 
// by multiple threads simultaneously -> synchronized access

public class StringBufferPractice {
    public static void main(String[] args) {
        StringBuffer log = new StringBuffer();

        log.append("[INFO] Server started");
        log.append("\n[INFO] User logged in");
        log.append("\n[INFO] User logged out");

        System.out.println(log);

        int start = log.lastIndexOf("logged");
        int end = log.length();

        log.replace(start, end, "disconnected");

        System.out.println(log);    
    }
}
