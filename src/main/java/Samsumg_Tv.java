import java.util.Scanner;

public class Samsumg_Tv extends Tv implements Remote {
    Scanner sc = new Scanner(System.in);

    public Samsumg_Tv() {

    }

    public Samsumg_Tv(String name, boolean power, int channel, int volume) {
        this.name = name;
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }


    @Override
    public void power_on() {
        power = true;
        System.out.println("Samsung tv 전원이 켜졌습니다.");
    }


    @Override
    public void power_off() {
        power = false;
        System.out.println("Samsung tv 전원이 꺼졌습니다.");
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
        if(volume > MAX_VOlUME) {
            System.out.println("최대 음량은 50입니다.");
            volume_down();
        }
    }

    @Override
    public void volume_down() {
        if(power==true) {
            volume--;
        }else {
            System.out.println("전원이 꺼져있습니다.");
        }
        if(volume < MIN_VOlUME) {
            System.out.println("음량이 0보다 작을 순 없습니다.");
            volume_up();
        }

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

