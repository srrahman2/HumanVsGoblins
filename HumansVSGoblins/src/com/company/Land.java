package com.company;


public class Land {
    private int rows;
    private int cols;
    private char[][] l;
    //private char move;

    public Land(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        this.l = new char[rows][cols];
    }

    public void createGrid(){
        int i, j;
        for(i = 0; i < l.length; i++)
        {
            for (j = 0; j < l[i].length; j++)
            {
                l[i][j] = 'x';
                System.out.print(l[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*public char[][] getGrid(){
        return this.l;
    }*/

   /* public void setGrid(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
    }*/

    //Math.random() * (max - min) + min;
    public int combat(){
        int n = (int)(10.0 * Math.random());
        return n;
    }

    @Override
    public String toString()
    {
        return "Land created!";
    }
}
