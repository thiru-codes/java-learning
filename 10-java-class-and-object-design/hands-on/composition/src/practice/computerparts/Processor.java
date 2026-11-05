package practice.computerparts;

public class Processor {
    private String processorName;
    protected int cores;

    public Processor(String processorName, int cores){
        if(processorName == null || processorName.isEmpty()){
            throw new IllegalArgumentException("Processor name cannot be empty");
        }
        if(cores<=0){
            throw new IllegalArgumentException("Number of cores must be greater than zero");
        }
        this.processorName = processorName;
        this.cores = cores;
    }

    public void startProcessing(){
        System.out.println("Processor " + processorName + " with " + cores + " cores is running...");
    }
}
