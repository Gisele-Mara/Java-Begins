public class MilkShakespeare {

    private int id;

    private boolean status;


    public MilkShakespeare(int id) {

        this.id = id;
        this.status = true;
        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void finish (String attendantLevel){
        System.out.println("Order Finished by a " + attendantLevel + " attendant");

        setStatus(false);
    }
}


