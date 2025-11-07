public class Factory {
    //variable called year founded that is an integer
    //Instance variables at the top of class, they can be seen by every class
    //They have to have the word public
    //Scope is the whole class

    // acronym sout = system.out.println()

   public int yearfounded= 1798;
   public String factoryName="Airplane Factory";
   public boolean isOpen = true;

   public void main(String[] args) {
        System.out.println("Welcome to Caroline's factory");
        new Factory();
    }
    // constructor: (method)
    // public, Name of Class, (){}
    public Factory (){
        FactoryInfo();
        //scope for manager is only in constructor
        String manager = "Dumbledore";

    }


//make a method called FactoryInfo (leave it empty)
    public void FactoryInfo(){
// todo: add souts to print the instance variables
        System.out.println(yearfounded);
        System.out.println(factoryName);
        System.out.println(isOpen);

    }

}
