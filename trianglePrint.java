package com.company;

public class object1 {
    static object1 mm = new object1();//创建对象mm

    void print1() {
        for (int j = 0; j <= 5; j++) {
            for (int i = 5 - j; i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

————————————————————————————————————————————————————————————————
package com.company;

public class Main extends object1{

    public static void main(String[] args) {
     mm.print1();

    }
}
