public class Pessoa {
    private int age;
    private String name;

    public int getAge(){
        return this.age;
    }

    public void setAge(int i){
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public void setNome(String nome) {
        this.name = name;
    }

    public Pessoa (String a, int b){
        this.name = a;
        this.age = b;
    }
}
