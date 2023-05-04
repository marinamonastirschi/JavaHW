package class16;

public class Task2 {
        static String mixString(String s1,String s2){
            for(int i=0;i<s1.length();i++){
                for(int j=0;j<s2.length();j++){
                    String mixString= String.valueOf(s1.charAt(i)+s2.charAt(j));
                }
            }
            return s1;
        }


        //test case below (dont change):
        public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);

        }


    }