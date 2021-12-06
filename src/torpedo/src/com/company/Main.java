package com.company;

import java.util.Scanner;

public class Main {

    public static void irasdki(int map[]){
        System.out.println("  A B C D E F G H I J");
        System.out.print("0 ");
    for(int i=0;i<map.length;i++){

        switch (map[i]) {
            case 0:
                System.out.print(". ");
                break;
            case 1:
                System.out.print("# ");
                break;
            case 2:
                System.out.print("X ");
                break;
        }
        if((i+1)%10==0){
            System.out.println("");
            if(i!=99) {

                System.out.print(((i + 1) / 10));
                System.out.print(" ");
            }
        }
    }
    }



    public static void main(String[] args) throws InterruptedException {
        int map1[]=new int [100];
        int map2[]=new int [100];
        for(int i=0;i<100;i++) {
            map1[i] = 0;
            map2[i] = 0;
        }
        int kör=-1;
        int nyert=-3;
        int hajok[]= new int[]{5, 4, 3, 3, 2};
        do{
            System.out.print("Játékos ");
            System.out.print(kör+2);
            System.out.println(",");
            for(int i=0;i<hajok.length;i++){
                int  hely1=0;int  hely2=0;
                char betű1=0;char betű2=0;
                String tmp="vfsfs";
                System.out.print("Hova szeretnéd rakni a ");
                System.out.print(hajok[i]);
                System.out.println(" egység hooszú hajódat?");
                System.out.println();
                System.out.println("Eddigi pályád:");
                if(kör==-1){
                    irasdki(map1);
                }else{
                    irasdki(map2);
                }
                Scanner sc = new Scanner(System.in);
                System.out.println("Kezdő pont száma:" );
                hely1= sc.nextInt();
                System.out.println("Kezdő pont betűje:");
                tmp= sc.next();
                betű1=tmp.charAt(0);
                System.out.println("Végpont száma:" );
                hely2= sc.nextInt();
                System.out.println("Végpont betűje:");
                tmp= sc.next();
                betű2=tmp.charAt(0);
                Boolean iigaz=false;
                if(kör==-1){if(
                Math.abs(hely1-hely2-1)== hajok[i]||Math.abs(betű1-betű2-1)== hajok[i]&&
                betű1>64&&betű1<75&&betű2>64&&betű2<75&&
                hely1>=0&&hely1<=10&&hely2>=0&&hely2<=10
                ){
                Boolean igaz = true;
                for(int j =0;j<hajok[i];j++){
                    if(Math.abs(hely1-hely2-1)== hajok[i]){
                        if(map1[((hely1+j)*10)+(betű1-65)]==1){
                            igaz=false;
                        }
                        
                    }else{
                        if(map1[(hely1*10)+(betű1+j-65)]==1){
                            igaz=false;
                        }
                    }
                }
                if(igaz){

                
                for(int j =0;j<hajok[i];j++){
                    

                    if(Math.abs(hely1-hely2-1)== hajok[i]){
                        map1[((hely1+j)*10)+(betű1-65)]=1;
                    }else{
                        map1[(hely1*10)+(betű1+j-65)]=1;
                    }
                }
                }
                iigaz=igaz;
                
                }}else{if(
                    Math.abs(hely1-hely2-1)== hajok[i]||Math.abs(betű1-betű2-1)== hajok[i]&&
                    betű1>64&&betű1<75&&betű2>64&&betű2<75&&
                    hely1>=0&&hely1<=10&&hely2>=0&&hely2<=10
                    ){
                        Boolean igaz = true;
                        for(int j =0;j<hajok[i];j++){
                            if(Math.abs(hely1-hely2-1)== hajok[i]){
                                if(map1[((hely1+j)*10)+(betű1-65)]==1){
                                    igaz=false;
                                }
                                
                            }else{
                                if(map1[(hely1*10)+(betű1+j-65)]==1){
                                    igaz=false;
                                }
                            }
                        }
                        if(igaz){
                    for(int j =0;j<hajok[i];j++){
                        if(Math.abs(hely1-hely2-1)== hajok[i]){
                            map2[((hely1+j)*10)+(betű1-65)]=1;
                        }else{
                            map2[(hely1*10)+(betű1+j-65)]=1;
                        }
                    }
                }
                iigaz=igaz;

                }}
                if(!iigaz){
                    i--;
                }
            }
            kör++;
        }while(kör!=1);


        while(nyert!=0&&nyert!=1){

        }
    }
}

