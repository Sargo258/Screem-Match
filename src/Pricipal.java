import models.Movies;
import models.Serie;


import java.util.Scanner;

public class Pricipal {
    public void showMenu(){
        int option = 0;
        Scanner keyboard = new Scanner(System.in);
        while (option != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    1) Regitrar una nueva pelicula
                    2) Registrar una nueva serie
                    
                    9) salir
                    """;
            System.out.println(menu);
            option = keyboard.nextInt();
            keyboard.nextLine();
            switch (option){
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String name1 = keyboard.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la pelicula: ");
                    int startDate1 = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Ingrese la durecion en minutos de la pelicula: ");
                    int durationTimeperMinutes1 = keyboard.nextInt();
                    keyboard.nextLine();
                    Movies moveUser = new Movies();
                    moveUser.setName(name1);
                    moveUser.setStrartDate(startDate1);
                    moveUser.setDurationTimeperMinutes(durationTimeperMinutes1);
                    moveUser.sampleTechnicalSheet();
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la serie: ");
                    String name2 = keyboard.nextLine();
                    System.out.println("Ingrese el numero de temporadas: ");
                    int season = keyboard.nextInt();
                    keyboard.nextLine();
                    System.out.println("Ingrese el numero de episodios por temporada: ");
                    int episodeBySeason = keyboard.nextInt();
                    System.out.println("Ingrese la duracion en minutos por episodio: ");
                    int durationInMinutesPerEpisode = keyboard.nextInt();
                    keyboard.nextLine();
                    Serie serieUser = new Serie();
                    serieUser.setName(name2);
                    serieUser.setSeason(season);
                    serieUser.setEpisodesBySeason(episodeBySeason);
                    serieUser.setDurationInMinutesPerEpisode(durationInMinutesPerEpisode);
                    serieUser.sampleTechnicalSheet();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                    break;

            }
        }
    }
}
