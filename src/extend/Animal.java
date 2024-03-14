package extend;

// super class
public class Animal {
    private String species;

    public Animal() {
    }

    public Animal(String species) {
        this.species = species;
    }
    public void makeSound(){
        // epmty
        System.out.println("empty");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
