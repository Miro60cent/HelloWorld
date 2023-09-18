public class Main {

    public static void main(String[] args) {
        try {
            SumSum sumSum = new SumSum();
            System.out.println(sumSum.calculateSum(6, 5, 4, 1 ,6));
        } catch (IllegalArgumentException e){
            System.err.println("ділення на 0: " + e.getMessage());
        }
        }
        }



