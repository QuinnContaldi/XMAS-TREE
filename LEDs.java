public class LEDs extends TreeDecorator {
    Tree tree;
    public LEDs(Tree tree){
        this.tree = tree;
    }

    public String getDescription(){
        return tree.getDescription() +"LEDs ";
    }

    public Double cost(){
        return tree.cost()+ 10.00;
    }
}
