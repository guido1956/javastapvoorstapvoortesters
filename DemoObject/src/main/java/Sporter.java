public class Sporter extends Person {
    private String nameSport;

    Sporter(String firstName, String prefix, String lastName, String nameSport) {
        super(firstName, prefix, lastName);
        this.nameSport = nameSport;

    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }
}
