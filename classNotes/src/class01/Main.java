package class01;

public class Main {
    public static void main(String[] args) {
        SimpleTv television = new SimpleTv();

        television.increaseVolume();
        television.decreaseChannel();

        television.increaseChannel();
        television.decreaseVolume();
    }
}
