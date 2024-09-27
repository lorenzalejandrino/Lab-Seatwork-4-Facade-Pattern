public class Tv implements HomeService{


    @Override
    public void turnon(){
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnoff(){
        System.out.println("TV is turned OFF");
    }
}
