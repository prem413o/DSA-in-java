public class OOPS{
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setcolor("Yellow");
        p1.settip(5);

        System.out.println("the pen color is "+p1.color);
        System.out.println("the tip size of pen is "+p1.tip);


    }
}

class Pen{
    String color;
    int tip;

    void setcolor(String newcolor){
        color=newcolor;
    }

    void settip(int newtip){
        tip=newtip;
    }

}