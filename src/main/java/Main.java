public class Main {
    public static void main(String[] args) {

        Remote tv = new LG_Tv();

        tv.power_on();
        tv.channel_change(311);
        tv.display();
        tv.power_off();
        tv.display();
        tv.channel_up();

    }
}
