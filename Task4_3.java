class Task4_3 {

    public static void main(String[] args) {
        Integer[][] userInputArray = {
            { 5, 17, 9, 10, 16},
            { 7, 4, 15, 13, 8},
            {1, 3, 6, 18, 14}
        };
        
        for(Integer i = 0; i < userInputArray.length; i++) {
            for(Integer j = 0; j < userInputArray[i].length; j++) { 
                System.out.print(" " + userInputArray[i][j]);
            }
            System.out.println();
        }
        
        Integer max = 0;
        Integer indexForMax = 0;
        for (Integer i = 0; i < userInputArray.length; i++) {
            for(Integer j = 0; j < userInputArray[i].length; j++) {           
                if(userInputArray[i][j] > max) {
                    max = userInputArray[i][j];
                    indexForMax = i;
                }
            }                          
        }
        System.out.println("Index Max Element = " + indexForMax); 
        
        max = 0;
        indexForMax = 0;
        for (Integer i = 0; i < userInputArray.length; i++) {
            for(Integer j = 0; j < userInputArray[i].length; j++) {   
                if(userInputArray[i][j] > max) {
                    max = userInputArray[i][j];
                    indexForMax = j;
                }
            }
        }
        System.out.println("Index Min Element = " + indexForMax);
        
        Integer[] sumArray = new Integer[userInputArray.length];
        for(Integer i = 0; i < sumArray.length; i++) {
            sumArray[i] = 0;
        }  
        
        for (Integer i = 0; i < userInputArray.length; i++) { 
            for(Integer j = 0; j < userInputArray[i].length; j++) {
                sumArray[i] = sumArray[i] + userInputArray[i][j];
            }
        }
        
        for (Integer element : sumArray) {               
            System.out.println("Sum Element = " + element);                    
        } 
        
        long[] compositionArray = new long[userInputArray[0].length];
        for(Integer j = 0; j < compositionArray.length; j++) {
            compositionArray[j] = 1;
        }   
        
        for (Integer i = 0; i < userInputArray.length; i++) { 
            for(Integer j = 0; j < userInputArray[i].length; j++) {
                compositionArray[j] = compositionArray[j] * userInputArray[i][j];
            }
        }
        for (long element : compositionArray) {               
            System.out.println("Composition Element = " + element);                    
        } 
        
        Integer[][] userArray = new Integer[userInputArray[0].length][userInputArray.length];
        for(Integer i = 0; i < userInputArray.length; i++) {
            for(Integer j = 0; j < userInputArray[i].length; j++) { 
                userArray[j][i] = userInputArray[i][j];
            }
        }
        
        for(Integer i = 0; i < userArray.length; i++) {
            for(Integer j = 0; j < userArray[i].length; j++) { 
                System.out.print(" " + userArray[i][j]);
            }
            System.out.println();
        }
        
        Integer[][] useOddArray = new Integer[userInputArray.length][];
        Integer[] userTempArray = new Integer[userInputArray[0].length];
        Integer counter = 0;
        for (Integer i = 0; i < userInputArray.length; i++) {
            counter = 0;
            for(Integer j = 0; j < userInputArray[i].length; j++) {
                if(userInputArray[i][j] % 2 == 0) {
                    userTempArray[counter] = userInputArray[i][j];
                    counter++;
                }
            }
            useOddArray[i] = new Integer[counter];
            for(Integer v = 0; v < counter; v++) {
                useOddArray[i][v] = userTempArray[v];
            }           
        }       
        System.out.println();
        
        for(Integer i = 0; i < useOddArray.length; i++) {
            for(Integer j = 0; j < useOddArray[i].length; j++) { 
                System.out.print(" " + useOddArray[i][j]);
            }
            System.out.println();
        }
        
    }
}