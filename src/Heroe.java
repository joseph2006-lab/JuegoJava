
public class Heroe extends Personaje {

    public Heroe() {
    }

    public Heroe(String nombre, int puntosHp, int puntosFuerza, String nombreGolpeNormal, int golpeNormal, String nombreGolpeBase, int golpeBase, String nombreSuperAtaque, int superAtaque) {
        super(nombre, puntosHp, puntosFuerza, nombreGolpeNormal, golpeNormal, nombreGolpeBase, golpeBase, nombreSuperAtaque, superAtaque);
    }

    @Override
    public String toString() {
        return "El Heroe " + nombre + " cuenta con " + puntosHp + " puntos de salud " + " , además cuenta con " + puntosFuerza + " puntos de fuerza";
    }
}
