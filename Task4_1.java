class Task4_1 {

    public static final String DEFAUL_COURSE_NAME = "JavaSE";
    
    public static final double DEFAUL_COURSE_COST = 1000.0;
    
    public static final int DEFAUL_LESSONS_COUNT = 30;
    
    public static final int DEFAUL_HOURS_IN_LESSON = 3;

    public static void main(String[] args) {
       
        int argsSize = args.length;
        System.out.println(argsSize);
           
        if(argsSize != 0 && argsSize != 2 && argsSize != 4 && argsSize != 6 && argsSize != 8) {
            System.out.println("Error Arguments Count");
            System.exit(0);
        }
        if(argsSize == 2) {
            if(args[0].equals("-courseName") == false) {
                System.out.println("Error Argument Name. Should be -courseName");
                System.exit(0);
            } 
        }
        if(argsSize == 4) {
            if(args[0].equals("-courseName") == false) {
                System.out.println("Error Argument Name. Should be -courseName");
                System.exit(0);
            }
            if(args[2].equals("-courseCost") == false) {
                System.out.println("Error Argument Cost. Should be -courseCost");
                System.exit(0);
            }
        }
        if(argsSize == 6) {
            if(args[0].equals("-courseName") == false) {
                System.out.println("Error Argument Name. Should be -courseName");
                System.exit(0);
            }
            if(args[2].equals("-courseCost") == false) {
                System.out.println("Error Argument Cost. Should be -courseCost");
                System.exit(0);
            }
            if(args[4].equals("-lessonsCount") == false) {
                System.out.println("Error Argument Count. Should be -lessonsCount");
                System.exit(0);
            }
            
        }
        if(argsSize == 8) {
            if(args[0].equals("-courseName") == false) {
                System.out.println("Error Argument Name. Should be -courseName");
                System.exit(0);
            }
            if(args[2].equals("-courseCost") == false) {
                System.out.println("Error Argument Cost. Should be -courseCost");
                System.exit(0);
            }
            if(args[4].equals("-lessonsCount") == false) {
                System.out.println("Error Argument Count. Should be -lessonsCount");
                System.exit(0);
            }
            if(args[6].equals("-hoursInLesson") == false) {
                System.out.println("Error Argument hoursInLesson. Should be -hoursInLesson");
                System.exit(0);
            }
        }
        
        String name = DEFAUL_COURSE_NAME;
        double cost = DEFAUL_COURSE_COST;
        int lessons  = DEFAUL_LESSONS_COUNT;
        int hours = DEFAUL_HOURS_IN_LESSON;
        
        if(argsSize == 2) {
            name = args[1];         
        }
        if(argsSize == 4) {
            name = args[1]; 
            cost = Double.parseDouble(args[3]);         
        }
        if(argsSize == 6) {
            name = args[1]; 
            cost = Double.parseDouble(args[3]); 
            lessons = Integer.parseInt(args[5]); 
        }
        if(argsSize == 8) {
            name = args[1]; 
            cost = Double.parseDouble(args[3]); 
            lessons = Integer.parseInt(args[5]); 
            hours = Integer.parseInt(args[7]); 
        }
        
        double eachLesson = cost / lessons;
        double eachHour = eachLesson / hours;
        double eachMinute = eachHour / 60;
        double eachSecond = eachMinute / 60;
        
        System.out.println("name = " + name);
        System.out.println("cost = " + cost);
        System.out.println("lessons = " + lessons);
        System.out.println("hours = " + hours);
        
        System.out.println("eachLesson = " + eachLesson);
        System.out.println("eachHour = " + eachHour);
        System.out.println("eachMinute = " + eachMinute);
        System.out.println("eachSecond = " + eachSecond);       
    }
}