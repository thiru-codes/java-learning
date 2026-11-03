class ObjectTracker{
    static int counter;

    public ObjectTracker(){
        counter++;
    }

    static int CounterReturn(){
        return counter;
    }
}

public class StaticVariable{
    public static void main(String[] args) {

        System.out.println(ObjectTracker.CounterReturn());

        ObjectTracker obj1 = new ObjectTracker();
        ObjectTracker obj2 = new ObjectTracker();
        ObjectTracker obj3 = new ObjectTracker();

        System.out.println(ObjectTracker.CounterReturn());
    }
}
