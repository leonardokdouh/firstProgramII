package model.products;

import java.util.Objects;

public class VideoProducts  extends Products{

    private int id;

    private String type;

    public VideoProducts(int id,String type, String name, int price, int days) {
        super(name, price, days);
        this.id=id;
        this.type=type;

    }

    public VideoProducts(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoProducts that = (VideoProducts) o;
        return id == that.id && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        return super.toString() + "VideoProducts{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
