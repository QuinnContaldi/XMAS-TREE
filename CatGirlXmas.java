import java.util.Scanner;

public class CatGirlXmas{
    public static void main (String args[])
    {
        Scanner menuScanner = new Scanner(System.in);
        int menuVar = 1;
        int decorationSubMenu = 1;
        int treeSubMenu = 1;
        Tree tree = new DouglasFir();
        System.out.println("Meowtastic welcome to the catgirl Christmas tree store!");
        System.err.println("Nyaaa my name is Nicole. How may I help you");
        System.out.println("*The catgirl infront of you smiles as she fixes her name tag*");
        System.out.println("*Behind her many trees and boxes of decoration lay behind her*");
        System.out.println("*Her tail eagerly flicks about excited to make the wonderful sale*");
        System.out.println("*She then turns around and proudly displays her trees* our prices are purrrfect");

        while(menuVar != 0)
        {
            System.out.println(" ");
            System.out.println("Please pay careful attention to the following menu choices");
            System.out.println("0: end the CatgirlXmas software");
            System.out.println("1: Trees for sale");
            System.out.println("2: Decorations for sale");
            System.out.println("3: print current receipt");
            System.out.println("Please Choose and option: ");
            System.out.println(" ");
            menuVar = menuScanner.nextInt();
                switch(menuVar)
                {
                    case 0:
                            menuVar = 0;
                    break;
                    case 1:
                            //shows the run time polymorphisim of my tree varible to show all of the prices
                            //this allows us to reassign the tree object getting rid of all previous decoration
                            //if the client wants to buy a new tree 
                            System.out.println(" ");
                            System.out.println("************TREE*********** ");
                            tree = new DouglasFir();
                            System.out.println("1: " + tree.getDescription() + "$" + tree.cost());
                            tree = new BalsamFir();
                            System.out.println("2: " + tree.getDescription() + "$" + tree.cost());
                            tree = new FaserFir();
                            System.out.println("3: " + tree.getDescription() + "$" + tree.cost());
                            tree = new ColoradoBlueSpruce();
                            System.out.println("4: " + tree.getDescription() + "$" + tree.cost());
                            treeSubMenu = menuScanner.nextInt();
                                switch(treeSubMenu)
                                {
                                //allows the user to change the tree during run time
                                case 1:
                                    tree = new DouglasFir();
                                    System.out.println("Meow buying a: " + tree.getDescription() + "good choice");
                                break;
                                case 2:
                                    tree = new BalsamFir();
                                    System.out.println("Ohhhh buying a: " + tree.getDescription() + "good choice");
                                break;
                                case 3:
                                    tree = new FaserFir();
                                    System.out.println("Ohhhh buying a: " + tree.getDescription() + "good choice");
                                break;
                                case 4:
                                    tree = new ColoradoBlueSpruce();
                                    System.out.println("Ohhhh buying a: " + tree.getDescription() + "good choice");
                                }
                    break;
                    case 2:
                            System.out.println(" ");
                            System.out.println("************Decorations*********** ");
                            System.out.println("1: " + "Balls Blue " + "$" + 1.00);
                            System.out.println("2: " + "Balls Red " + "$" + 2.00);
                            System.out.println("3: " + "Balls Silver " + "$" + 3.00);
                            System.out.println("4: " + "Ruffles " + "$" + 1.00);
                            System.out.println("5: " + "Ribbons " + "$" + 2.00);
                            System.out.println("6: " + "Lights " + "$" + 5.00);
                            System.out.println("7: " + "LEDs " + "$" + 10.00);
                            System.out.println("8: " + "Star " + "$" + 4.00);
                            decorationSubMenu = menuScanner.nextInt();
                                switch(decorationSubMenu)
                                {
                                case 1:
                                    tree = new BallsBlue(tree);
                                break;
                                case 2:
                                    tree = new BallsRed(tree);
                                break; 
                                case 3:
                                    tree = new BallsSilver(tree);
                                break;
                                case 4:
                                    tree = new Ruffles(tree);
                                break;
                                case 5:
                                    tree = new Ribbons(tree);
                                break;
                                case 6:
                                    tree = new Lights(tree);
                                break;
                                case 7:
                                    tree = new LEDs(tree);
                                break;
                                case 8:
                                    if(tree.statusStar() == false)
                                    {
                                        tree = new Star(tree);
                                    }
                                    else
                                    {
                                        System.out.println("Error tree already has a star");
                                    }
                                break;
                                }
                    break;
                    case 3:
                            System.out.println(" ");
                            System.out.println("***********RECEIPT************* ");
                            System.out.println(tree.getDescription() + " " + tree.cost());
                    break;
                }
        }
    }
}