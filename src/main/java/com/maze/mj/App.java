package com.maze.mj;


//import com.sun.java.util.jar.pack.Instruction;

import java.nio.charset.Charset;
import java.util.Scanner;
//import java.io.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //String maze = new Scanner( new File( "maze.txt" ) ).useDelimiter( "\\A" ).next();
        System.out.println( "Welcome to this maze program!\nUse keys W for up.\nS for down.\nQ for left.\nAnd E for right.\nYour character is represented by a circle.\n" +
                "Every step you take is marked by a *\nYou can't go back and if you get trapped you loose." );
        System.out.println();
        System.out.println( "XXXXXXXXXXXXXXX\n" +
                "X             X\n" +
                "X XXXXXXXXXXX X\n" +
                "X XS        X X\n" +
                "X XXXXXXXXX X X\n" +
                "X XXXXXXXXX X X\n" +
                "X XXXX      X X\n" +
                "X XXXX XXXX X X\n" +
                "X XXXX XXXX X X\n" +
                "X X    XXXXXX X\n" +
                "X X XXXXXXXXX X\n" +
                "X X XXXXXXXXX X\n" +
                "X X         X X\n" +
                "X XXXXXXXXX   X\n" +
                "XFXXXXXXXXXXXXX" );
        //Fields
        Scanner in = new Scanner(System.in, Charset.defaultCharset());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String input;
        do {
            System.out.print( "Enter first move: " );
            input = in.nextLine();
            if (!input.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS0       X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input.equals( "e" ));

        String input2;
        do {
            System.out.print( "Enter second move: " );
            input2 = in.nextLine();
            if (!input2.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS*0      X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input2.equals( "e" ));

        String input3;
        do {
            System.out.print( "Enter third move: " );
            input3 = in.nextLine();
            if (!input3.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS**0     X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input3.equals( "e" ));

        String input4;
        do {
            System.out.print( "Enter fourth move: " );
            input4 = in.nextLine();
            if (!input4.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS***0    X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input4.equals( "e" ));

        String input5;
        do {
            System.out.print( "Enter fifth move: " );
            input5 = in.nextLine();
            if (!input5.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS****0   X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input5.equals( "e" ));

        String input6;
        do {
            System.out.print( "Enter sixth move: " );
            input6 = in.nextLine();
            if (!input6.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS*****0  X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input6.equals( "e" ));

        String input7;
        do {
            System.out.print( "Enter seventh move: " );
            input7 = in.nextLine();
            if (!input7.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS******0 X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input7.equals( "e" ));

        String input8;
        do {
            System.out.print( "Enter eight move: " );
            input8 = in.nextLine();
            if (!input8.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS*******0X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input8.equals( "e" ));

        String input9;
        do {
            System.out.print( "Enter ninth move: " );
            input9 = in.nextLine();
            if (!input9.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX0X X\n" +
                        "X XXXXXXXXX X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input9.equals( "s" ));

        String input10;
        do {
            System.out.print( "Enter tenth move: " );
            input10 = in.nextLine();
            if (!input10.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX0X X\n" +
                        "X XXXX      X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input10.equals( "s" ));

        String input11;
        do {
            System.out.print( "Enter eleventh move: " );
            input11 = in.nextLine();
            if (!input11.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX     0X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input11.equals( "s" ));

        String input12;
        while(!input11.equals( "s" ) || !input11.equals( "q" )) {
            System.out.print( "Enter twelfth move: " );
            input12 = in.nextLine();
            switch (input12) {
                case "s":
                    System.out.println( "XXXXXXXXXXXXXXX\n" +
                            "X             X\n" +
                            "X XXXXXXXXXXX X\n" +
                            "X XS********X X\n" +
                            "X XXXXXXXXX*X X\n" +
                            "X XXXXXXXXX*X X\n" +
                            "X XXXX     *X X\n" +
                            "X XXXX XXXX0X X\n" +
                            "X XXXX XXXX X X\n" +
                            "X X    XXXXXX X\n" +
                            "X X XXXXXXXXX X\n" +
                            "X X XXXXXXXXX X\n" +
                            "X X         X X\n" +
                            "X XXXXXXXXX   X\n" +
                            "XFXXXXXXXXXXXXX" );
                    String input13;
                    do {
                        System.out.print( "Enter thirteenth move: " );
                        input13 = in.nextLine();
                        if (!input13.equals( "s" )) {
                            System.out.println( "Not a valid move, you've just hit a wall" );
                        } else {
                            System.out.println( "XXXXXXXXXXXXXXX\n" +
                                    "X             X\n" +
                                    "X XXXXXXXXXXX X\n" +
                                    "X XS********X X\n" +
                                    "X XXXXXXXXX*X X\n" +
                                    "X XXXXXXXXX*X X\n" +
                                    "X XXXX     *X X\n" +
                                    "X XXXX XXXX*X X\n" +
                                    "X XXXX XXXX0X X\n" +
                                    "X X    XXXXXX X\n" +
                                    "X X XXXXXXXXX X\n" +
                                    "X X XXXXXXXXX X\n" +
                                    "X X         X X\n" +
                                    "X XXXXXXXXX   X\n" +
                                    "XFXXXXXXXXXXXXX" );
                            System.out.println( "You've lost the game!" );
                            in.close();
                        }
                    } while (!input13.equals( "s" ));
                    break;
                case "q":
                    System.out.println( "XXXXXXXXXXXXXXX\n" +
                            "X             X\n" +
                            "X XXXXXXXXXXX X\n" +
                            "X XS********X X\n" +
                            "X XXXXXXXXX*X X\n" +
                            "X XXXXXXXXX*X X\n" +
                            "X XXXX    0*X X\n" +
                            "X XXXX XXXX X X\n" +
                            "X XXXX XXXX X X\n" +
                            "X X    XXXXXX X\n" +
                            "X X XXXXXXXXX X\n" +
                            "X X XXXXXXXXX X\n" +
                            "X X         X X\n" +
                            "X XXXXXXXXX   X\n" +
                            "XFXXXXXXXXXXXXX" );
                    break;
                default:
                    System.out.println( "Not a valid move." );
                    break;
            }
        }
        String input14;
        do {
            System.out.print("Enter thirteenth move: ");
            input14 = in.nextLine();
            if (!input14.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX   0**X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input14.equals( "q" ));
        String input15;
        do {
            System.out.print("Enter fourteenth move: ");
            input15 = in.nextLine();
            if (!input15.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX  0***X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input15.equals( "q" ));

        String input16;
        do {
            System.out.print("Enter fifteenth move: ");
            input16 = in.nextLine();
            if (!input16.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX 0****X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input16.equals( "q" ));
        String input17;
        do {
            System.out.print("Enter sixteenth move: ");
            input17 = in.nextLine();
            if (!input17.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX0*****X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input17.equals( "q" ));

        String input18;
        do {
            System.out.print( "Enter seventeenth move: " );
            input18 = in.nextLine();
            if (!input18.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX0XXXX X X\n" +
                        "X XXXX XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input18.equals( "s" ));

        String input19;
        do {
            System.out.print( "Enter eighteenth move: " );
            input19 = in.nextLine();
            if (!input19.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX0XXXX X X\n" +
                        "X X    XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input19.equals( "s" ));

        String input20;
        do {
            System.out.print( "Enter nineteenth move: " );
            input20 = in.nextLine();
            if (!input20.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X   0XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input20.equals( "s" ));

        String input21;
        do {
            System.out.print( "Enter twentieth move: " );
            input21 = in.nextLine();
            if (!input21.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X  0*XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input21.equals( "q" ));

        String input22;
        do {
            System.out.print( "Enter twenty-first move: " );
            input22 = in.nextLine();
            if (!input22.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X 0**XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input22.equals( "q" ));

        String input23;
        do {
            System.out.print( "Enter twenty-second move: " );
            input23 = in.nextLine();
            if (!input23.equals( "q" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X0***XXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input23.equals( "q" ));

        String input24;
        do {
            System.out.print( "Enter twenty-third move: " );
            input24 = in.nextLine();
            if (!input24.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X0XXXXXXXXX X\n" +
                        "X X XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input24.equals( "s" ));

        String input25;
        do {
            System.out.print( "Enter twenty-fourth move: " );
            input25 = in.nextLine();
            if (!input25.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X0XXXXXXXXX X\n" +
                        "X X         X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input25.equals( "s" ));

        String input26;
        do {
            System.out.print( "Enter twenty-fifth move: " );
            input26 = in.nextLine();
            if (!input26.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X0        X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input26.equals( "s" ));

        String input27;
        do {
            System.out.print( "Enter twenty-sixth move: " );
            input27 = in.nextLine();
            if (!input27.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*0       X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input27.equals( "e" ));

        String input28;
        do {
            System.out.print( "Enter twenty-seventh move: " );
            input28 = in.nextLine();
            if (!input28.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X**0      X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input28.equals( "e" ));

        String input29;
        do {
            System.out.print( "Enter twenty-eight move: " );
            input29 = in.nextLine();
            if (!input29.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X***0     X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input29.equals( "e" ));

        String input30;
        do {
            System.out.print( "Enter twenty-ninth move: " );
            input30 = in.nextLine();
            if (!input30.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X****0    X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input30.equals( "e" ));

        String input31;
        do {
            System.out.print( "Enter thirtieth move: " );
            input31 = in.nextLine();
            if (!input31.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*****0   X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input31.equals( "e" ));

        String input32;
        do {
            System.out.print( "Enter thirty-first move: " );
            input32 = in.nextLine();
            if (!input32.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X******0  X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input32.equals( "e" ));

        String input33;
        do {
            System.out.print( "Enter thirty-second move: " );
            input33 = in.nextLine();
            if (!input33.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*******0 X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input33.equals( "e" ));

        String input34;
        do {
            System.out.print( "Enter thirty-third move: " );
            input34 = in.nextLine();
            if (!input34.equals( "e" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X********0X X\n" +
                        "X XXXXXXXXX   X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input34.equals( "e" ));

        String input35;
        do {
            System.out.print( "Enter thirty-fourth move: " );
            input35 = in.nextLine();
            if (!input35.equals( "s" )) {
                System.out.println( "Not a valid move, you've just hit a wall" );
            } else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*********X X\n" +
                        "X XXXXXXXXX0  X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input35.equals( "s" ));

        String input36;
        do {
            System.out.print( "Enter thirty-fifth move: " );
            input36 = in.nextLine();
            if (!input36.equals( "e" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*********X X\n" +
                        "X XXXXXXXXX*0 X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input36.equals( "e" ));

        String input37;
        do {
            System.out.print( "Enter thirty-sixth move: " );
            input37 = in.nextLine();
            if (!input37.equals( "e" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*********X X\n" +
                        "X XXXXXXXXX**0X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input37.equals( "e" ));

        String input38;
        do {
            System.out.print( "Enter thirty-seventh move: " );
            input38 = in.nextLine();
            if (!input38.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*********X X\n" +
                        "X XXXXXXXXX**0X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input38.equals( "w" ));

        String input39;
        do {
            System.out.print( "Enter thirty-eighth move: " );
            input39 = in.nextLine();
            if (!input39.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*********X0X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input39.equals( "w" ));

        String input40;
        do {
            System.out.print( "Enter thirty-ninth move: " );
            input40 = in.nextLine();
            if (!input40.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX X\n" +
                        "X X*XXXXXXXXX0X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input40.equals( "w" ));

        String input41;
        do {
            System.out.print( "Enter fortieth move: " );
            input41 = in.nextLine();
            if (!input41.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX X\n" +
                        "X X*XXXXXXXXX0X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input41.equals( "w" ));

        String input42;
        do {
            System.out.print( "Enter forty-first move: " );
            input42 = in.nextLine();
            if (!input42.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X X****XXXXXX0X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input42.equals( "w" ));

        String input43;
        do {
            System.out.print( "Enter forty-second move: " );
            input43 = in.nextLine();
            if (!input43.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X X\n" +
                        "X XXXX*XXXX X0X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input43.equals( "w" ));

        String input44;
        do {
            System.out.print( "Enter forty-third move: " );
            input44 = in.nextLine();
            if (!input44.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X X\n" +
                        "X XXXX*XXXX X0X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input44.equals( "w" ));

        String input45;
        do {
            System.out.print( "Enter forty-fourth move: " );
            input45 = in.nextLine();
            if (!input45.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXX******X0X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input45.equals( "w" ));

        String input46;
        do {
            System.out.print( "Enter forty-fifth move: " );
            input46 = in.nextLine();
            if (!input46.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X X\n" +
                        "X XXXXXXXXX*X0X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input46.equals( "w" ));

        String input47;
        do {
            System.out.print( "Enter forty-sixth move: " );
            input47 = in.nextLine();
            if (!input47.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X X\n" +
                        "X XXXXXXXXX*X0X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input47.equals( "w" ));

        String input48;
        do {
            System.out.print( "Enter forty-seventh move: " );
            input48 = in.nextLine();
            if (!input48.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX X\n" +
                        "X XS********X0X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input48.equals( "w" ));

        String input49;
        do {
            System.out.print( "Enter forty-eighth move: " );
            input49 = in.nextLine();
            if (!input49.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X             X\n" +
                        "X XXXXXXXXXXX0X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input49.equals( "w" ));

        String input50;
        do {
            System.out.print( "Enter forty-ninth move: " );
            input50 = in.nextLine();
            if (!input50.equals( "w" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X            0X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input50.equals( "w" ));

        String input51;
        do {
            System.out.print( "Enter fiftieth: " );
            input51 = in.nextLine();
            if (!input51.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X           0*X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input51.equals( "q" ));

        String input52;
        do {
            System.out.print( "Enter fifty-first: " );
            input52 = in.nextLine();
            if (!input52.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X          0**X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input52.equals( "q" ));

        String input53;
        do {
            System.out.print( "Enter fifty-second: " );
            input53 = in.nextLine();
            if (!input53.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X         0***X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input53.equals( "q" ));

        String input54;
        do {
            System.out.print( "Enter fifty-third: " );
            input54 = in.nextLine();
            if (!input54.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X        0****X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input54.equals( "q" ));

        String input55;
        do {
            System.out.print( "Enter fifty-fourth: " );
            input55 = in.nextLine();
            if (!input55.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X       0*****X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input55.equals( "q" ));

        String input56;
        do {
            System.out.print( "Enter fifty-fifth: " );
            input56 = in.nextLine();
            if (!input56.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X      0******X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input56.equals( "q" ));

        String input57;
        do {
            System.out.print( "Enter fifty-sixth: " );
            input57 = in.nextLine();
            if (!input57.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X     0*******X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input57.equals( "q" ));

        String input58;
        do {
            System.out.print( "Enter fifty-seventh: " );
            input58 = in.nextLine();
            if (!input58.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X    0********X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input58.equals( "q" ));

        String input59;
        do {
            System.out.print( "Enter fifty-eight: " );
            input59 = in.nextLine();
            if (!input59.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X   0*********X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input59.equals( "q" ));

        String input60;
        do {
            System.out.print( "Enter fifty-nine: " );
            input60 = in.nextLine();
            if (!input60.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X  0**********X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input60.equals( "q" ));

        String input61;
        do {
            System.out.print( "Enter sixtieth: " );
            input61 = in.nextLine();
            if (!input61.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X 0***********X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input61.equals( "q" ));

        String input62;
        do {
            System.out.print( "Enter sixty-first: " );
            input62 = in.nextLine();
            if (!input62.equals( "q" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X0************X\n" +
                        "X XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input62.equals( "q" ));

        String input63;
        do {
            System.out.print( "Enter sixty-second: " );
            input63 = in.nextLine();
            if (!input63.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X0XXXXXXXXXXX*X\n" +
                        "X XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input63.equals( "s" ));

        String input64;
        do {
            System.out.print( "Enter sixty-third: " );
            input64 = in.nextLine();
            if (!input64.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X0XS********X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input64.equals( "s" ));

        String input65;
        do {
            System.out.print( "Enter sixty-fourth: " );
            input65 = in.nextLine();
            if (!input65.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X0XXXXXXXXX*X*X\n" +
                        "X XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input65.equals( "s" ));

        String input66;
        do {
            System.out.print( "Enter sixty-fifth: " );
            input66 = in.nextLine();
            if (!input66.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X0XXXXXXXXX*X*X\n" +
                        "X XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input66.equals( "s" ));

        String input67;
        do {
            System.out.print( "Enter sixty-sixth: " );
            input67 = in.nextLine();
            if (!input67.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X0XXXX******X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input67.equals( "s" ));

        String input68;
        do {
            System.out.print( "Enter sixty-seventh: " );
            input68 = in.nextLine();
            if (!input68.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X0XXXX*XXXX X*X\n" +
                        "X XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input68.equals( "s" ));

        String input69;
        do {
            System.out.print( "Enter sixty-eighth: " );
            input69 = in.nextLine();
            if (!input69.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X0XXXX*XXXX X*X\n" +
                        "X X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input69.equals( "s" ));

        String input70;
        do {
            System.out.print( "Enter sixty-ninth: " );
            input70 = in.nextLine();
            if (!input70.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X0X****XXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input70.equals( "s" ));

        String input71;
        do {
            System.out.print( "Enter seventiethth: " );
            input71 = in.nextLine();
            if (!input71.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*X****XXXXXX*X\n" +
                        "X0X*XXXXXXXXX*X\n" +
                        "X X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input71.equals( "s" ));

        String input72;
        do {
            System.out.print( "Enter seventy-first: " );
            input72 = in.nextLine();
            if (!input72.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*X****XXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X0X*XXXXXXXXX*X\n" +
                        "X X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input72.equals( "s" ));

        String input73;
        do {
            System.out.print( "Enter seventy-second: " );
            input73 = in.nextLine();
            if (!input73.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*X****XXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X0X*********X*X\n" +
                        "X XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input73.equals( "s" ));

        String input74;
        do {
            System.out.print( "Enter seventy-third: " );
            input74 = in.nextLine();
            if (!input74.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*X****XXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X*X*********X*X\n" +
                        "X0XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
            }
        } while (!input74.equals( "s" ));

        String input75;
        do {
            System.out.print( "Enter seventy-fourth: " );
            input75 = in.nextLine();
            if (!input75.equals( "s" )) {
                System.out.println( "Not a valid move." );
            }  else {
                System.out.println( "XXXXXXXXXXXXXXX\n" +
                        "X*************X\n" +
                        "X*XXXXXXXXXXX*X\n" +
                        "X*XS********X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXXXXXXX*X*X\n" +
                        "X*XXXX******X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*XXXX*XXXX X*X\n" +
                        "X*X****XXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X*X*XXXXXXXXX*X\n" +
                        "X*X*********X*X\n" +
                        "X*XXXXXXXXX***X\n" +
                        "XFXXXXXXXXXXXXX" );
                System.out.println("YOU'VE WON");
            }
        } while (!input75.equals( "s" ));

    }
}
