package notion.base;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // déclaration d'un tableau
        int[]Tab;
        // définition de la taille du tableau
        Tab = new int[3];

        // initialisation
        Tab[0] = 8;
        Tab[1] = 5;
        Tab[2] = 6;

        Arrays.sort(Tab);

        System.out.println("Affichage du tableau après tri :");
        // on remarque que cela n'affiche pas le tableau trié mais des éléments spéciaux, en effet puisqu'on affiche la référence mémoire du tableau
        System.out.println(Tab);
        // pour afficher le tableau il faut donc convertir en string
        System.out.println(Arrays.toString(Tab));
        // permet de vérifier si un élément existe et de retourner l'index dans lequel il se trouve dans le tableau
        System.out.println(Arrays.binarySearch(Tab, 8));

        // Copie le tableau dans un autre tableau (le deuxieme paramètre permet de mettre une taille maximale)
        int[]CopyTab = Arrays.copyOf(Tab,2);
        System.out.println(Arrays.toString(CopyTab));

        // Copie du tableau d'un indice à un autre
        int[]CopyTab2 = Arrays.copyOfRange(Tab,1,2);
        System.out.println(Arrays.toString(CopyTab2));
    }
}
