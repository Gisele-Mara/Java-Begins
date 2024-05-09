
public class Leao extends Animal {


    public Leao(String nome, int idade, String habitat){
        this.setNome(nome);
        this.setIdade(idade);
        this.setHabitat(habitat);
        this.setCaract("Mané");

    }

    public void fazSom(){
        super.fazSom("Rugido");
    }

}

