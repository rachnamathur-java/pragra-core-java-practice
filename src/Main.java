import java.util.Scanner;

public class Main {

    String str = "to the school";

    public String notString() {

        if (str.length() >= 7 && str.substring(0, 7).equals("welcome")) {
            return str;
        }

        return "welcome " + str;
    }

    public String replaceChar() {
        String str1 = "rachsna mathur";
        String str2 = str1.replace("s", "");
        //String s1 = System.out.println(str2);
        return str2;
    }

    public String missingChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();

        System.out.println("Enter character index number which you want to remove");
        String str1 = scanner.nextLine();
        int n = Integer.parseInt(str1);


        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        //System.out.println(front);
        //System.out.println(back);
        //System.out.println(str.length());


        return front + back;

    }

    public void method() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num");
        int i = scan.nextInt();
        System.out.println("enter double");
        double d = scan.nextDouble();
        System.out.println("enter string");
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public void add(int x){
        x = x+1;
        System.out.println(x);

    }

    public void addXX(home h){
         h.setXx(h.getXx()+1);
        System.out.println("xx   "+h.getXx());

    }


    public static void main(String[] args) {

        Main main = new Main();

        /*System.out.println(main.notString());
        System.out.println(main.replaceChar());
        System.out.println(main.missingChar());
        //System.out.println(main.method());*/

        int x =0;

        main.add(x);
        System.out.println("new value of x   "+ x);

        home h = new home();
        main.addXX(h);
        System.out.println("new value of xx   "+ h.getXx());

    }
}

class home{
    int xx = 0;

    public int getXx() {
        return xx;
    }

    public void setXx(int newval){
        this.xx = newval;
    }
}

