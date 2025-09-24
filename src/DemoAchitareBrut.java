public class DemoAchitareBrut {
    public static void main(String[] args) {
        double ore = 25;
        double oreleLucrateDeMine = 37.5;
        calculareBrut(8);
        calculareBrut(ore);
        calculareBrut(oreleLucrateDeMine);
    }

    public static void calculareBrut(double ore) {

        final double RATA_STANDART = 13.75;
        double brut;
        brut = ore * RATA_STANDART;
        System.out.println(ore + " Ore cu achitare in dolari " +  RATA_STANDART + " pe ora iese $ " + brut );

       }

    public static void calculareBrut1(double ore , double rata) {


        double brut;
        brut = ore * rata;
        System.out.println(ore + " Ore cu achitare in dolari " + rata + " pe ora iese $ " + brut);

    }
}
