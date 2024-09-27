public class HomeInterface {

    private Light light;
    private Tv tv;
    private Airconditioning airconditioning;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new Tv();
        this.airconditioning = new Airconditioning();

    }

    public void turnonAll(){
        light.turnon();
        tv.turnon();
        airconditioning.turnon();
    }
    public void turnoffAll(){
        light.turnoff();
        tv.turnoff();
        airconditioning.turnoff();
    }
    public void turnOnLight() {
        light.turnon();
    }

    public void turnOffLight() {
        light.turnoff();
    }

    public void turnOnTV() {
        tv.turnon();
    }

    public void turnOffTV() {
        tv.turnoff();
    }

    public void turnOnAC() {
        airconditioning.turnon();
    }

    public void turnOffAC() {
        airconditioning.turnoff();
    }



}
