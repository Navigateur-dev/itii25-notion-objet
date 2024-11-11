package notion.base;

public class Main {
    public static void main(String[] args) {

        // les variables de base

        // nombre entier sur 8 bits soit -127 à 128
        byte bt = 14;
        // nombre entier sur 16 bits -32000 à 32000
        short sh = 123;
        // sur 32 bits -2millions à 2millions
        int in = 100;
        // 64 bits
        long lg = 1237644521;

        // bien utiliser le . et le f à la fin (32 bits soit 7 chiffres)
        float fl = 2.5f;
        // par défaut les nombres à virgule sont des doubles (64 bits)
        double db = 2.5;

        // constante
        final int constante = 1;

        // déclaration d'un tableau
        int[]Tab;
        // définition de la taille du tableau
        Tab = new int[3];

        // initialisation
        Tab[0] = 1;
        Tab[1] = 2;
        Tab[2] = 3;
        Tab[3] = 4;

        // tableau à plusieurs dimensions, ici 2 dimensions de taille 2x2
        int[][] matrice;
        matrice = new int[2][2];

        // affichage premier élément
        System.out.println("Ici la valeur de l'index 1 : "+Tab[0]);
        // affichage élément en dehors de la taille définie
        //System.out.println("Ici la valeur en dehors de la taille du tableau (erreur) : "+Tab[3]);



        System.out.println("Ici la valeur de byte : "+bt);
        System.out.println("Ici la valeur de int : "+in);
        System.out.println("Ici la valeur de sh : "+sh);
        System.out.println("Ici la valeur de long : "+lg);

        System.out.println("Ici la valeur de long : "+fl);
        System.out.println("Ici la valeur de long : "+db);

        // convertir un nombre numérique , example :
        int conversion = (int)in;
        System.out.println("Ici la valeur de la conversion : "+conversion);

        // déclaration d'une énumération 
        enum Mois{
            JANVIER,
            FEVRIER,
            MARS,
        }

        // Affichage d'une valeur d'énumération
        Mois premierMois = Mois.JANVIER;
        System.out.println("Ici la valeur du premier mois : "+premierMois);
    }
}