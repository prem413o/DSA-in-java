import java.util.ArrayList;

public class Maxwater {

    public static int Calculatemaxwater(ArrayList<Integer> height){
        int maxwater=0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int width=j-i;
                int ht=Math.min(height.get(i),height.get(j));
                int currwater=ht*width;

                if(maxwater<currwater){
                    maxwater=currwater;
                }
            }
        }
        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("the maximum water holds is "+Calculatemaxwater(height));

    }
    
}
