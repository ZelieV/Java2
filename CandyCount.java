class CandyCount {

    public static void main(String[] args) {

        double money = 12.4;
        double price = 1.2;
        int candies = 0; 

        // Vérification des conditions initiales
        if (money > 0 && price > 0) {
            // Boucle tant que (money - price) >= 0
            while ((money - price) >= 0) {
                candies += 1;
                money -= price;
            }
        }
        
        // Affichage du nombre de bonbons
        System.out.println(candies);
    }
}
