import java.util.*;

public class Main {
    public static void main(String[] args) {
        String combinacionUsuario;
        Archivo archivo1 = new Archivo();
        Archivo.cargarSublis();

        do {
            combinacionUsuario = preguntarSubli();
        }while (combinacionUsuario != null);



    }
    static String preguntarSubli(){
        String combinacionUsuario;
        Scanner lector = new Scanner(System.in);
        try {
            combinacionUsuario = lector.nextLine().toLowerCase();
            if (combinacionUsuario.length()<3){
                System.out.println("La subli tiene que tener como minimo 3 colores");
                throw new RuntimeException();
            }
            if (combinacionUsuario.length()>4){
                System.out.println("La subli no puede tener mas de 4 colores");
            }
            for (int i = 0; i < combinacionUsuario.length(); i++) {
                if (combinacionUsuario.charAt(i) != 'r' && combinacionUsuario.charAt(i) != 'g' && combinacionUsuario.charAt(i) != 'b' && combinacionUsuario.charAt(i) != 'w'){
                    System.out.println("Uno de los caracteres es incorrecto, solo puedes usar r,g,b,w");
                    throw new RuntimeException();
                }
            }
            return preguntarSubli();
        }
        catch (RuntimeException e){

        }
        return null;
    }
}
