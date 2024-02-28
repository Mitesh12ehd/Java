public class DownCast{
    public static void main(String args[]){
        Boy b1 = new Boy();
        System.out.println("value of b1 is "+b1);

        Human h = b1;
        if(h instanceof Boy){
            System.out.println("downcast is safe");
            Boy b2 = (Boy)h;
            System.out.println("value of b2 is "+b2);
        }

    }
}

class LivingBodies extends Object{

}
class Human extends LivingBodies{

}
class Boy extends Human{

}