public class Person {
    private String person;

    public Person(){
        this("Geraldine Corker");
    }
    public Person(String person){
        setPerson(person);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
