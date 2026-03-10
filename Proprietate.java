package lab04IP.example;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Proprietate {
    private String nume;
    private double pretPeNoapte;
    private boolean esteLibera;

    // Metoda importanta
    public void calculeazaPret(int zile) {
        if (esteLibera) {
            double total = pretPeNoapte * zile;
            System.out.println("Costul total pentru " + zile + " zile la '" + nume + "' este " + total + " RON.");
        } else {
            System.out.println("Ne pare rau, proprietatea '" + nume + "' nu este disponibila in acest moment.");
        }
    }

    // Testarea (metoda main)
    public static void main(String[] args) {
        // Folosim constructorul AllArgs din Lombok
        Proprietate cabana = new Proprietate("Cabana la Munte", 350.0, true);
        
        System.out.println(cabana.toString()); // Metoda toString generata de Lombok
        cabana.calculeazaPret(4);
    }
}