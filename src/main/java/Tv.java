public abstract class Tv {

    String name;
    String color;
    boolean power;
    String size;
    int channel;
    int volume;

    public Tv() {

    }

    public Tv(String name,boolean power, int channel,int volume) {
        this.name = name;
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }

}
