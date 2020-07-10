package ch.zli.m223.punchclock.domain;

public class Orders {
    private String food;
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
