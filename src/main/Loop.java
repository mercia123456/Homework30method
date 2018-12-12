package main;

public class Loop {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int x : numbers){
          System.out.print(x);
          System.out.print(",");

        }
        System.out.print("\n");
        String []names ={"Sam","Victor","Tom","James"};


        for (String name : names){
            System.out.print(name);
            System.out.print(",");
    }
}
}
