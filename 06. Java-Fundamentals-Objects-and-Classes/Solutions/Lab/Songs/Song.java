package Lab.Songs;

public class Song {
    //fields
    private String typeList;
    private String name;
    private String time;

    //constructor
    public Song(String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }

    public String getTypeList() {
        return typeList;
    }

    @Override
    public String toString() {
        return name;
    }
}
