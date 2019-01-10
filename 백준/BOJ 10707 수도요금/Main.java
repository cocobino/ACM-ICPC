import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] costArr = new int[5];
        int x= 0;
        int y= 0;
 
        for(int i=0; i<costArr.length; i++){
            costArr[i] = sc.nextInt();
        }
 
        x= costArr[0]*costArr[4];
 
        if(costArr[4]<costArr[2]){
            y= costArr[1];
        }else{
            y= costArr[1] + (costArr[4]-costArr[2])*costArr[3];                                     
        }
 
 
        if(xCost< yCost){
            System.out.printlnx
        }else {
            System.out.printlny
        }
 
    }
}