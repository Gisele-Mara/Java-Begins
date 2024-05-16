public class Elephant extends Animal {

//    private String tromba;

    public Elephant(String nome, int age, String habitat){
        this.setNome(nome);
        this.setAge(age);
        this.setHabitat(habitat);
        this.setCaract("Tromba");
    }

    public void makesSound(){

        super.makesSound("Barulho de trombeta"
        );
    }

}
