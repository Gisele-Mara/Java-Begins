
public class Lion extends Animal {


    public Lion(String nome, int age, String habitat){
        this.setNome(nome);
        this.setAge(age);
        this.setHabitat(habitat);
        this.setCaract("Mané");

    }

    public void makesSound(){
        super.makesSound("Rugido");
    }

}

