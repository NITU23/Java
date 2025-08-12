// class Calculator {
//     int sum(int n1, int n2) {
//         return n1 + n2;
//     }
// }

// class for understading static variable.
class Mobile {
    static String phone;
    String name;
    String cost;

    public void show() {
        System.out.println("name :" + name + " cost: " + cost + " Phone: " + phone);
    }
}

class Practice {
    public static void main(String a[]) {
        /*
         * example of switch case
         * //this is the new sytnax for switch case in java
         * String day = "Mon";
         * String result = "";
         * 
         * result = switch (day) {
         * case "Monday" -> "6AM";
         * case "Sunday","Saturday" -> "8AM";
         * default -> "Sleep the whole day";
         * };
         * System.out.println(result);
         * 
         * // this is also a new change if you don't want to use ->
         * result = switch (day) {
         * case "Monday" :yield "6AM";
         * case "Sunday","Saturday": yield "8AM";
         * default :yield "Sleep the whole day";
         * };
         * System.out.println(result);
         */

        // example of using basic class.
        /*
         * Calculator calc = new Calculator();
         * int res = calc.sum(4, 5);
         * System.out.println(res);
         */

        // example of string
        /*
         * String str1 = "String";
         * String str2 = new String("String");
         * String str3 = new String("String");
         * System.out.println(str3 == str2); // this will be false...as == checks the
         * reference.
         * System.out.println(str3.equals(str2)); // this will be true...as it check
         * only the value.
         * System.out.println(str1.equals(str2)); // this will be true ... as it check
         * only the value.
         * System.out.println(str3.hashCode()); // it will print its address.
         */

        // example of mutable & immutable string in java.
        /*
         * String st1 = "string";
         * System.out.println(st1.hashCode());
         * st1 = "hello " + st1;
         * System.out.println(st1);
         * System.out.println(st1.hashCode());
         * // the above two print statement is proof of string is immutable in java..
         * // when we added another string to the parent string.. it simply changed it
         * // address....// that's very nice.
         * 
         * String st2 = "String";
         * String st3 = "String";
         * 
         * System.out.println(st2.hashCode() == st3.hashCode()); // its value will be
         * // true...it shows that only one object
         * // of string is created...only and it has same reference.
         */

        // example of string buffer // in the below example we can see string buffer is
        // mutable
        /*
         * StringBuffer st = new StringBuffer();
         * System.out.println(st.capacity()); // empty string buffer gives me 16
         * capacity.
         * 
         * StringBuffer st2 = new StringBuffer("string");
         * System.out.println(st2.capacity()); // it is giving me 16 + 6
         * System.out.println(st2.hashCode()); // so in this after appending the string
         * it address is not chanegd..
         * st2.append(" star");
         * System.out.println(st2);
         * System.out.println(st2.hashCode()); // so in this after appending the string
         * it address is not changed..
         */

        Mobile mob1 = new Mobile();
        mob1.name = "Apple";
        mob1.cost = "80000";

        Mobile mob2 = new Mobile();
        mob2.name = "One Plus";
        mob2.cost = "20000";

        // mob1.phone = "Smart Phone"; we can assign the static variable using
        // object...but it is not good.

        Mobile.phone = "Smart Phone"; // we should always use the static variable using class.
        mob1.show(); // output : name :Apple cost: 80000 Phone: Smart Phone
        mob2.show(); // output : name :One Plus cost: 20000 Phone: Smart Phone

        // this means that static variable are shared across all the objects of a
        // class....

    }
}