public class HomeApp {



    public static void main(String[] args){
        HomeInterface homeInterface = new HomeInterface();

        homeInterface.turnonAll();
        System.out.println(" ");

        homeInterface.turnoffAll();
        System.out.println(" ");

        homeInterface.turnOnAC();
        homeInterface.turnOffAC();
        System.out.println(" ");

        homeInterface.turnOnTV();
        homeInterface.turnOffTV();
        System.out.println(" ");

        homeInterface.turnOnLight();
        homeInterface.turnOffLight();
        System.out.println(" ");

    }
}
