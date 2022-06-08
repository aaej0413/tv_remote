import java.util.Scanner;

public class LG_Tv extends Tv implements Remote {

    Scanner sc = new Scanner(System.in);

    public LG_Tv() {

    }

    public LG_Tv(String name, boolean power, int channel, int volume) {
        this.name = name;
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }


    @Override
    public void power_on() {
        power = true;
        System.out.println("LG tv 전원이 켜졌습니다.");
//        String on = "";
//        int cnt = 5;
//
//        while (true) {
//            System.out.println("on을 입력해주세요.");
//            System.out.printf(": ");
//            on = sc.nextLine();
//
//            if (on.equals("on")) {
//                System.out.println("LG tv 전원이 켜졌습니다.");
//                power = true;
//                break;
//            }else  {
//                System.out.println("틀렸습니다. 다시 입력해주세요");
//                cnt--;
//                if (cnt==0) {
//                    System.out.println("틀린 횟수를 초과하였습니다.");
//                    break;
//                }
//            }
//        }
    }


    @Override
    public void power_off() {
        power = false;
        System.out.println("LG tv 전원이 꺼졌습니다.");
//        String off = "";
//        int cnt = 5;
//
//        while (true) {
//            System.out.println("off을 입력해주세요.");
//            System.out.printf(": ");
//            off = sc.nextLine();
//
//            if (off.equals("off")) {
//                System.out.println("LG tv 전원이 꺼졌습니다.");
//                power = false;
//                break;
//            }else  {
//                System.out.println("틀렸습니다. 다시 입력해주세요");
//                cnt--;
//                if (cnt==0) {
//                    System.out.println("틀린 횟수를 초과하였습니다.");
//                    break;
//                }
//            }
//        }
    }

    @Override
    public void channel_up() {
        if(power==true){
            channel++;
        }else {
            System.out.println("전원이 꺼져있습니다.");
            channel = 0;
        }
        if (channel==MAX_CHANNEL) {
            System.out.println("채널 범위를 초과하였습니다.");
            channel_down();
        }
    }

    @Override
    public void channel_down() {
        if(power==true){
            channel--;
        }else {
            System.out.println("전원이 꺼져있습니다.");
            channel = 0;
        }
        if(channel < MIN_CHANNEL) {
            System.out.println("없는 채널입니다.");
            channel_up();
        }
    }

    @Override
    public void channel_change(int num) {
        if(power==true){
            channel = num;
        }else {
            System.out.println("전원이 꺼져있습니다.");
            channel = 0;
        }
        if (channel > MAX_CHANNEL) {
            System.out.println("채널 범위는 300번 까지입니다. 범위를 초과하여 0으로 돌아갑니다.");
            channel_change(0);
        }else if (channel < MIN_CHANNEL) {
            System.out.println("없는 채널입니다.");
            channel_up();
        }
    }

    @Override
    public void volume_up() {
        if(power==true) {
            volume++;
        }else {
            System.out.println("전원이 꺼져있습니다.");
        }


    }

    @Override
    public void volume_down() {

    }

    @Override
    public void display() {
        String status = "";
        if (power==true) {
             status = "켜짐";
        }else {
            status = "꺼짐";
        }
        System.out.println("전원: " + status +","+ " 채널: " + channel +","+ " 볼륨: " + volume);
    }


}
