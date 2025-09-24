public class InfoEX {
    public static void main(String[] args) {
        calculeBrut(659889);

    }

    public static void calculeBrut(double ore) {
        final double RATA_STANDART = 13.75;
        double brut;
        brut = ore * RATA_STANDART;
        System.out.println(ore + " Ore cu achitare in dolari " +  RATA_STANDART + " pe ora iese $ " + brut );
    }

}
