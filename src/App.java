
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        ArrayList<Heroe> Heroes = new ArrayList<>();
        ArrayList<Villano> Villanos = new ArrayList<>();

        // Definición de héroes
        Heroe Super_Man = new Heroe();
        Super_Man.setNombre("Super Man");
        Super_Man.setPuntosHp(800);
        Super_Man.setPuntosFuerza(200);
        Super_Man.setNombreGolpeBase("Puño");
        Super_Man.setGolpeBase(100);
        Super_Man.setNombreGolpeNormal("Vision calorifica");
        Super_Man.setGolpeNormal(130);
        Super_Man.setNombreSuperAtaque("Sol azul");
        Super_Man.setSuperAtaque(210);
        Heroes.add(Super_Man);

        Heroe BatMan = new Heroe();
        BatMan.setNombre("BatMan");
        BatMan.setPuntosHp(400);
        BatMan.setPuntosFuerza(100);
        BatMan.setNombreGolpeBase("Batarang");
        BatMan.setGolpeBase(70);
        BatMan.setNombreGolpeNormal("Bombas");
        BatMan.setGolpeNormal(100);
        BatMan.setNombreSuperAtaque("Hellbat");
        BatMan.setSuperAtaque(150);
        Heroes.add(BatMan);

        Heroe Flash = new Heroe();
        Flash.setNombre("Flash");
        Flash.setPuntosHp(400);
        Flash.setPuntosFuerza(150);
        Flash.setNombreGolpeBase("Golpe rapido");
        Flash.setGolpeBase(80);
        Flash.setNombreGolpeNormal("Patada cinetica");
        Flash.setGolpeNormal(150);
        Flash.setNombreSuperAtaque("Golpe temporal");
        Flash.setSuperAtaque(180);
        Heroes.add(Flash);

        // Definición de villanos
        Villano Darkseid = new Villano();
        Darkseid.setNombre("Darkseid");
        Darkseid.setPuntosHp(750);
        Darkseid.setPuntosFuerza(200);
        Darkseid.setNombreGolpeBase("Golpe destructor");
        Darkseid.setGolpeBase(120);
        Darkseid.setNombreGolpeNormal("Rayo omega");
        Darkseid.setGolpeNormal(200);
        Darkseid.setNombreSuperAtaque("Destructor de mundos");
        Darkseid.setSuperAtaque(230);
        Villanos.add(Darkseid);

        Villano Joker = new Villano();
        Joker.setNombre("Joker");
        Joker.setPuntosHp(350);
        Joker.setPuntosFuerza(140);
        Joker.setNombreGolpeBase("Gas de la risa");
        Joker.setGolpeBase(80);
        Joker.setNombreGolpeNormal("Caja sorpresa");
        Joker.setGolpeNormal(140);
        Joker.setNombreSuperAtaque("Evento especial");
        Joker.setSuperAtaque(170);
        Villanos.add(Joker);

        Villano ReverseFlash = new Villano();
        ReverseFlash.setNombre("Reverse-Flash");
        ReverseFlash.setPuntosHp(410);
        ReverseFlash.setPuntosFuerza(120);
        ReverseFlash.setNombreGolpeBase("Golpe de tiempo");
        ReverseFlash.setGolpeBase(90);
        ReverseFlash.setNombreGolpeNormal("Atemporal");
        ReverseFlash.setGolpeNormal(120);
        ReverseFlash.setNombreSuperAtaque("Distorcion");
        ReverseFlash.setSuperAtaque(180);
        Villanos.add(ReverseFlash);

        String eleccion, personajeElegido;
        int opcion;
        boolean found;
        Heroe heroeSeleccionado = null;
        Villano villanoSeleccionado = null;

        do {
            System.out.println("Bienvenido al juego de Heroes vs Villanos");
            System.out.println("1_Empezar la lucha");
            System.out.println("2_Rendirme");
            opcion = scn.nextInt();
            scn.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("En qué bando deseas luchar (heroes/villanos)");
                    eleccion = scn.nextLine().toLowerCase();

                    if (eleccion.equalsIgnoreCase("heroes")) {
                        System.out.println("Los héroes disponibles son: ");
                        Heroes.forEach(elemento -> System.out.println(elemento.getNombre()));
                        System.out.println("¿Qué personaje deseas elegir?");
                        personajeElegido = scn.nextLine();
                        found = false;

                        for (Heroe heroe : Heroes) {
                            if (heroe.getNombre().equalsIgnoreCase(personajeElegido)) {
                                System.out.println("Has elegido a " + heroe.getNombre());
                                heroeSeleccionado = heroe;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("No contamos con ese personaje. Por favor vuelve a elegir.");
                            continue;
                        }

                        // Selección aleatoria de un villano
                        villanoSeleccionado = Villanos.get((int) (Math.random() * Villanos.size()));

                    } else if (eleccion.equalsIgnoreCase("villanos")) {
                        System.out.println("Los villanos disponibles son:");
                        Villanos.forEach(villano -> System.out.println(villano.getNombre()));
                        System.out.println("Elige el villano: ");
                        personajeElegido = scn.nextLine();
                        found = false;

                        for (Villano villano : Villanos) {
                            if (villano.getNombre().equalsIgnoreCase(personajeElegido)) {
                                System.out.println("Has elegido a " + villano.getNombre());
                                villanoSeleccionado = villano;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("No contamos con ese personaje. Por favor vuelve a elegir.");
                            continue;
                        }

                        // Selección aleatoria de un héroe
                        heroeSeleccionado = Heroes.get((int) (Math.random() * Heroes.size()));
                    } else {
                        System.out.println("Opción inválida. Por favor elige entre 'heroes' o 'villanos'.");
                        continue;
                    }

                    // Iniciar batalla
                    if (heroeSeleccionado != null && villanoSeleccionado != null) {
                        System.out.println("La batalla comienza entre " + heroeSeleccionado.getNombre() + " y " + villanoSeleccionado.getNombre());

                        while (heroeSeleccionado.getPuntosHp() > 0 && villanoSeleccionado.getPuntosHp() > 0) {
                            // Turno del héroe
                            System.out.println("Elige tu ataque:");
                            if (eleccion.equalsIgnoreCase("heroes")) {
                                System.out.println("1. " + heroeSeleccionado.getNombreGolpeBase() + " (Daño: " + heroeSeleccionado.getGolpeBase() + ")");
                                System.out.println("2. " + heroeSeleccionado.getNombreGolpeNormal() + " (Daño: " + heroeSeleccionado.getGolpeNormal() + ")");
                                System.out.println("3. " + heroeSeleccionado.getNombreSuperAtaque() + " (Daño: " + heroeSeleccionado.getSuperAtaque() + ")");
                                int ataqueHeroe = scn.nextInt();
                                int danioHeroe = 0;

                                switch (ataqueHeroe) {
                                    case 1:
                                        danioHeroe = heroeSeleccionado.getGolpeBase();
                                        break;
                                    case 2:
                                        danioHeroe = heroeSeleccionado.getGolpeNormal();
                                        break;
                                    case 3:
                                        danioHeroe = heroeSeleccionado.getSuperAtaque();
                                        break;
                                    default:
                                        System.out.println("Ataque no válido.");
                                        continue;
                                }

                                villanoSeleccionado.setPuntosHp(villanoSeleccionado.getPuntosHp() - danioHeroe);
                                System.out.println(heroeSeleccionado.getNombre() + " inflige " + danioHeroe + " puntos de daño a " + villanoSeleccionado.getNombre());

                                if (villanoSeleccionado.getPuntosHp() <= 0) {
                                    System.out.println("¡" + villanoSeleccionado.getNombre() + " ha sido derrotado!");
                                    break;
                                }

                            } else if (eleccion.equalsIgnoreCase("villanos")) {
                                System.out.println("1. " + villanoSeleccionado.getNombreGolpeBase() + " (Daño: " + villanoSeleccionado.getGolpeBase() + ")");
                                System.out.println("2. " + villanoSeleccionado.getNombreGolpeNormal() + " (Daño: " + villanoSeleccionado.getGolpeNormal() + ")");
                                System.out.println("3. " + villanoSeleccionado.getNombreSuperAtaque() + " (Daño: " + villanoSeleccionado.getSuperAtaque() + ")");
                                int ataqueVillano = scn.nextInt();
                                int danioVillano = 0;

                                switch (ataqueVillano) {
                                    case 1:
                                        danioVillano = villanoSeleccionado.getGolpeBase();
                                        break;
                                    case 2:
                                        danioVillano = villanoSeleccionado.getGolpeNormal();
                                        break;
                                    case 3:
                                        danioVillano = villanoSeleccionado.getSuperAtaque();
                                        break;
                                    default:
                                        System.out.println("Ataque no válido.");
                                        continue;
                                }

                                heroeSeleccionado.setPuntosHp(heroeSeleccionado.getPuntosHp() - danioVillano);
                                System.out.println(villanoSeleccionado.getNombre() + " inflige " + danioVillano + " puntos de daño a " + heroeSeleccionado.getNombre());

                                if (heroeSeleccionado.getPuntosHp() <= 0) {
                                    System.out.println("¡" + heroeSeleccionado.getNombre() + " ha sido derrotado!");
                                    break;
                                }
                            }

                            System.out.println("Después del ataque, " + heroeSeleccionado.getNombre() + " tiene " + heroeSeleccionado.getPuntosHp() + " puntos de vida.");
                            System.out.println("Después del ataque, " + villanoSeleccionado.getNombre() + " tiene " + villanoSeleccionado.getPuntosHp() + " puntos de vida.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Te has rendido. Fin del juego.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 2);

        System.out.println("Espero que hayas disfrutado la batalla.");
        scn.close();
    }
}
