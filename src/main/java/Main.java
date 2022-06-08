public class Main {
    public static void main(String[] args) {

        Remote lgtv = new LG_Tv();

        Remote samsungtv = new Samsumg_Tv();

        lgtv.display();
        lgtv.power_on();
        lgtv.display();
        lgtv.channel_change(30);    //30
        lgtv.channel_up();      // 31
        lgtv.channel_up();      // 32
        lgtv.channel_down();        // 31
        lgtv.volume_up();       // 1
        lgtv.volume_up();       // 2
        lgtv.volume_up();       // 3
        lgtv.volume_up();       // 4
        lgtv.volume_up();       // 5
        lgtv.volume_up();       // 6
        lgtv.volume_down();     // 5
        lgtv.display();
        lgtv.power_off();


        System.out.println("======================================================");

        samsungtv.display();
        samsungtv.power_on();
        samsungtv.display();
        samsungtv.channel_change(350);
        samsungtv.channel_change(77);
        samsungtv.channel_down();
        samsungtv.channel_down();
        samsungtv.channel_up();
        samsungtv.volume_up();
        samsungtv.display();


    }
}
