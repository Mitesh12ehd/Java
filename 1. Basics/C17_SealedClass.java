
sealed class A permits B,C {

}

final class B extends A{

}

non-sealed class C extends A{

}

class D{

}

sealed interface X permits Y{

}
non-sealed interface Y extends X{

}

public class C17_SealedClass {
    public static void main(String[] args) {

        // sealed class introduced in java 17
        
        // abstract class are meant to be inherited
        // final class are meant to be not inherited
        // What if we want to restrict only few class that can inherit parent?
        // using sealed class

        // Rules for sealed class
        // 1. sealed class must permit one or more classes
        // 2. a class who granted permission, must be sealed, non-sealed or final.
        
        // non-sealed class can be extended by any class

        // sealed interface?
        // we can avoid final in granted interface, as interface is final only.
    }    
}
