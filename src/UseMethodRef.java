import java.util.*;

class MyClass {
    private int var;
    MyClass(int v){
        var = v;
    }
    int getVar() {
        return var;
    }

}

public class UseMethodRef {
    static int compareMC(MyClass a,MyClass b){
        return a.getVar() - b.getVar();
    }
    public static void main (String args[]){
        ArrayList<MyClass> a1 = new ArrayList<MyClass>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(2));
        a1.add(new MyClass(3));
        a1.add(new MyClass(43));
        a1.add(new MyClass(5));
        a1.add(new MyClass(6));

        MyClass max = Collections.max(a1,UseMethodRef::compareMC);
        System.out.print("Maximum:"+ max.getVar());

    }
}
