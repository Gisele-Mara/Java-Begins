public class MilkShakeBar extends MilkShakespeare{
     private String flavour;
     private String size;
    
    public MilkShakeBar(int id, String flavour, String size){
        super(id);
        this.flavour = flavour;
        this.size = size;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
