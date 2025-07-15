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
        // Ganancia de PV
        nuevaSubli("Cicatrización 6", "rrb", "Ganancia de PV", "+30% PV", "Stèle Tumba de Pandala (Mazmorra nivel 200)");

        // Ganancia de Golpes Críticos
        nuevaSubli("Crítico Berserk 6", "rgg", "Ganancia de Golpes Críticos", "Si los PV están por debajo del 50%: +30% cc", "Stèle Tumba de Pandala (Mazmorra nivel 200)");
        nuevaSubli("Influencia de Wakfu II", "rrb", "Ganancia de Golpes Críticos", "+20% cc si el portador comienza su turno con todos sus PW", "Brecha de Sufokia (nivel mínimo 66)");
        nuevaSubli("Estupefacción 4", "gbg", "Ganancia de Golpes Críticos", "+20% cc (1 turno) +20% del nivel en maestría crítica (1 turno)", "Stèle Guarida de los Blérox (Mazmorra nivel 200)");
        nuevaSubli("Ambición 6", "gbr", "Ganancia de Golpes Críticos", "Al inicio del primer turno, si las maestrías secundarias ≤ 0: +30% cc", "Brecha de la Shukrute (nivel mínimo 216)");
        nuevaSubli("Influencia 6", "gbg", "Ganancia de Golpes Críticos", "+18% cc", "Drop en Mímico Rúnico");
        nuevaSubli("Influencia lenta 4", "rgg", "Ganancia de Golpes Críticos", "+4% cc por turno (máx 30)", "Stèle E-Bou (Mazmorra nivel 170)");
        nuevaSubli("Devastación secundaria 6", "ggg", "Ganancia de Golpes Críticos", "+9% cc +9% parada +9 voluntad", "Stèle Cañón de los Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Teoría de la materia 2", "bgr", "Ganancia de Golpes Críticos", "+100% cc -50% daños y curas", "Stèle Méka (Mazmorra nivel 170)");
        nuevaSubli("Influencia vital 6", "grg", "Ganancia de Golpes Críticos", "Si los PV están por encima del 90%: +24% cc", "Stèle Crustargneux (Mazmorra nivel 215)");
        nuevaSubli("Balance crítico 6", "gbg", "Ganancia de Golpes Críticos", "Por cada hechizo no crítico: +12% cc acumulativo. El bonus se pierde al siguiente golpe crítico", "Stèle Plantigardes (Mazmorra nivel 215)");
        // Ganancia de Voluntad
        nuevaSubli("Levedad 3", "brb", "Ganancia de Voluntad", "Tras perder 3 PM: +30 Voluntad", "Stèle Santuario de los Dragoeufs (Mazmorra nivel 200)");
        nuevaSubli("Tenacidad 2", "rbr", "Ganancia de Voluntad", "Tras perder 2 PA: +10 Voluntad (3 turnos)", "Stèle Cañón de los Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Facilidad 2", "brb", "Ganancia de Voluntad", "Tras perder 2 PM: +10 Voluntad (3 turnos)", "Stèle Fuente del mal (Mazmorra nivel 155)");
        nuevaSubli("Ciclotimia 2", "bgr", "Ganancia de Voluntad", "+20 Voluntad en turnos pares, -20 en impares", "Stèle Womewo (Mazmorra nivel 155)");
        nuevaSubli("Clamor 6", "vbr", "Ganancia de Voluntad", "-20 Voluntad. Reduce en 1 las próximas 3 pérdidas de PM. Se reaplica cada turno", "Stèle Cocodrilos (Mazmorra nivel 185)");
        nuevaSubli("Reprobación 6", "grg", "Ganancia de Voluntad", "-20 Voluntad. Reduce en 1 las próximas 3 pérdidas de PA. Se reaplica cada turno", "Drop en Mímico Rúnico");
        nuevaSubli("Firmeza 3", "rbr", "Ganancia de Voluntad", "Tras perder 3 PA: +30 Voluntad", "Stèle Volcán Or'Hodruin (Mazmorra nivel 200)");
        nuevaSubli("Devastación secundaria 6", "ggg", "Ganancia de Voluntad", "+9% cc +9% parada +9 Voluntad", "Stèle Cañón de los Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Lucro 6", "bbg", "Ganancia de Voluntad", "Tras retirar PA o PM: +1 PA (máx 3 por turno)", "Stèle Cagnardeurs (Mazmorra nivel 215)");
        nuevaSubli("Voluntad directa 6", "bgb", "Ganancia de Voluntad", "+18 Voluntad durante tu turno / -24 fuera de tu turno", "Stèle Vandalienés (Mazmorra nivel 215)");
        nuevaSubli("Voluntad indirecta 6", "gbg", "Ganancia de Voluntad", "+18 Voluntad fuera de tu turno / -24 durante tu turno", "Stèle Compost del Gran Potofeu (Mazmorra nivel 140)");

        // Ganancia de Parada
        nuevaSubli("Esquiva lenta 4", "rrv", "Ganancia de Parada", "+6% de Parada por turno (máx 40)", "Stèle Ciudad Prohibida (Mazmorra 3 jugadores nivel 185)");
        nuevaSubli("Esquiva 6", "bbg", "Ganancia de Parada", "+30% Parada en t1", "Stèle Jardín de la Weine (Mazmorra nivel 140)");
        nuevaSubli("Parada Berserk 6", "bgb", "Ganancia de Parada", "+30% Parada si PV < 50%", "Stèle Guarida de los Blérox (Mazmorra nivel 200)");
        nuevaSubli("Pretensión 6", "gbg", "Ganancia de Parada", "Al inicio de t1, si maestría secundaria ≤ 0: +30% Parada", "Brecha de Osamosa (nivel mínimo 201)");
        nuevaSubli("Devastación secundaria 6", "ggg", "Ganancia de Parada", "+9% cc +9% Parada +9 Voluntad", "Stèle Cañón de los Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Conservación 4", "bgb", "Ganancia de Parada", "+40% Parada cuando PV > 90%", "Stèle Vandalienés (Mazmorra nivel 215)");
        nuevaSubli("Esquiva continua 6", "vvg", "Ganancia de Parada", "+18% Parada", "Stèle Tundrasierra (Mazmorra nivel 215)");

        // Ganancia de Resistencias
        nuevaSubli("Prosperidad 4", "grb", "Ganancia de Resistencias", "+12% a las bonificaciones de características recibidas (maestrías, resistencias, armadura) lanzadas por un aliado", "Stèle Fuente del mal (Mazmorra nivel 155)");
        nuevaSubli("Tenacidad 4", "ggb", "Ganancia de Resistencias", "Al final del turno, si el portador tiene 2 PA o más: +50 resistencias elementales (1 turno)", "Stèle Palacio Lenald (Mazmorra nivel 140)");
        nuevaSubli("Coraza 2", "rbb", "Ganancia de Resistencias", "-1 PA +75 resistencias elementales", "Brecha Última Shukrute (nivel mínimo 216)");
        nuevaSubli("Persistencia 2", "rgr", "Ganancia de Resistencias", "Al final del turno, si el portador tiene 6 PA o más: +60 resistencias elementales (2 turnos)", "Stèle Cañón de los Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Escudo crítico 6", "bgr", "Ganancia de Resistencias", "+30 resistencias a golpes críticos", "Stèle Tundrasierra (Mazmorra nivel 215)");
        nuevaSubli("Escudo dorsal 6", "rgg", "Ganancia de Resistencias", "+30 resistencias por la espalda", "Stèle Carapattes (Mazmorra nivel 215)");
        nuevaSubli("Últimas resistencias 6", "bgb", "Ganancia de Resistencias", "Al caer por debajo del 20% PV (1 vez por combate): +120 resistencias elementales (1 turno)", "Stèle Sableópteros (Mazmorra nivel 155)");

        //Ganancia de esquiva
        nuevaSubli("Evasión 6", "rbr", "Ganancia de Esquiva", "+300 % del nivel en esquiva", "Stèle Espora Negra (Mazmorra nivel 140)");
        nuevaSubli("Robo de esquiva 4", "ggb", "Ganancia de Esquiva", "-10 % de daños con arma; al infligir daño con arma a dos manos: roba 60 % del nivel en esquiva (máx 1 vez/turno)", "Brèche de Bonta (nivel mínimo 21)");

        //ganancia de placaje
        nuevaSubli("Combate cercano 2", "rvg", "Ganancia de Tacle", "-1 PO +100 % del nivel en tacle y esquiva", "Brecha Shukrute (nivel mínimo 216)");
        nuevaSubli("Intercepción 6", "rgr", "Ganancia de Tacle", "+300 % del nivel en tacle", "Stèle Trouffe Salée (Mazmorra nivel 140)");
        nuevaSubli("Tacle Berserk 6", "bbb", "Ganancia de Tacle", "Si PV < 50 %: +300 % del nivel en tacle", "Stèle Cocodrilos (Mazmorra nivel 185)");
        nuevaSubli("Robo de tacle 4", "vvr", "Ganancia de Tacle", "-10 % de daños con arma; al infligir daño con arma a dos manos: roba 60 % del nivel en tacle (máx 1 vez/turno)", "Brecha de Tainela (nivel mínimo 21)");

        //Ganancia de dominio elemental
        nuevaSubli("Carnicería 6", "rrv", "Aumento de Maestría Elemental", "Si PV > 90 %: +90 % del nivel en maestría elemental", "Stèle Cresta Helada (Mazmorra nivel 200)");
        nuevaSubli("Experto en armas ligeras 6", "rbr", "Aumento de Maestría Elemental", "+150 % del nivel en maestría elem y +12 % daños infligidos a objetivos con armadura (si no lleva escudo, daga ni arma a dos manos)", "Brecha Última Frigost (nivel mínimo 111)");
        nuevaSubli("Prosperidad 4", "vrb", "Aumento de Maestría Elemental", "+12 % a las bonificaciones de características recibidas (maestrías, resistencias, armadura) lanzadas por un aliado", "Stèle Fuente del mal (Mazmorra nivel 155)");
        nuevaSubli("Devastación 4", "vvv", "Aumento de Maestría Elemental", "Inicio del combate: +20 % del nivel a todas las maestrías y +12 a todas las resistencias", "Stèle Volcán Or'Hodruin (Mazmorra nivel 200)");
        // Daños
        nuevaSubli("Potencia Bruta 4", "vvv", "Daños", "-4 PW. Por cada PW usado durante el turno: +8 % de daños infligidos (1 turno, máx. 16 %)", "Brecha Última Zinit (nivel mínimo 201)");
        nuevaSubli("Armadura Pesada 2", "rvb", "Daños", "-1 PM, +10 % de daños infligidos", "Brecha Última Shukrute (nivel mínimo 216)");
        nuevaSubli("Experto en armas ligeras 6", "rbr", "Daños", "+150 % del nivel en maestría elemental y +12 % daños si el objetivo tiene armadura (sin escudo, daga ni arma a dos manos)", "Brecha Última Frigost (nivel mínimo 111)");
        nuevaSubli("Pluma Ligera 4", "rrr", "Daños", "Por cada PM > 4 al inicio del combate: +8 % de daños (máx. 24 %)", "Brecha Última Shukrute (nivel mínimo 216)");
        nuevaSubli("Lobo Solitario 4", "rbv", "Daños", "+8 % de daños infligidos si no hay aliados entre 1 y 4 casillas", "Stèle Aguabrial (Mazmorra Volcán Or'Hodruin, nivel 200)");
        nuevaSubli("Ser Sensible 4", "rvg", "Daños", "+8 % de daños infligidos si hay al menos 2 aliados entre 1 y 4 casillas", "Brecha Última Zinit (nivel mínimo 201)");
        nuevaSubli("Locura 4", "rvr", "Daños", "+24 % de daños infligidos en diagonal", "Stèle Womewo (Mazmorra nivel 155)");
        nuevaSubli("Fuerza Ligera 6", "vvr", "Daños", "+18 % de daños infligidos si no tienes armadura", "Stèle Plantigardes (Mazmorra nivel 215)");
        nuevaSubli("Focalización 2", "vrr", "Daños", "-15 % de daños infligidos. Si solo se dañó a un enemigo el turno anterior: +25 % de daños al inicio del turno", "Stèle E-Bou (Mazmorra nivel 170)");
        nuevaSubli("Propagación 4", "rvg", "Daños", "Una vez por turno, al hacer daño: inflige 40 % del nivel como daño de luz a enemigos alineados", "Stèle Jawdin de la Weine (Mazmorra nivel 140)");
        nuevaSubli("Sangrante 4", "rvr", "Daños", "Por cada malus o pérdida infligida: +8 % daños recibidos por la víctima (máx. 40 %)", "Stèle Cagnardeurs (Mazmorra nivel 215)");
        nuevaSubli("Temporización 4", "vrb", "Daños", "Inicio de turno: si no se usaron PW el turno anterior: +16 % daños y curas", "Brecha Última Shukrute (nivel mínimo 216)");
        nuevaSubli("Quemadura 4", "rrb", "Daños", "+16 % de daños fuego", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Escarcha 4", "bbv", "Daños", "+16 % de daños agua", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Tellurismo 4", "vvr", "Daños", "+16 % de daños tierra", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Ventilación 4", "rbv", "Daños", "+16 % de daños aire", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Represalias 4", "rrv", "Daños", "+24 % de daños infligidos a enemigos que te dañaron a distancia (no acumulable)", "Stèle Mansots (Mazmorra nivel 215)");
        nuevaSubli("Quemadura secundaria 4", "rrv", "Daños", "Lanzando un hechizo agua/tierra/aire: +8 % daño al próximo hechizo fuego (máx. 30 %)", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Escarcha secundaria 4", "vvb", "Daños", "Lanzando un hechizo fuego/tierra/aire: +8 % daño al próximo hechizo agua (máx. 30 %)", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Tellurismo secundario 4", "bbr", "Daños", "Lanzando un hechizo fuego/agua/aire: +8 % daño al próximo hechizo tierra (máx. 30 %)", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Ventilación secundaria 4", "rvv", "Daños", "Lanzando un hechizo fuego/agua/tierra: +8 % daño al próximo hechizo aire (máx. 30 %)", "Stèle Blopéra (Mazmorra nivel 155)");
        //melee
        nuevaSubli("Embuscade 6", "bbr", "Daños mêlée", "+12 % de daños infligidos a objetivos en contacto", "Stèle Méka (Mazmorra nivel 170)");
        nuevaSubli("Embuscade écartée 6", "rrb", "Daños mêlée", "+24 % de daños a objetivos exactamente a 2 casillas", "Stèle Tumba de Pandala (Mazmorra nivel 200)");
        nuevaSubli("Apprêt 6", "rbr", "Daños mêlée", "+6 % de daños el turno siguiente por cada enemigo cuerpo a cuerpo al final de tu turno", "Stèle Mansots (Mazmorra nivel 215)");
        //Distancia
        nuevaSubli("Longueur 6", "brr", "Daños distancia", "+12 % de daños a objetivos alineados y a 2 o más casillas", "Drop Mimic Runique");
        nuevaSubli("Verrouillage 6", "vrv", "Daños distancia", "+24 % de daños a objetivos sin línea de visión a 3 casillas o más", "Brecha Shukrute (nivel mínimo 216)");
        nuevaSubli("Acribie 6", "rvr", "Daños distancia", "+12 % de daños a objetivos a 5 casillas o más", "Stèle Crustargneux (Mazmorra nivel 215)");
        nuevaSubli("Vision intermédiaire 6", "brb", "Daños distancia", "+18 % de daños a objetivos a exactamente 3 PO", "Stèle Noirespore (Mazmorra nivel 140)");
        // Focus
        nuevaSubli("Focalisation 2", "vrr", "Daños monocible", "-15 % de daños infligidos. Si solo se dañó a un enemigo el turno anterior: +25 % de daños al inicio del turno", "Stèle E-Bou (Mazmorra nivel 170)");

        // Daño zona
        nuevaSubli("Fureur 2", "rvb", "Daños zona", "-15 % de daños, +5 % por entidad tocada el turno anterior", "Stèle Tanière des Blérox (Mazmorra nivel 200)");
        nuevaSubli("Frénésie 2", "rvv", "Daños zona", "-20 % de daños, al inicio del turno +10 % por enemigo tocado el turno anterior", "Stèle d'intervention Aguabrial (Mazmorra nivel 200)");
        nuevaSubli("Propagation 4", "rvb", "Daños zona", "1 vez por turno: 40 % del nivel como daño de luz a objetivos alineados con la víctima", "Stèle Jawdin de la Weine (Mazmorra nivel 140)");
        //Daño critico
        nuevaSubli("Expert des coups critiques 4", "bvv", "Críticos", "Fin de turno: si hubo CC, +8 % de los PV faltantes del lanzador", "Stèle Crête Givrée (Mazmorra nivel 200)");
        nuevaSubli("Préparation critique 4", "rvv", "Críticos", "Por cada CC (máx 5): +8 preparación → +8 % daños en siguiente hechizo del próximo turno", "Brecha Shukrute (nivel mínimo 216)");
        nuevaSubli("Stupéfaction 4", "vbv", "Críticos", "+20 % cc (1 turno), +20 % del nivel en dominio crítico (1 turno)", "Stèle Tanière des Blérox (Mazmorra nivel 200)");
        nuevaSubli("Wakfu Berzerk 4", "bbr", "Críticos", "Si inicia turno con 50 % o menos PW: +12 % daños crit +400 % del nivel en armadura", "Brèche Ultime Frigost (nivel 111)");
        nuevaSubli("Critique tactique 4", "rvv", "Críticos", "+12 % daños crit si la víctima tiene >50 % HP, -12 % si <50 %", "Brèche d'Osamosa (nivel 201)");
        nuevaSubli("Critique technique 2", "rvb", "Críticos", "Primer CC del turno: +12 % de daño. Los demás: -6 %", "Brèche d'Amakna (nivel 111)");
        nuevaSubli("Consolation critique 4", "bvb", "Críticos", "Por cada hechizo sin CC: +8 % daño al próximo CC (máx 40 %)", "Stèle Carapattes (Mazmorra)");
        nuevaSubli("Courage 6", "brb", "Críticos", "+12 % daños y curas no críticos, -12 % daños y curas críticos", "Brèche Ultime Frigost (nivel 111)");
        //Invocaciones
        nuevaSubli("Armure Lourde 2", "rvb", "Invocación", "-1PM +10 % daños", "Brèche Ultime Shukrute (nivel 216)");
        nuevaSubli("Carapace 2", "rbb", "Invocación", "-1PA +75 res elementales", "Brèche Ultime Shukrute (nivel 216)");
        nuevaSubli("Cicatrisation 6", "rrb", "Invocación", "+30 % de PV", "Stèle Tombeau de Pandala (Mazmorra nivel 200)");
        nuevaSubli("Combat rapproché 2", "rvb", "Invocación", "-1PO +100 % del nivel en tacle y esquiva", "Brèche Shukrute (nivel 216)");
        nuevaSubli("Dévastation 3", "bbb", "Invocación", "+1PW -10 voluntad", "Stèle Kannivores (Mazmorra nivel 185)");
        nuevaSubli("Ecailles de lune 6", "vbr", "Invocación", "+18 % armadura recibida", "Stèle Sanctuaire des Dragoeufs (Mazmorra nivel 200)");
        nuevaSubli("Enveloppe rocheuse 6", "rbb", "Invocación", "+18 % armadura otorgada", "Stèle Abraknyde (Mazmorra nivel 140)");
        nuevaSubli("Influence 6", "vbv", "Invocación", "+18 % cc", "Drop Mimic Runique");
        nuevaSubli("Ravage secondaire 6", "vvv", "Invocación", "+9 % cc, +9 % parada, +9 voluntad", "Stèle Canyon des Fléopards (Mazmorra nivel 200)");
        nuevaSubli("Ravage 4", "vvv", "Invocación", "Inicio de combate: +20 % nivel en maestrías, +12 res", "Stèle Volcan Or'Hodruin (Mazmorra nivel 200)");
        nuevaSubli("Poids plume 4", "rrr", "Invocación", "+8 % de daño por cada PM > 4 (máx 24 %)", "Brèche Ultime Shukrute (nivel 216)");
        nuevaSubli("Ruine 6", "rrr", "Invocación", "+30 % de daños indirectos", "Stèle Sabléoptères (Mazmorra nivel 155)");
        nuevaSubli("Théorie de la matière 2", "bvr", "Invocación", "+100 % cc, -50 % daños y curas", "Stèle Méka (Mazmorra nivel 170)");
        nuevaSubli("Vélocité 2", "vrr", "Invocación", "+1PM -10 % de daño", "Stèle Tropikes / Recompensa de misión Pandala");
        nuevaSubli("Visibilité 2", "bvv", "Invocación", "+1PO -150 tacle y esquiva", "Stèle Kannibouls (Mazmorra nivel 185)");
        nuevaSubli("Interception 6", "rvr", "Invocación", "+300 % del nivel en tacle", "Stèle Trouffe Salée (Mazmorra nivel 140)");
        nuevaSubli("Evasion 6", "rbr", "Invocación", "+300 % del nivel en esquiva", "Stèle Noirespore (Mazmorra nivel 140)");
        nuevaSubli("Dérobade continue 6", "vvr", "Invocación", "+18 % parada", "Stèle Toundrasoirs (Mazmorra nivel 215)");
        nuevaSubli("Bouclier critique 6", "bvr", "Invocación", "+30 resistencia a críticos", "Stèle Toundrasoirs (Mazmorra nivel 215)");
        nuevaSubli("Bouclier dorsal 6", "rvv", "Invocación", "+30 resistencia por la espalda", "Stèle Carapattes (Mazmorra nivel 215)");
        // berserker
        nuevaSubli("Dernier souffle 6", "vbr", "Berserk", "Inicio de turno con <20 % PV: +18 % daños y +300 % del nivel en armadura", "Brèche Ultime Zinit (mínimo nivel 201)");
        nuevaSubli("Esquive Berserk 6", "bbr", "Berserk", "+300 % del nivel en esquiva si PV <50 %", "Stèle Kannivores (Mazmorra nivel 185)");
        nuevaSubli("Parade Berserk 6", "brb", "Berserk", "+30 % parada si PV <50 %", "Stèle Tanière des Blérox (Mazmorra nivel 200)");
        nuevaSubli("Précaution 4", "rvr", "Berserk", "Final de turno con <50 % PV: cura 20 % de PV faltantes", "Brèche d'Amakna (nivel 111 mínimo)");
        nuevaSubli("Tacle Berserk 6", "bbb", "Berserk", "+300 % del nivel en tacle si PV <50 %", "Stèle Crocodailles (Mazmorra nivel 185)");

        //Solo hechizo
        nuevaSubli("Dernier souffle 6", "vbr", "Berserk", "Inicio de turno con <20 % PV: +18 % daños y +300 % del nivel en armadura", "Brèche Ultime Zinit (mínimo nivel 201)");
        nuevaSubli("Esquive Berserk 6", "bbr", "Berserk", "+300 % del nivel en esquiva si PV <50 %", "Stèle Kannivores (Mazmorra nivel 185)");
        nuevaSubli("Parade Berserk 6", "brb", "Berserk", "+30 % parada si PV <50 %", "Stèle Tanière des Blérox (Mazmorra nivel 200)");
        nuevaSubli("Précaution 4", "rvr", "Berserk", "Final de turno con <50 % PV: cura 20 % de PV faltantes", "Brèche d'Amakna (nivel 111 mínimo)");
        nuevaSubli("Tacle Berserk 6", "bbb", "Berserk", "+300 % del nivel en tacle si PV <50 %", "Stèle Crocodailles (Mazmorra nivel 185)");
        //Daño de frente
        nuevaSubli("Relations sociales 6", "bvb", "Daño frontal/dorsal", "+12 % daños de espalda en turnos pares, +12 % de frente en turnos impares", "Brèche Moon (nivel mínimo 171)");
        //optimizacion t1
        nuevaSubli("Stupéfaction 4", "vbv", "Turno 1", "+20 % CC (1 turno), +20 % del nivel en dominio crítico (1 turno)", "Stèle Tanière des Blérox (Mazmorra nivel 200)");
        nuevaSubli("Dérobade 6", "bbv", "Turno 1", "+30 % de parada en turno 1", "Stèle Jawdin de la Weine (Mazmorra nivel 140)");
        nuevaSubli("Force vitale 2", "rvb", "Turno 1", "Inicio de turno con PV ≥90 %: +1 PA", "Stèle Carapattes (Mazmorra nivel 215)");
        nuevaSubli("Agilité vitale 2", "vbr", "Turno 1", "Inicio de turno con PV ≥90 %: +1 PM", "Stèle Mansots (Mazmorra nivel 215)");
        nuevaSubli("Influence vitale 6", "vrv", "Turno 1", "Si PV >90 %: +24 % de Golpe Crítico", "Stèle Crustargneux (Mazmorra nivel 215)");
        nuevaSubli("Influence de Wakfu II", "rrb", "Turno 1", "+20 % CC si empieza el turno con todos sus PW", "Brèche de Sufokia (nivel mínimo 66)");
        nuevaSubli("Force légère 6", "vvr", "Turno 1", "+18 % daños infligidos mientras no tenga armadura", "Stèle Plantigardes (Mazmorra nivel 215)");

        //Ardiente
        nuevaSubli("Retour enflammé 2", "rrv", "Enflammé", "Gana 100 % del nivel en Enflammé al matar un enemigo (1 vez por turno)", "Brèche de Bonta (nivel mínimo 141)");
        nuevaSubli("Ruine 6", "rrr", "Enflammé", "+30 % de daños indirectos", "Stèle Sabléoptères (Mazmorra nivel 155)");
        nuevaSubli("Ruine cyclique 2", "rrr", "Enflammé", "+20 % de daños indirectos en turnos pares", "Stèle Cité interdite (Mazmorra 3 jugadores nivel 185)");
        //Daños indirectos
        nuevaSubli("Ruine 6", "rrr", "Daños indirectos", "+30 % de daños indirectos", "Stèle Sabléoptères (Mazmorra nivel 155)");
        nuevaSubli("Ruine cyclique 2", "rrr", "Daños indirectos", "+20 % daños indirectos en turnos pares", "Stèle Cité interdite (Mazmorra 3 jugadores nivel 185)");
        nuevaSubli("Contre-attaque 6", "rvr", "Daños indirectos", "Recibe daño cuerpo a cuerpo: +60 % del nivel en daño de luz (1 vez por turno)", "Brèche de Sufokia (nivel mínimo 66)");
        nuevaSubli("Valeur ajoutée 4", "bvv", "Daños indirectos", "Por cada daño indirecto: +8 % daño indirecto y -8 % directo (máx 40 %), reinicio al inicio del turno", "???");
        //  Mono elemental
        nuevaSubli("Brûlure secondaire 4", "rrv", "Mono fuego", "Lanzar hechizo agua/tierra/aire: +8 % daños al siguiente hechizo de fuego (máx 30)", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Gel secondaire 4", "vvb", "Mono agua", "Lanzar hechizo fuego/tierra/aire: +8 % daños al siguiente hechizo de agua (máx 30)", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Tellurisme secondaire 4", "bbr", "Mono tierra", "Lanzar hechizo fuego/agua/aire: +8 % daños al siguiente hechizo de tierra (máx 30)", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Ventilation secondaire 4", "rvv", "Mono aire", "Lanzar hechizo fuego/agua/tierra: +8 % daños al siguiente hechizo de aire (máx 30)", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Brûlure 4", "rrb", "Mono fuego", "+16 % daños fuego", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Gel 4", "bbv", "Mono agua", "+16 % daños agua", "Stèle Blopéra (Mazmorra nivel 155)");
        nuevaSubli("Tellurisme 4", "vvr", "Mono tierra", "+16 % daños tierra", "Stèle Enutrosor (Mazmorra nivel 155)");
        nuevaSubli("Ventilation 4", "rbv", "Mono aire", "+16 % daños aire", "Stèle Enutrosor (Mazmorra nivel 155)");
        //Brecha
        nuevaSubli("Retour PM 4", "brv", "Brèches", "+2 PM al matar un enemigo (máx 2 por turno)", "Stèle Source du mal (Mazmorra nivel 155)");
        nuevaSubli("Retour vital 2", "vrv", "Brèches", "Cura 20 % de PV perdidos al matar un enemigo (máx 2 por turno)", "Brèche de Tainéla (nivel mínimo 21)");
        nuevaSubli("Retour PA 4", "brv", "Brèches", "+2 PA al matar un enemigo (máx 2 por turno)", "Stèle Crête Givrée (Mazmorra nivel 200)");
        nuevaSubli("Retour enflammé 2", "rrv", "Brèches", "100 % del nivel en enflammé al matar un enemigo (1 vez por turno)", "Brèche de Bonta (nivel mínimo 141)");
        nuevaSubli("Retour d’armure 4", "brr", "Brèches", "+10 % de los PV máx como armadura al matar un enemigo (máx 2 veces por turno)", "Stèle Srambad (Mazmorra nivel 155)");
        nuevaSubli("Influence lente 4", "rvv", "Brèches", "+4 % CC por turno (máx 30)", "Stèle E-Bou (Mazmorra nivel 170)");
        nuevaSubli("Dérobade lente 4", "rrv", "Brèches", "+6 % de parada por turno (máx 40)", "Stèle Cité interdite (Mazmorra 3 jugadores nivel 185)");
        nuevaSubli("Loup solitaire 4", "rbv", "Brèches", "+8 % de daños si no hay aliados entre 1 y 4 casillas", "Stèle d'intervention Aguabrial (2) (Mazmorra Volcán Or'Hodruin nivel 200)");
        nuevaSubli("Expert des coups critiques 4", "bbv", "Brèches", "Si haces un CC al final del turno: +8 % de PV faltantes en curación", "Stèle Crête Givrée (Mazmorra nivel 200)");
        nuevaSubli("Wakfu Berzerk 4", "bbr", "Brèches", "PW ≤ 50 % al inicio del turno: +12 % daños críticos, +400 % del nivel en armadura", "Brèche Ultime Frigost (nivel mínimo 111)");
        // Sin dominio secundario
        nuevaSubli("Ambition 6", "vbr", "Sin secundaria", "Inicio del turno 1, si maestrías secundarias ≤ 0: +30 % CC", "Brèche de la Shukrute (nivel 216 mínimo)");
        nuevaSubli("Abandon 6", "vrb", "Sin secundaria", "+3 PW, +3 PO, -30 % armadura dada y recibida (si secundaria = 0)", "Brèche d'Amakna (nivel 111 mínimo)");
        nuevaSubli("Neutralité 4", "bvr", "Sin secundaria", "Inicio del turno 1, si maestrías secundarias ≤ 0: +32 % daños infligidos", "Brèche d'Osamosa (nivel 201 mínimo)");
        nuevaSubli("Prétention 6", "vbv", "Sin secundaria", "Inicio del turno 1, si maestría secundaria ≤ 0: +30 % parada", "Brèche ???");
        // Anti armor
        nuevaSubli("Manie 4", "brv", "Anti-armadura", "Daño cuerpo a cuerpo quita 200 % del nivel en armadura, -12 % armadura recibida", "Brèche Moon (nivel mínimo 171)");
        nuevaSubli("Témérité 4", "bbv", "Anti-armadura", "Si retiras toda la armadura de un objetivo: +12 % daños (máx 30 % durante el turno)", "Stèle Abraknyde (Mazmorra nivel 140)");
        nuevaSubli("Tabass’Carapace 4", "rvb", "Anti-armadura", "+24 % de daños a objetivos con armadura", "Stèle Cagnardeurs (Mazmorra nivel 215)");
        nuevaSubli("Rupture violente 4", "vvr", "Anti-armadura", "Si retiras toda la armadura: infliges 40 % del nivel como daño de luz", "Stèle Srambad (Mazmorra nivel 155)");
        nuevaSubli("Rupture PA 4", "bbb", "Anti-armadura", "Si retiras toda la armadura: +2 PA (máx 2 veces por turno)", "Stèle Abraknyde (Mazmorra nivel 140)");

        // VOL DE VIE
        nuevaSubli("Puits de vitalité 6", "vrv", "Vol de vie", "augmente de 30 % les vols de vie réalisés", "Stèle Sabléoptères (Donjon lvl 155)");
        nuevaSubli("Folie Vampirique 4", "rvr", "Vol de vie", "-20% soins reçus mais vole 16% des dégâts infligés sur les dégâts infligés en diagonale", "Stèle Trouffe Salée (Donjon lvl 140)");

// SOINS
        nuevaSubli("Altruisme 6", "bvr", "Soins", "12 % soins réalisés sur un allié en ligne et à distance", "Brèche Moon (lvl 171 minimum)");
        nuevaSubli("Expert des coups critiques 4", "bvv", "Soins", "En fin de tour, si un coup critique a été effectué, +8 % des pv manquants du lanceur", "Stèle Crête Givrée (Donjon lvl 200)");
        nuevaSubli("Intégrité 2", "bbr", "Soins", "En soignant un allié, si cet allié à moins de 15 % de pv : +14 % des pv max de la cible sont soignés (supplémentaire)", "Stèle d'intervention Aguabrial (2) (Donjon Blérox lvl 200)");
        nuevaSubli("Nature 6", "vrb", "Soins", "12 % soins réalisés sur un allié au contact d’un autre allié", "Brèche de Sufokia (lvl 66 minimum)");
        nuevaSubli("Temporisation 4", "vrb", "Soins", "En début de tour, si aucun PW n'a été utilisé au tour précédent : +16% de dommage infligé et +16% de soins réalisés", "Brèche Ultime Shukrute (lvl 216 minimum)");
        nuevaSubli("Secret de la vie 2", "vbb", "Soins", "Au début du combat : +10 % soins réalisés, réduit la maîtrise soin à 0", "Stèle d'intervention Aguabrial (2) (Donjon Dragoeufs lvl 200)");
        nuevaSubli("Courage 6", "brb", "Soins", "+12 % dommages et soins non critiques infligés -12 % dommages et soins critiques infligés", "Brèche Ultime Frigost (lvl 111 minimum)");
        nuevaSubli("Revigoration 4", "vbr", "Soins", "-10 % soins réalisés, le porteur de l’état est soigné de 16 % des soins réalisés sur ses alliés", "Brèche d'Amakna (lvl 111 minimum)");
        nuevaSubli("Précaution 4", "rvr", "Soins", "En terminant son tour avec moins de 50 % PV : soins de 20 % des pv manquants", "Brèche d'Amakna (lvl 111 minimum)");
        nuevaSubli("Accumulation 4", "vvb", "Soins", "-20% soins réalisés mais chaque tour passé sans soigner : +20% soins réalisés (max 40%)", "Stèle Compost du grand Potofeu (Donjon lvl 140)");
        nuevaSubli("Dernier soin 6", "vrv", "Soins", "En tombant sous 20% PV (1 fois par combat) : +30% PV max", "Stèle Noirespore (Donjon lvl ?)");
        nuevaSubli("Arcanes 6", "brb", "Soins", "Si le porteur de l’état ne possède pas d’armure en fin de tour : +300 % du niveau en armure", "Brèche de Tainéla (lvl 21 minimum)");
        nuevaSubli("Dernier souffle 6", "vbr", "Soins", "Lorsque le porteur commence son tour en dessous de 20 % de PV : +18 % de dégâts infligés +300 % du niveau en armure", "Brèche Ultime Zinit (lvl 201 minimum)");
        nuevaSubli("longueur d’armure 6", "rbv", "Soins", "+24 % armure donnée sur un allié en ligne et à distance", "Brèche de Bonta (lvl 141 minimum)");
        nuevaSubli("Prospérité 4", "vrb", "Soins", "+12 % aux bonus de caractéristiques reçues (maîtrises, résistances, armure) lancés par un allié", "Stèle Source du mal (Donjon lvl 155)");
        nuevaSubli("Wakfu Berzerk 4", "bbr", "Soins", "Si le porteur de l’état commence son tour avec 50 % ou moins de ses PW : +12 % dégâts crit, +400 % du niveau en armure", "Brèche Ultime Frigost (lvl 111 minimum)");
        nuevaSubli("Ecailles de lune 6", "vbr", "Soins", "+18 % armure reçue", "Stèle Sanctuaire des Dragoeufs (Donjon lvl 200)");
        nuevaSubli("Enveloppe rocheuse 6", "rbb", "Soins", "+18 % armure donnée", "Stèle Abraknyde (Donjon lvl 140)");
        nuevaSubli("Muraille 4", "rbv", "Soins", "En début de combat, 600 % du niveau en armure", "Stèle Tropikes (Donjon lvl 185)");
        nuevaSubli("Topologie 3", "bvb", "Soins", "Au début du combat, toute l’esquive du porteur est convertie en armure avec un ratio de 1 pour 3 (esquive perdue)", "Stèle Cité interdite (Donjon 3 joueurs lvl 185)");
        nuevaSubli("Carapace sanguine 6", "brr", "Soins", "En début de tour, convertit 60 % des PV courants en Armure", "Stèle Trouffe Salée (Donjon lvl 140)");
        nuevaSubli("Retour d’armure 4", "brr", "Soins", "En tuant un ennemi : 10 % des PV max en Armure (2 activations par tour)", "Stèle Srambad (Donjon lvl 155)");
        nuevaSubli("Interposition 6", "bvv", "Soins", "En taclant un ennemi : +300% du niveau en armure", "Stèle Plantigardes (Donjon lvl 215)");
        nuevaSubli("Allocentrisme 4", "vvv", "Soins", "+20% d’armure donnée si le porteur ne possède pas d’armure", "Stèle Toundrasoirs (Donjon lvl 215)");
        nuevaSubli("Dernière Armure 6", "rbr", "Soins", "En tombant sous 20% PV (1 fois par combat) : +30% de PV max en armure", "Stèle Srambad (Donjon lvl 155)");

// RÉDUCTION DE DÉGÂTS SUBIS
        nuevaSubli("Barrière mêlée 4", "vvb", "Réduction de dégâts subis", "Réduit les dommages mêlée subis de 50 % du niveau, 8 fois par tour", "Stèle Tropikes (Donjon lvl 185)");
        nuevaSubli("Barrière distance 4", "vvr", "Réduction de dégâts subis", "Réduit les dommages distance subis de 50 % du niveau, 8 fois par tour", "Stèle Kannibouls (Donjon lvl 185)");
        nuevaSubli("Arme solide 2", "bbb", "Réduction de dégâts subis", "En infligeant des dégâts avec une arme, l’ennemi touché diminue ses dégâts de 10 % sur la cible ayant l’effet (le porteur de l’état doit posséder un bouclier)", "Brèche de Sufokia (lvl 66 minimum)");
        nuevaSubli("Art du cachement 4", "bbb", "Réduction de dégâts subis", "-24% dommages reçus hors ligne de vue, +12% dommages reçus lorsque le porteur est en ligne de vue", "Stèle Crustargneux (Donjon lvl 215)");
        nuevaSubli("Volte face 2", "bbv", "Réduction de dégâts subis", "Lorsque le porteur de l’état subit des dommages au contact : se retourne vers l’attaquant (une fois par tour)", "Brèche Ultime Frigost (lvl 111 minimum)");
        nuevaSubli("Détermination 4", "vvr", "Réduction de dégâts subis", "-30 % dommages indirects reçus", "Stèle E-Bou (Donjon lvl 170)");
        nuevaSubli("Solidité 2", "rvr", "Réduction de dégâts subis", "Réduit les dommages directs reçus supérieurs à 20 % des PV max de 400 % du niveau (une fois par tour de table)", "Stèle Palais Lenald (Donjon lvl 140)");


    }

}