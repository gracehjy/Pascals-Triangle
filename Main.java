import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("How many rows would you like to view?");
    int N = in.nextInt();
    int[][] pascals = new int[N][N];

    //prints out the column number on top of the triangle
    System.out.println("\n\t\tcolumn");
    System.out.print("\t\t");
    for(int columnCount = 0; columnCount < N; columnCount++){
      System.out.print(columnCount+" ");
    }

    System.out.print("\nrow");

    //logic for each value in the triangle
    for(int r = 0; r < N; r++){
      for(int c = 0; c < N; c++){
        if (c == 0 || c == r){
          pascals[r][c] = 1;
        }
        else if(r < 0 || c < 0 || c > r){
          pascals[r][c] = 0;
        }
        else{
          pascals[r][c] = (pascals[r-1][c]) + (pascals[r-1][c-1]);
        }
      }
    }

    //prints out each nonzero value in each row of the triangle
    System.out.println();
    for(int r = 0; r < N; r++){
      System.out.print(r+"\t\t");
      for(int c = 0; c < N; c++){
        if(pascals[r][c] != 0)
          System.out.print(pascals[r][c]+" ");
      }
      System.out.println();
    }
  }
}