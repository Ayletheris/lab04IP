package lab04IP.example;

import lombok.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor

public class Recenzie {
    private String comentariu;
    @Setter(AccessLevel.NONE)
    private float notaCuratenie;
    @Setter(AccessLevel.NONE)
    private float notaComunicare;
    private Utilizator numeAutor;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    public float nota;

    public Recenzie(String comentariu, Utilizator numeAutor, float notaCuratenie, float notaComunicare) {
        this.comentariu = comentariu;
        this.numeAutor = numeAutor;
        this.notaCuratenie = notaCuratenie;
        this.notaComunicare = notaComunicare;
    }

    public void setNotaComunicare(int notaComunicare) {
        if (notaComunicare >= 0 && notaComunicare <= 5) {
            this.notaComunicare = notaComunicare;
        } else {
            System.out.println("nu este corecta valoarea");
        }
    }

    public void setNotaCuratenie(int notaCuratenie) {
        if (notaCuratenie >= 0 && notaCuratenie <= 5) {
            this.notaCuratenie = notaCuratenie;
        } else {
            System.out.println("nu este corecta valoarea");
        }
    }

    public float getNota() {
        nota = (notaComunicare + notaCuratenie) / 2.0f;
        return nota;
    }
}
