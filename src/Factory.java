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

        plane1.name="Walter";
        plane1.capacity = 47;
        plane1.length = 184;
        plane1.isDoubleDecker = false;
        plane1.model = "Beluga Airbus XL";
        System.out.println("This plane's name is "+plane1.name);
        System.out.println(plane1.name + " is a "+ plane1.model);
        System.out.println(plane1.name + " has a capacity of "+ plane1.capacity + " tonnes");
        System.out.println("It has a length of "+ plane1.length + " feet");
        System.out.println("It is " + plane1.isDoubleDecker + " that it is a double decker");
        System.out.println(" ");


        Airplane plane2 = new Airplane();
        System.out.println("Here is another plane. This plane's name is "+plane2.name);
        System.out.println(plane2.name + " is a "+ plane2.model);
        System.out.println(plane2.name + " has a capacity of "+ plane2.capacity + "people");
        System.out.println("It has a length of "+ plane2.length + " feet");
        System.out.println("It is " + plane2.isDoubleDecker + " that it is a double decker");
        System.out.println(" ");
        //todo: Make 2 airplane objects
        //todo: For one of the objects change all the instance variables

        Airplane plane3 = new Airplane();
        plane3.capacity = 2;
        plane3.model = "ICON A5";
        plane3.isDoubleDecker = false;
        plane3.name = "Kermit";
        plane3.length = 23;

        System.out.println("Here is another plane. This plane's name is "+plane3.name);
        System.out.println(plane3.name + " is a "+ plane3.model);
        System.out.println(plane3.name + " has a capacity of "+ plane3.capacity + " people");
        System.out.println("It has a length of "+ plane3.length + " feet");
        System.out.println("It is " + plane3.isDoubleDecker + " that it is a double decker");
        System.out.println(" ");

        Airplane plane4 = new Airplane();
        System.out.println("Here is another plane. This plane's name is "+plane4.name);
        System.out.println(plane4.name + " is a "+ plane4.model);
        System.out.println(plane4.name + " has a capacity of "+ plane4.capacity + " people");
        System.out.println("It has a length of "+ plane4.length + " feet");
        System.out.println("It is " + plane4.isDoubleDecker + " that it is a double decker");
        System.out.println(" ");

        Airplane plane5= new Airplane(232, "Freddy", "Beluga Airbus",true,238);

        plane5.printInfo();

        Passengers johnny = new Passengers();
        johnny.printPInfo();

        Passengers jack = new Passengers("Jacob", false, 34, "Middle Seat");
        jack.printPInfo();







    }


//make a method called FactoryInfo (leave it empty)
    public void FactoryInfo() {
// todo: add souts to print the instance variables
        System.out.println(factoryName+ " was founded in " + yearfounded+ " AD");
        System.out.println("It is " + isOpen + " that Jeff is the manager");
        System.out.println(" ");


    }

}
