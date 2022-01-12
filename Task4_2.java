import java.util.Scanner;

class Task4_2 {

    public static void main(String[] args) {
       
        Integer[] userInputArray = {5, 20, 8, 1,9, 14, 16, 7, 8, 2, 17, 1, 20, 9};
        for (Integer element : userInputArray) {
            System.out.print(" " + element);
        }
        System.out.println();
        Integer max = 0;
        for (Integer element : userInputArray) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println("Max Element = " + max);
        
        Integer min = userInputArray[0];
        for (Integer element : userInputArray) {
            if(element < min) {               
                min = element;
            }
        }
        System.out.println("Min Element = " + min);
        
        max = 0;
        Integer indexForMax = 0;
        for (Integer i = 0; i < userInputArray.length; i++) {
            if(userInputArray[i] > max) {
                max = userInputArray[i];
                indexForMax = i;
            }
        }
        System.out.println("Index Max Element = " + indexForMax); 
        
        min = userInputArray[0];
        Integer indexForMin = 0;
        for (Integer i = 0; i < userInputArray.length; i++) {
            if(userInputArray[i] < min) {
                min = userInputArray[i];
                indexForMin = i;
            }
        }
        System.out.println("Index Min Element = " + indexForMin);
        
        Integer sum = 0;
        for (Integer element : userInputArray) {
            sum = sum + element;
        }
        System.out.println("Sum Element = " + sum);
        
        long Composition = 1;
        for (Integer i = 0; i < userInputArray.length; i++) {
            Composition = Composition * userInputArray[i] ;
        }
        System.out.println("Composition Element = " + Composition);
        
        Integer sumEven = 0;
        for (Integer element : userInputArray) {
            if(element % 2 == 0) {               
                sumEven = sumEven + element;
            }
        }
        System.out.println ("Sum Even Element = " + sumEven);
        
        Integer sumOdd = 0;
        for (Integer element : userInputArray) {
            if((element % 2) != 0) {               
                sumOdd = sumOdd + element;
            }
        }
        System.out.println ("Sum Odd Element = " + sumOdd);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("userElement");
        int a = scanner.nextInt();       
        Integer indexOf = (-1);
        for (Integer i = 0; i < userInputArray.length; i++) {
            if(userInputArray[i] == a) {                 
                indexOf = i;
                break;
            }  
        }
        System.out.println("indexOf = " + indexOf);
        
        System.out.println("userElement");
        a = scanner.nextInt();
        Integer lastIndexOf = (-1);
        for (Integer i = userInputArray.length-1; i > 0; i--) {
            if(userInputArray[i] == a) {                 
                lastIndexOf = i;
                break;
            }  
        }        
        System.out.println("lastIndexOf = " + lastIndexOf);      
    }
}