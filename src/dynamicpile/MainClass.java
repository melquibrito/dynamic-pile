package dynamicpile;

public class MainClass {

    public static void main(String[] args) {
        DynamicPile<String> pile = new DynamicPile();
        pile.add("p1");
        pile.add("p2");
        System.out.println(pile.size());
        pile.remove();
        System.out.println(pile.size());
        pile.remove();
        System.out.println(pile.size());
    }
    
}
