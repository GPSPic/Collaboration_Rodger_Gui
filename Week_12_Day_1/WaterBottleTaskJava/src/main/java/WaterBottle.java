public class WaterBottle {

    private byte volume;

    public WaterBottle(byte volume) {
        this.volume = volume;
    }

    public byte getVolume() {
        return this.volume;
    }

    public void drink() {
        byte currentVolume = this.volume;
        if (this.volume >= 10) {
            this.volume = (byte) (currentVolume - 10);
        }
    }

    public void empty(){
        this.volume = (byte) 0;
    }

    public void fill(){
        this.volume = (byte) 100;
    }
}
