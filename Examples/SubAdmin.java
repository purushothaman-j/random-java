
package Examples;
public class SubAdmin extends Admin {
   private String sidePower;
    public SubAdmin(String firstName, String lastName, String superPower, String sidePower){
super(firstName,lastName, superPower);
this.sidePower = sidePower;
    }

    public String getSidePower(){
        return this.sidePower;
    }
}
