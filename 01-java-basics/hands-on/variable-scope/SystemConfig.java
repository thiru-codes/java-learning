public class SystemConfig{

	public static final String ENVIRONMENT = "PRODUCTION";
	public static boolean isMaintenanceMode = false;

	public static void main(String[] args){
		SystemConfig.isMaintenanceMode = true;
	}
}