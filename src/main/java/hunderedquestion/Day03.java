package hunderedquestion;

public class Day03 {

    public static int sumOfNubmer(int a) {

        int number = a % 10;
        if (a == 0) {
            return 0;
        } else {
            return number + sumOfNubmer(a = a / 10);
        }
    }
        public static void main (String[]args){
            int a = 1223;
            System.out.println( sumOfNubmer(a));
        }
    }
