import java.util.Scanner;
public class MenuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while(true){
           int choice = input.nextInt();
            switch (choice){
                case 1:
                    int num = 6;
                    for(int i = 0; i < num; i++){
                        for (int j = 0; j < num - i; j++){
                            System.out.print("*");
                        }
                        System.out.print("\r\n");
                    }
                    break;
                case 2:
                    for(int a = 0; a < 4; a++){
                        for (int b  = 0; b < 7; b++){
                            System.out.print("*");
                        }
                        System.out.print("\r\n");
                    }
                    break;
                case 0:
                    System.out.println("exit!");
                    System.exit(0);
                    default:
                        break;
            }
        }

    }

}
