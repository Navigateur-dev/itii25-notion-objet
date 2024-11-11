package notion.base;

public class ConditionStructure {
    public static void main(String[] args   ){
    int test1 = 0;
    int test2 = 2;
    int test4 = 2;

    // condition if
    if(test1 == test4){
        System.out.println("Ce test est vrai");
    }
    else{
        System.out.println("Ce test est faux");
    }

    if(test2 == test4){
        System.out.println("Ce test est vrai");
    }
    else{
        System.out.println("Ce test est faux");
    }

    // condition while
    while(test1 != 5){
        test1++;
        System.out.println("valeur de test1 "+test1);
    }
    System.out.println("test1 valide la condition du while");

    // condition switch, le "break" sert à mettre fin brutalement à la condition switch , globalement a le même apport que if 
    switch(test1){
        case 5:
            System.out.println("test1 est égale à 5");
            break;
        case 3:
            System.out.println("test1 est égale à 5");
            break;
        default:
            System.out.println("Valeur par défaut");
    }

    // boucle for, utilisation classique, ici de 0 à 9; pour comprendre la 10eme itération, utiliser l'opérateur <=
    for(int i = 0;i<10;i++){
        System.out.println("valeur de i "+i);
    }

    // boucle for utilisation décroissante
    for(int j = 10;j>0;j--){
        System.out.println("valeur de j "+j);
    }
}

}
