public class BarCa {
    private String name;
    private int id;
    private Position position;

    public BarCa(String name, int id, Position position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public BarCa(int id, String name, String position) {

    }

    @Override
    public String toString() {
        return "BarCa {" + "id : " + id + " ; name : " + name + "; position : " + position + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
