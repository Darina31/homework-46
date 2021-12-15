package animals;

public class Mamal {
   private String name;
   private String food;

    public Mamal() {

    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mamal(String name) {
        setName(name);
    }
    private void eat(Mamal mamal,String food){
        System.out.println(mamal.name + " eats "+ this.food);
    }
}
