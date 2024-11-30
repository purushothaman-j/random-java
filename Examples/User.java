package Examples;

public class User implements UserInterface{

public String firstName;
private String lastName;

public User(String firstName, String lastName){
this.firstName = firstName;
this.lastName = lastName;
}

public String getName(){
    return this.firstName+" "+this.lastName;
}


public void doNothing() {
   System.out.println("do nothing");
}
}