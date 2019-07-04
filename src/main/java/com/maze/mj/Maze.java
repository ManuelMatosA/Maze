//Namespace
package com.maze.mj;

//Imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

/*
Maze Class
 */
public class Maze {
    public static void main(String[] args) throws IOException {
        //Greeting and instructions
        System.out.println( "Welcome to this maze game!\n" +
                "Use keys W for up.\n" +
                "S for down.\n" +
                "Q for left.\n" +
                "And E for right.\n" +
                "Your character is represented by a circle \"0\"." );

        //Fields
        Scanner in = new Scanner( System.in, Charset.defaultCharset() );

        //Variables
        String input;
        int row = 0;
        int col = 0;
        int startingRow = 10;
        int startingCol = 10;
        int endingRow = 10;
        int endingCol = 10;
        String reference;
        String line;
        int countRow = 0;

        //Arrays
        char[] count = new char[10];
        char[][] maze = new char[15][15];
        char[][] draw = new char[15][15];

        // Constants for directions
        final String TURN_RIGHT = "E";
        final String TURN_LEFT = "Q";
        final String MOVE_UP = "W";
        final String MOVE_DOWN = "S";

        //First Buffered reader class
        /*String fileName;
        System.out.println("----------------------------------------------------------------");
            System.out.println( "Enter the file name or directory." );
            System.out.println("----------------------------------------------------------------");
            System.out.print("#");
            fileName = in.nextLine();                                             fileName
         */
        BufferedReader buffer = new BufferedReader( new FileReader( "C:\\Users\\Manuel\\IdeaProjects\\Maze\\src\\main\\resources\\maze.txt" ) );
        while ((line = buffer.readLine()) != null) {
            //Count will store all the chars of that line into an array
            count = line.toCharArray();

            //Storing the length of the line in a variable so we can use it to initialize an array
            col = count.length;

            //Counts the number of lines so we can use it to initialize an array
            row++;
        }

        //Initialize the array with said variables
        maze = new char[row][col];
        draw = new char[row][col];

        //Second Buffered reader class
        BufferedReader br = new BufferedReader( new FileReader( "C:\\Users\\Manuel\\IdeaProjects\\Maze\\src\\main\\resources\\maze.txt" ) );
        while ((reference = br.readLine()) != null) {

            //Count will store all the chars of every line into an array
            count = reference.toCharArray();

            //For loop that creates and initializes a variable that will be used to iterate through the columns of the array and the index of
            //a that lines char array
            for (int newColumn = 0; newColumn < col; newColumn++) {
                maze[countRow][newColumn] = count[newColumn];
            }

            //Filling the array to draw the trace
            for (int newColumn = 0; newColumn < col; newColumn++) {
                draw[countRow][newColumn] = count[newColumn];
            }

            //Control the row of the maze array to only increment if buffered reader reads a new line
            countRow++;
        }

        //This for loops looks for the character S in every row and every column of the Maze array and assigns the row and column were S is located
        //Fun fact: If there were to be multiple S chars we would need a break; to only use the first character
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    startingRow = i;
                    startingCol = j;
                    /*
                    This was my answer to the problem that I had but i just needed to increment to fix it
                    if (maze[startingRow][startingCol+1] == ' ' && startingRow != row || startingCol != col) {
                        startingCol+=1;
                    } else if (maze[startingRow+1][startingCol] == ' ') {
                        startingRow+=1;
                    } else if (maze[startingRow-1][startingCol] == ' ' && startingRow != 0 || startingCol != 0) {
                        startingRow-=1;
                    } else {
                        startingCol-=1;
                    }
                     */
                }
            }
        }

        //This for loops looks for the character F in every row and every column of the Maze array and assigns the row and column were F is located
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'F') {
                    endingRow = i;
                    endingCol = j;
                }
            }
        }

        //Prints the array
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print( maze[i][j] );
            }
            System.out.println();
        }

        //Keeps asking for where to go only if the user has not reached the F char
        while (maze[startingRow][startingCol] != maze[endingRow][endingCol]) {
            System.out.println("----------------------------------------------------------------");
            System.out.println( "Enter move. W for Up, S for Down, Q for left and E for right." );
            System.out.println("----------------------------------------------------------------");
            System.out.print("#");
            input = in.nextLine();
            //If that validates user input and only lets you input the correct values
            if(input.equalsIgnoreCase(TURN_LEFT) || input.equalsIgnoreCase(TURN_RIGHT) || input.equalsIgnoreCase(MOVE_DOWN) || input.equalsIgnoreCase(MOVE_UP)) {

            //If user inputs "E" it will increment the column (in this case) so that it is ready to move to the right
            if (input.equalsIgnoreCase( TURN_RIGHT )) {
                startingCol++;
                //Only decrements and "doesn't move" if a wall is encountered
                if (maze[startingRow][startingCol] == 'X') {
                    System.out.println("*****************************************");
                    System.out.println( "You've hit a wall" );
                    System.out.println("*****************************************");
                    startingCol--;
                    //If a wall is not encountered, it sets the row a column of the two arrays to have the value of a String "0"
                } else {
                    maze[startingRow][startingCol] = '0';
                    draw[startingRow][startingCol] = '0';
                    //Deletes previous character in the maze array but not in the draw
                    if (maze[startingRow][startingCol - 1] != 'X' && maze[startingRow][startingCol - 1] != 'S' && maze[startingRow][startingCol - 1] != 'F') {
                        maze[startingRow][startingCol - 1] = ' ';
                    }

                    //Prints the array
                    for (int row1 = 0; row1 < maze.length; row1++) {
                        for (int col1 = 0; col1 < maze[row1].length; col1++) {
                            System.out.print( maze[row1][col1] );
                        }
                        System.out.println();
                    }
                }
            }

            //Turn Left
            if (input.equalsIgnoreCase( TURN_LEFT )) {
                startingCol--;
                if (maze[startingRow][startingCol] == 'X') {
                    System.out.println("*****************************************");
                    System.out.println( "You've hit a wall" );
                    System.out.println("*****************************************");
                    startingCol++;
                } else {
                    maze[startingRow][startingCol] = '0';
                    draw[startingRow][startingCol] = '0';
                    if (maze[startingRow][startingCol + 1] != 'X' && maze[startingRow + 1][startingCol] != 'S' && maze[startingRow + 1][startingCol] != 'F') {
                        maze[startingRow][startingCol + 1] = ' ';
                    }

                    //Prints the array
                    for (int row1 = 0; row1 < maze.length; row1++) {
                        for (int col1 = 0; col1 < maze[row1].length; col1++) {
                            System.out.print( maze[row1][col1] );
                        }
                        System.out.println();
                    }
                }
            }

            //Move Up
            if (input.equalsIgnoreCase( MOVE_UP )) {
                startingRow--;
                if (maze[startingRow][startingCol] == 'X') {
                    System.out.println("*****************************************");
                    System.out.println( "You've hit a wall" );
                    System.out.println("*****************************************");
                    startingRow++;
                } else {
                    maze[startingRow][startingCol] = '0';
                    draw[startingRow][startingCol] = '0';
                    if (maze[startingRow + 1][startingCol] != 'X' && maze[startingRow + 1][startingCol] != 'S' && maze[startingRow + 1][startingCol] != 'F') {
                        maze[startingRow + 1][startingCol] = ' ';
                    }
                    //Prints the array
                    for (int row1 = 0; row1 < maze.length; row1++) {
                        for (int col1 = 0; col1 < maze[row1].length; col1++) {
                            System.out.print( maze[row1][col1] );
                        }
                        System.out.println();
                    }
                }
            }

            //Move Down
            if (input.equalsIgnoreCase( MOVE_DOWN )) {
                startingRow++;
                if (maze[startingRow][startingCol] == 'X') {
                    System.out.println("*****************************************");
                    System.out.println( "You've hit a wall" );
                    System.out.println("*****************************************");
                    startingRow--;
                } else {
                    maze[startingRow][startingCol] = '0';
                    draw[startingRow][startingCol] = '0';
                    if (maze[startingRow - 1][startingCol] != 'X' && maze[startingRow - 1][startingCol] != 'S' && maze[startingRow - 1][startingCol] != 'F') {
                        maze[startingRow - 1][startingCol] = ' ';
                    }
                    //Print the array
                    for (int row1 = 0; row1 < maze.length; row1++) {
                        for (int col1 = 0; col1 < maze[row1].length; col1++) {
                            System.out.print( maze[row1][col1] );
                        }
                        System.out.println();
                    }
                }
            }

            //Invalid input message
            } else {
                System.out.println( "*****************************************" );
                System.out.println( "Invalid input, please try again." );
                System.out.println( "*****************************************" );
            }
        }
        //Congrats
        System.out.println("--------------------------");
        System.out.println("You've won the game!!!");
        System.out.println("--------------------------");

        //Prints array draw used to draw the trace of the explorer
        for (int row1 = 0; row1 < draw.length; row1++) {
            for (int col1 = 0; col1 < draw[row1].length; col1++) {
                System.out.print( draw[row1][col1] );
            }
            System.out.println();
        }
    }
}
