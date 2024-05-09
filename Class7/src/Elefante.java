public class Elefante extends Animal {

//    private String tromba;

    public Elefante(String nome, int idade, String habitat){
        this.setNome(nome);
        this.setIdade(idade);
        this.setHabitat(habitat);
        this.setCaract("Tromba");
    }

    public void fazSom(){

        super.fazSom("Barulho de trombeta"
        );
    }

}
