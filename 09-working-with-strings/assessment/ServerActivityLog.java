public class ServerActivityLog {
    public static void main(String[] args) {
        StringBuffer log = new StringBuffer();

        log.append("Server started\n");
        log.append("User sanjay logged in\n");
        log.append("User sanjay logged out\n");

        log.insert(0, "[Timestamp: 2026-11-03 09:00]\n");

        int logoutStart = log.indexOf("User sanjay logged out");
        if (logoutStart != -1) {
            int logoutEnd = logoutStart + "User sanjay logged out".length();
            log.replace(logoutStart, logoutEnd, "User session ended");
        }

        System.out.println(log);
    }
}
