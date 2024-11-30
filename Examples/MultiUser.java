package Examples;

public class MultiUser {
    public static final int TWO = 2;
    public static void main(String[] args) {
        User kumar = new User("Kr","Kn");
        System.out.println(kumar.getName());
        Admin nattuAkka = new Admin("Nu","Aa","Panic Email");
        System.out.println(nattuAkka.getName() + " can " + nattuAkka.getSuperPower());
        nattuAkka.firstName = "danger";
System.out.println(nattuAkka.firstName);
SubAdmin jocab = new SubAdmin("jb","rh","whatever","office");
System.out.println(jocab.getSidePower());
    }
}
