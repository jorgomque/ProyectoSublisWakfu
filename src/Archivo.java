import java.util.ArrayList;
public class Archivo {
     private static ArrayList<Sublimacion> lista;

    public Archivo() {
        lista = new ArrayList<>();
    }

    public static void nuevaSubli(String nombre, String combinacion, String categoria, String efecto, String dropZone){
        lista.add(new Sublimacion(  nombre,  combinacion,  categoria, efecto, dropZone));
    }


    public static void cargarSublis() {
        // Ganancia de PA
        nuevaSubli("Retorno PA 4", "brg", "Ganancia de PA", "Recupera +2PA al matar un enemigo (máx 2 por turno)", "Stèle Cima Helada (Mazmorra nivel 200)");
        nuevaSubli("Resguardo 6", "brr", "Ganancia de PA", "Al final del turno, los PA no usados se transfieren al siguiente turno (máx 3)", "Stèle Volcán Or'Hodruin (Mazmorra nivel 200)");
        nuevaSubli("Vivacidad 2", "rbb", "Ganancia de PA", "+1PA -75 resistencias", "Stèle Cocodrilos (Mazmorra nivel 185) + recompensa de misión de Pandala (¡Por el Bambú Sagrado!)");
        nuevaSubli("Ganancia 6", "bbg", "Ganancia de PA", "Después de retirar PA o PM: +1PA (máx 3 por turno)", "Stèle Chacadores (Mazmorra nivel 215)");
        nuevaSubli("Fuerza Vital 2", "rbg", "Ganancia de PA", "Al inicio del turno, si los PV >= 90%: +1PA", "Stèle Carapattes (Mazmorra nivel 215)");
        nuevaSubli("Ruptura PA 4", "bbb", "Ganancia de PA", "Si retiras completamente la armadura de un objetivo: recuperas 2PA (máx 2 veces por turno)", "Stèle Abraknyde (Mazmorra nivel 140)");

        // Ganancia de PM
        nuevaSubli("Retorno PM 4", "brg", "Ganancia de PM", "Recupera +2PM al matar un enemigo (máx 2 por turno)", "Stèle Fuente del Mal (Mazmorra nivel 155)");
        nuevaSubli("Tolerancia 2", "rbb", "Ganancia de PM", "Al final del turno, 50% de los PM no usados se transfieren al siguiente turno (máx 2)", "Stèle de intervención Aguabrial (2) (Mazmorra Cima Helada nivel 200)");
        nuevaSubli("Velocidad 2", "grr", "Ganancia de PM", "+1PM -10% de daño infligido", "Stèle Tropikes (Mazmorra nivel 185) + recompensa de misión de Pandala (¡Por el Bambú Sagrado!)");
        nuevaSubli("Agilidad Vital 2", "gbr", "Ganancia de PM", "Al inicio del turno, si los PV >= 90%: +1PM", "Stèle Mansots (Mazmorra nivel 215)");
        nuevaSubli("Huida 6", "gbg", "Ganancia de PM", "Al esquivar a un enemigo (con pérdida): +1PM (máx 3 por turno)", "Stèle Jawdin de la Weine (Mazmorra nivel 140)");

        // Ganancia de PO
        nuevaSubli("Abandono 6", "grb", "Ganancia de PO", "+3PW +3PO -30% armadura dada y recibida (si maestrías secundarias = 0)", "Brecha de Amakna (mínimo nivel 111)");
        nuevaSubli("Visibilidad 2", "bgg", "Ganancia de PO", "+1PO -150 placaje -150 esquiva", "Stèle Kannibouls (Mazmorra nivel 185)");

        // Ganancia de PW
        nuevaSubli("Abandono 6", "grb", "Ganancia de PW", "+3PW +3PO -30% armadura dada y recibida (si maestrías secundarias = 0)", "Brecha de Amakna (mínimo nivel 111)");
        nuevaSubli("Dimensionalidad 2", "rbg", "Ganancia de PW", "+1PW en el turno 1 (no regenerable)", "Stèle Méka (Mazmorra nivel 170)");
        nuevaSubli("Devastación 3", "bbb", "Ganancia de PW", "+1PW -10 voluntad", "Stèle Kannivores (Mazmorra nivel 185)");
        nuevaSubli("Resguardo del Wakfu 2", "rbb", "Ganancia de PW", "-1PW / Al final del turno, +1PW si el portador no ha gastado PW", "Stèle Womewo (Mazmorra nivel 155)");
    }
    // Seguir sacando info desde esta página https://wakfu.guide/sublimations/
}