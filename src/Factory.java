public class Factory {
    //variable called year founded that is an integer
    //Instance variables at the top of class, they can be seen by every class
    //They have to have the word public
    //Scope is the whole class

    // acronym sout = system.out.println()

   public int yearfounded= 990;
   public String factoryName="Airplane Factory";
   public boolean isOpen = true;

   public static void main (String[] args) {
        System.out.println("Welcome to the Airplane Factory");
        new Factory();
    }
    // constructor: (method)
    // public, Name of Class, (){}
    // no void,
    public Factory (){
        //scope for manager is only in constructor
        String manager = "Jeff";
        FactoryInfo();
        //Airplane is new data type
        //type variablename = value
        //new Airplane() is calling constructor for Airplane class and making a new airplane
        //It's an object of type Airplane (object is a really fancy variable)
        Airplane plane1=new Airplane();

        plane1.name="Barry";
        plane1.capacity = 12;
        plane1.length = 120;
        plane1.isDoubleDecker = false;
        plane1.model = "Boeing 737-800";
        System.out.println("This plane's name is "+plane1.name);
        System.out.println(plane1.name + " is a "+ plane1.model);
        System.out.println(plane1.name + " has a capacity of "+ plane1.capacity);
        System.out.println("It has a length of "+ plane1.length + " inches");
        System.out.println("It is " + plane1.isDoubleDecker + " that it is a double decker");


        Airplane plane2 = new Airplane();
        System.out.println(plane2.capacity);

        //todo: Make 2 airplane objects
        //todo: For one of the objects change all the instance variables



    }


//make a method called FactoryInfo (leave it empty)
    public void FactoryInfo() {
// todo: add souts to print the instance variables
        System.out.println(factoryName+ " was founded in " + yearfounded+ " AD");
        System.out.println("It is " + isOpen + " that Jeff is the manager");

    }

}
