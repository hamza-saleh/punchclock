package ch.zli.m223.punchclock.domain;
import javax.persistence.*;

@Entity
public class Orders {


    private String food;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    public String getFood(){
        return food;
    }

    public long getID() {
        return ID;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
}
