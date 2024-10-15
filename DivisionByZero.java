package Chapter13Division;

public class DivisionByZero {

        public static void main(String[] args){

            try{
                int c= 30/0;
                //System.out.println("Output:" +c);
            }
            catch(Exception e){
                System.out.println("wrong type of calculation");
                e.printStackTrace();
            }finally{
                System.out.println("Division if fun!!");
            }
        }
}
