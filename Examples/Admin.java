package Examples;
public class Admin extends User {
   private String superPower;
    public Admin(String firstName, String lastName, String superPower){
super(firstName,lastName);
this.superPower = superPower;
    }

    public String getSuperPower(){
        return this.superPower;
    }
}
