public class Light implements HomeService {

    @Override
    public void turnon(){

        System.out.println("Lights are ON");

    }
    @Override
    public void turnoff(){
        System.out.println("Lights are OFF");
    }
}
