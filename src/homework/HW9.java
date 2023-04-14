package homework;

public class HW9 {
    public static void main(String[] args) {
        String[][] students={
                {"Veronica","Sarah","Alina","Vlad"},
                {"A","B","C","D"}
        };
        for (int i = 0; i < students.length; i++) {
            if (students[1][i].equals("A")||students[1][i].equals("B")){
                System.out.println(students[0][i]+" "+students[1][i]);
            }

        }

        //System.out.println(students[0][0]);
        //System.out.println(students[0][1]);

    }
}
