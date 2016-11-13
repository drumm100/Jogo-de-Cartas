public class Test{
    public static void main(String[] args){
        Table table = Table.getInstance();
        table.player(1).setName("Bruno");
        table.player(2).setName("Andrius");
        
        new Game().play();
    }
}