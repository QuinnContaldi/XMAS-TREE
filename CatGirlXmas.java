public class CatGirlXmas{
    public static void main (String args[])
    {
        System.out.println("Meowtastic welcome to the catgirl Christmas tree store!");
        System.err.println("Nyaaa my name is Nicole. How may I help you");
        Tree tree; 
        tree = new DouglasFir();
        tree = new Star(tree);
        tree = new Ribbons(tree);
        tree = new LEDs(tree);
        tree.cost();
        System.out.println(tree.getDescription() + "$" + tree.cost());


    }
}