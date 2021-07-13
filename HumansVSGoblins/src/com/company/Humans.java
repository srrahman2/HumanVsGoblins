package com.company;

public class Humans {
    private char h;
    int x;
    int y;
    private int health;
    private char move;

    public Humans(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Humans(int health){
        this.health = health;
    }

    public int getPosHX(){
        return this.x;
    }

    public int getPosHY(){
        return this.y;
    }

    public void setPosHX(int x){
        this.x = x;
    }

    public void setPosHY(int y){
        this.y = y;
    }

    public int getHealth(){
        return health;
    }

    public char getMove(){
        return this.move;
    }

    public void setMove(char move){
        this.move = move;
    }

    public void movement(char move, int newX, int newY, int limitrow, int limitcols){
        switch (move){
            case 'n': if(newY > 0)
            {
                newY = newY -1;
                System.out.println("HY = " + newY);
                setPosHY(newY);
            }
            else
            {
                System.out.println("Invalid Move");

            }
                break;

            case 's': if(newY < limitcols-1)
            {
                newY = newY + 1;
                System.out.println("HY = " + newY);
                setPosHY(newY);
            }
            else
            {
                System.out.println("Invalid Move");

            }
                break;

            case 'e': if(newX < limitrow-1)
            {
                newX = newX+1;
                System.out.println("HX = " + newX);
                setPosHX(newX);
            }
            else
            {
                System.out.println("Invalid Move");
            }
                break;

            case 'w': if(newX > 0)
            {
                newX = newX-1;
                System.out.println("HX = " + newX);
                setPosHX(newX);
            }
            else
            {
                System.out.println("Invalid Move");
            }
                break;

            default:
                System.out.println("Invalid Move");
        }
    }

    @Override
    public String toString()
    {
        return "Human created!";
    }
}
