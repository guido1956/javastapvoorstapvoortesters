public class TheWorldIsFullOfFools {
    public static void main(String[] args) {
        Person alexis = new Person("Alexis", "", "Petridis", 39);
        System.out.println(alexis.isAlive());
        alexis.killPerson();
        System.out.println(alexis.isAlive());
        Sporter brent = new Sporter("Brent", "", "Koning", "zwemmer");
        System.out.println(brent.getFirstName() + " " +
                brent.getNameSport());
    }
}
