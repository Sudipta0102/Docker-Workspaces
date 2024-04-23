public class Square{

    public static void main(String[] args){

        System.out.println("Given Range: "+ args[0]);
        int range = Integer.parseInt(args[0]);

        for(int i=1;i<=range;i++){
            System.out.println("Square of "+ i + " is: " + (i*i));        
        }

    }


}