public interface Remote {

    int MAX_VOlUME = 50;
    int MIN_VOlUME = 0;
    int MAX_CHANNEL = 300;
    int MIN_CHANNEL = 0;

    void power_on();
    void power_off();
    void channel_up();
    void channel_down();
    void channel_change(int num);
    void volume_up();
    void volume_down();
    void display();
}
