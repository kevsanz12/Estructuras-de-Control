public class switch_de_estacion {
    public static void main(String[] args) {
        var estacion =  "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default: System.out.println("es otra estacion");
        }

    }
}
