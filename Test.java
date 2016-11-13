public class Test{
    public static void main(String[] args){
        Table table = Table.getInstance();
        table.player(1).setName("Bruno");
        table.player(2).setName("Andrius");
        
        System.out.println(table);

        table.player(1).hand().play(1);
        table.player(2).hand().play(2);
        
        System.out.println(table);

        table.player(1).hand().field().card(1).hit(table.player(2).hand().field().card(1));

        System.out.println(table);
    }
}