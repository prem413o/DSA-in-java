//Two pointer approach

import java.util.ArrayList;

public class MaxwaterP{

    public static int twoPointer(ArrayList<Integer> height){
        int Maxwater=0;
        int lp=0;
        int Rp=height.size()-1;

        while(lp<Rp){
            int ht=Math.min(height.get(lp),height.get(Rp));
            int width=Rp-lp;
            int currwater=ht*width;

            if(currwater>Maxwater){
                Maxwater=currwater;
            }

            if(height.get(lp)<height.get(Rp)){
                lp++;
            }else{
                Rp--;
            }
        }
        return Maxwater;
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

        System.out.println("the maximum holding water is "+twoPointer(height));
        
    }
}