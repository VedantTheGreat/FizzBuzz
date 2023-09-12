public class Reduce {
    public static void main(String[] args) {
        int i=100 ;
        int c=0;
        while (i>0){
            if(i%2==0) {
                c+=1;
                i=i/2;
            }
            else{
                c+=1;
                i=i-1;
            }
        }
        System.out.println(c);
        }
    }

