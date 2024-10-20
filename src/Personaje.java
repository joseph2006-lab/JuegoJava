
public class Personaje {

    String nombre;
    int puntosHp;
    int puntosFuerza;
    String nombreGolpeNormal;
    int golpeNormal;
    String nombreGolpeBase;
    int golpeBase;
    String nombreSuperAtaque;
    int superAtaque;

    public Personaje(String nombre, int puntosHp, int puntosFuerza, String nombreGolpeNormal, int golpeNormal,
            String nombreGolpeBase, int golpeBase, String nombreSuperAtaque, int superAtaque) {
        this.nombre = nombre;
        this.puntosHp = puntosHp;
        this.puntosFuerza = puntosFuerza;
        this.nombreGolpeNormal = nombreGolpeNormal;
        this.golpeNormal = golpeNormal;
        this.nombreGolpeBase = nombreGolpeBase;
        this.golpeBase = golpeBase;
        this.nombreSuperAtaque = nombreSuperAtaque;
        this.superAtaque = superAtaque;
    }

    public Personaje() {

    }

    public String getNombreGolpeNormal() {
        return nombreGolpeNormal;
    }

    public void setNombreGolpeNormal(String nombreGolpeNormal) {
        this.nombreGolpeNormal = nombreGolpeNormal;
    }

    public int getGolpeNormal() {
        return golpeNormal;
    }

    public void setGolpeNormal(int golpeNormal) {
        this.golpeNormal = golpeNormal;
    }

    public String getNombreGolpeBase() {
        return nombreGolpeBase;
    }

    public void setNombreGolpeBase(String nombreGolpeBase) {
        this.nombreGolpeBase = nombreGolpeBase;
    }

    public int getGolpeBase() {
        return golpeBase;
    }

    public void setGolpeBase(int golpeBase) {
        this.golpeBase = golpeBase;
    }

    public String getNombreSuperAtaque() {
        return nombreSuperAtaque;
    }

    public void setNombreSuperAtaque(String nombreSuperAtaque) {
        this.nombreSuperAtaque = nombreSuperAtaque;
    }

    public int getSuperAtaque() {
        return superAtaque;
    }

    public void setSuperAtaque(int superAtaque) {
        this.superAtaque = superAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosHp() {
        return puntosHp;
    }

    public void setPuntosHp(int puntosHp) {
        this.puntosHp = puntosHp;
    }

    public int getPuntosFuerza() {
        return puntosFuerza;
    }

    public void setPuntosFuerza(int puntosFuerza) {
        this.puntosFuerza = puntosFuerza;
    }

}
