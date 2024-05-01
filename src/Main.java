import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hola este es mi proyecto, Bienvenido a Screen-Match!");
        //System.out.println("Pelicula Matrix");

        int startDate = 1999;
        double evaluation = 4.5;
        boolean includedInBasicPlan = true;
        String name = "Matrix";
        String synopsis = """
                El programador informático Thomas Anderson, 
                más conocido en el mundo de los "hacker" como Neo, 
                está en el punto de mira del temible agente Smith. 
                Otros dos piratas informáticos, Trinity y Morfeo, 
                se ponen en contacto con Neo para ayudarlo a escapar. 
                Matrix te posee. Sigue al conejo blanco.
                """;
        double averageUserEvaluation = 0;


        System.out.println("Starter date: "+startDate);
        System.out.println("Score: "+evaluation);
        System.out.println("Included in a basic plan: "+includedInBasicPlan);
        System.out.println("Selected movie: "+name);
        System.out.println("Synopsis: "+synopsis);

        double averageEvaluation= (4.5 + 4.8 + 3) / 3;
        System.out.println("Matrix score average: "+averageEvaluation);

        if (startDate >= 2023){
            System.out.println("Popular movie of the moment");
        }else {
            System.out.println("Retro movie worth watching");
        }

        for (int i = 0; i < 3; i++) {
            Scanner keyboard =  new Scanner(System.in);
            System.out.println("Enter the rating you would give to Matrix: ");
            double matrixNote = keyboard.nextDouble();
            averageUserEvaluation =  averageUserEvaluation + matrixNote;
        }
        System.out.println("The average of the " +
                "movie Matrix by our users is: "+ averageUserEvaluation / 3);
    }
}