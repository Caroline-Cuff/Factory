public class Airplane {
    ///instance variables
    ///used in whole class
    ///they should be at the top of the class
    ///Have to have public at start
    public int capacity;
    public String name;
    public String model;
    public Boolean isDoubleDecker;
    public int length;

    //constructor
    public Airplane(){
        capacity = 120;
        name = "Jimmy42";
        model = "Boing 737-800" ;
        isDoubleDecker = false;
        length = 120;
    }
    //todo: add a praameter for modle, isdd, length to constructor
    //todo: set value of instane variables to paramters
    //todo: fix the related problems in factory
    //constructor with parameter
    public Airplane(int pCapacity, String pname, String pmodel, boolean pisDoubleDecker, int plength){
        capacity = pCapacity;
        name = pname;
        model = pmodel ;
        isDoubleDecker = pisDoubleDecker;
        length = plength;

    }

    public void printInfo(){

        System.out.println("Here is another plane. This plane's name is "+name);
        System.out.println(name + " is a "+ model);
        System.out.println(name + " has a capacity of "+ capacity + " tonnes");
        System.out.println("It has a length of "+ length + " feet");
        System.out.println(" ");
    }
// todo: make a method called printInfo() that prints tha airplanes insacnce variables


}
