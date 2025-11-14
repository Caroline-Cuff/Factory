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

    //constructor with parameter
    public Airplane(int pCapacity){
        capacity = pCapacity;
        name = "Jimmy42";
        model = "Boing 737-800" ;
        isDoubleDecker = false;
        length = 120;

    }

    public void printInfo(){

        System.out.println("Here is another plane. This plane's name is "+name);
        System.out.println(name + " is a "+ model);
        System.out.println(name + " has a capacity of "+ capacity + " people");
        System.out.println("It has a length of "+ length + " feet");
        System.out.println(" ");
    }
// todo: make a method called printInfo() that prints tha airplanes insacnce variables


}
