public class MilkShakespeare {

    private int id;

    private boolean status;

    private String attendant;


    public MilkShakespeare(int id) {

        this.id = id;
        this.status = true;
        this.attendant = "Waiting Attendant";
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

        setStatus(false);
    }

    public String getAttendant (){
       return attendant;
    }
    public void setAttendant (String attendant){
        this.attendant = attendant;
      
    }
}


