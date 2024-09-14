public class Main {
    /*
    Écrivez une méthode nommée getEvenDigitSum avec un paramètre de type int appelé number.

La méthode doit retourner la somme des chiffres pairs du nombre.

Si le nombre est négatif, la méthode doit retourner -1 pour indiquer une valeur invalide.

EXEMPLES D’ENTRÉES/SORTIES :

	•	getEvenDigitSum(123456789); → devrait retourner 20 puisque 2 + 4 + 6 + 8 = 20.
	•	getEvenDigitSum(252); → devrait retourner 4 puisque 2 + 2 = 4.
	•	getEvenDigitSum(-22); → devrait retourner -1 car le nombre est négatif.

REMARQUE : La méthode getEvenDigitSum doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.

REMARQUE : N’ajoutez pas de méthode main dans le code de la solution.
     */
    public static int getEvenDigitSum(int nombre){
        if(nombre < 0){
            return -1;
        }
        int sommePairs = 0;
        while (nombre > 0){
            int dernierChiffre = nombre % 10;
            sommePairs += dernierChiffre %2==0 ? dernierChiffre : 0;
            nombre /= 10;
        }
        return sommePairs;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
