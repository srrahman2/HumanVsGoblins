package com.company;

import java.net.SocketOption;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userinput = new Scanner(System.in);
        String YN;
        do{
            System.out.println("Number of Rows for the Grid (more than 2): ");
            int rows = Integer.parseInt(userinput.next());
            System.out.println("Number of Columns for the Grid (more than 2): ");
            int cols = Integer.parseInt(userinput.next());

            Land land = new Land(rows, cols);
            System.out.println(land);

            Humans humans = new Humans(20);
            System.out.println(humans);
            humans.setPosHX(2);
            humans.setPosHY(1);

            Goblins goblins = new Goblins(25);
            System.out.println(goblins);
            goblins.setPosGX(1);
            goblins.setPosGY(2);

            boolean combat = false;
            //char[][] test = land.getGrid();

        /*System.out.println("Size: " + test.length);
        for(int i = 0; i < test.length; i++)
        {
            for(int j = 0; j < test[i].length; j++)
            {
                test[i][j] = 'x';
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }*/

            land.createGrid();

            //System.out.println("Grid Size: " + land.getGrid());

            int HX = humans.getPosHX();
            int HY= humans.getPosHY();

            int GX = goblins.getPosGX();
            int GY = goblins.getPosGY();

            System.out.println("Humans: X = " + HX + " Y = " + HY);
            System.out.println("Goblins: X = " + GX + " Y = " + GY);


            do{
                System.out.println();
                System.out.println("Move Human (n/s/e/w): ");
                char HM = userinput.next().toLowerCase().charAt(0);
                humans.movement(HM, HX, HY, rows, cols);
                if(HM == 'e' || HM == 'w')
                {
                    HX = humans.getPosHX();
                }
                else if(HM == 'n' || HM == 's')
                {
                    HY = humans.getPosHY();
                }

                System.out.println("Move Goblin (n/s/e/w): ");
                char GM = userinput.next().toLowerCase().charAt(0);
                goblins.movement(GM, GX, GY, rows, cols);
                if(GM == 'e' || GM == 'w')
                {
                    GX = goblins.getPosGX();
                }
                else if(GM == 'n' || GM == 's')
                {
                    GY = goblins.getPosGY();
                }


        /*humans.setPosHX(1);
        humans.setPosHY(0);

        HX = humans.getPosHX();
        HY= humans.getPosHY();*/

                System.out.println("Humans: X = " + HX + " Y = " + HY);
                System.out.println("Goblins: X = " + GX + " Y = " + GY);

                System.out.println();
                int h1 = humans.getHealth();
                System.out.println("Human's Health Before Combat: "+ h1);
                int h2 = goblins.getHealth();
                System.out.println("Goblin's Health Before Combat: "+ h2);

                if(HX == GX && HY == GY)
                {
                    while(h1 >= 1 && h2 >= 1)
                    {
                        h1 = h1 - land.combat();

                        h2 = h2 - land.combat();

                        if(h1 < 0)
                        {
                            h1 = 0;
                        }

                        if(h2 < 0)
                        {
                            h2 = 0;
                        }

                        System.out.println("Human's Health: "+ h1);
                        System.out.println("Goblin's Health: "+ h2);

                        if(h1 <= 0 || h2 <=0)
                            break;
                    }

                    if(h1 < h2)
                    {
                        System.out.println("ALAS! HUMAN IS DEAD");
                    }
                    else if(h2 < h1)
                    {
                        System.out.println("ALAS! GOBLIN IS DEAD");
                    }
                    else
                    {
                        System.out.println("ALAS! BOTH ARE DEAD!");
                    }
                    combat = true;
                }
            }while (!combat);

            System.out.println("Do you want to play again?(y or n)");
            YN = userinput.next().toLowerCase();

        }while (YN.equals("y"));
    }
}

/*
        //West
        if(newX > 0)
                {
                newX = newX-1;
                System.out.println("X = " + newX);
                }
                else
                {
                System.out.println("Invalid Move");
                }

                //North
                if(newY > 0)
                {
                newY = newY -1;
                System.out.println("Y = " + newY);
                }
                else
                {
                System.out.println("Invalid Move");

                }

                //East
                if(newX < 2)
        {
        newX = newX+1;
        System.out.println("X = " + newX);
        }
        else
        {
        System.out.println("Invalid Move");
        }

        //South
        if(newY < 2)
        {
        newY = newY + 1;
        System.out.println("Y = " + newY);
        }
        else
        {
        System.out.println("Invalid Move");

        }*/
