package decisionMaking;

public class TableDoWhile {
    public static void main(String[] args) {
        int x =1 ;
        do{
            int y = x*5;
            System.out.println("5 * "+x+" "+" = "+ y);
            x++;
        }
        while(x<11);
    }
}
