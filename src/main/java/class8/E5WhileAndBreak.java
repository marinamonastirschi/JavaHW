package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        boolean summer = true;
        int temp=85;
        while(summer){

            if(temp<100) {
                System.out.println("it's good I enjoy Summer");

            }else {
                System.out.println("it's very hot");
                break;
            }
            temp=temp+3;
        }

        }
    }

