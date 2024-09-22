public class Star extends TreeDecorator {
    Tree tree;
    public Star(Tree tree){
        if(tree.statusStar() == false){
            this.tree = tree;
            setStar(true);
        }
    }

    public void setStar(boolean hasStar){
        tree.setStar(hasStar);
    }
    
    public boolean statusStar(){
        return tree.hasStar;
    }
    public String getDescription()
    {
        return tree.getDescription() + "Star ";
    }
    
    public Double cost() {
        return tree.cost() + 4.00;
    }
}
