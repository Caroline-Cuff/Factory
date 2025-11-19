public class Passengers {
    public boolean CheckedBaggage;
    public int row;
    public String seat;
    public String Fname;

public Passengers() {
    Fname = "Johnny";
    CheckedBaggage = true;
    row = 12;
    seat = "Window seat";
}
//johnny
    public void printPInfo() {
        System.out.println("This is " + Fname + ". He is sitting in row " + row + ", in the " + seat + ".");
        System.out.println("It is " + CheckedBaggage + " that he has checked baggage.");
    }
public Passengers (String pFname, Boolean pCheckedBaggage, int prow, String pseat){
    Fname = pFname;
    CheckedBaggage = pCheckedBaggage;
    row = prow;
    seat = pseat;


        }
}

