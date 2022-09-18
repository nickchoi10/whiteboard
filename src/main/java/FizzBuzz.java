
public class FizzBuzz {

    /* input number, output void
   print fiz buzz.
   multiple of 3 output fizz
   multiple of 5 output buzz
   if both fizzbuzz
    */
//1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz
    public static void main(String[] args) {
        FizzBuzz.fizzbuzz(14,5,3);

    }

    public static void fizzbuzz (Integer number,Integer firstMultiple, Integer secondMultiple) {
        String output1 = "fizzbuzz";
        String output2 = "fizz";
        String output3= "buzz";

        for (int i = 1; i <= number; i++) {;
            if(i % firstMultiple == 0 && i % secondMultiple == 0) {
                System.out.println(output1);
            }
            else if(i% firstMultiple == 0) {
                System.out.println(output2);
            }
            else if(i % secondMultiple == 0) {
                System.out.println(output3);
            }
            else{
                System.out.println(i);
            }
        }
    }




}
