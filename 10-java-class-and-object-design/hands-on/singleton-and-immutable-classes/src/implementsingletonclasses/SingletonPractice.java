package implementsingletonclasses;

class ConfigurationManager{
    private ConfigurationManager(){  
        System.out.println("Private constructor called");  
    }
    // It means the Singleton instance is created when the class is initialized
    private static ConfigurationManager instance = new ConfigurationManager();

    public static ConfigurationManager getInstance(){
        // inside getInstance() -> if singleton instance created here,
        // then, the instance is created ONLY when getInstance() is called
        System.out.println("Returning single instance");
        return instance;
    }

    public void operation(){
        System.out.println("Using singleton class!");
    }
}

class AnotherManager {
    //suppose this manager also needs access to ConfigurationManager, 
    // then:
    ConfigurationManager configManager = ConfigurationManager.getInstance();
    public void doSomething(){
        System.out.println("another class getting access tothe same instance of ConfigurationManager");
        configManager.operation();
    }
}
    
public class SingletonPractice {
    public static void main(String[] args){
        System.out.println();
        
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        // creating a ConfigurationManager reference to store the single Instance
        System.out.println();

        configManager1.operation();
        System.out.println();

       
        AnotherManager manager = new AnotherManager();        
        manager.doSomething();
        System.out.println();

        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        System.out.println();
        System.out.println("Checking if they are the same instance: ");
        System.out.println(configManager1 == configManager2);
    }
}
