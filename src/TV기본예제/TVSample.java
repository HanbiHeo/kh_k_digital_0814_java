package TV기본예제;
//230822_5
public class TVSample {
    public static void main(String[] args) {
//        TV tv = new TV();
//        tv.getInfoTV();

        TV gTv = new TV(false, 13, 15);
//        gTv.getInfoTV();
        gTv.setON(true);
        gTv.setChannel(22);
        gTv.setVolume(22);
        gTv.getInfoTV();
    }

}
