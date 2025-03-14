package org.example;

import app.Book;
import app.Library;
import desserts.IceCream;
import lesson8.*;
import utomigos.Util;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Util.sort2("FGDGYTFYUvhgulYYTFUYFILhjgcALLHFhnrkolr"));

//        Library schoolLibrary = new Library(new Book("Tom Soyer", "Mark Tven", true),
//                new Book("Mu mu", "Turgenev", true),
//                new Book("Familiary", "Unknown", true),
//                new Book("Gek Finn", "Mark Tven", true));
//
//        schoolLibrary.removeBook("Mu mu");
//        schoolLibrary.displayAllBooks();
//Employee a = new Employee("ann", 50);
//        System.out.println(a.getSalary(MonthUtils.year2025));
//
//        Manager b = new Manager("ann2", 100, 1);
//        System.out.println(b.getSalary(MonthUtils.year2025));
//
//        Manager c = new Manager("a", 100, 2);
//        System.out.println(c.getSalary(MonthUtils.year2025));
//
//        Director d = new Director("d", 100, 1);
//        Director d2 = new Director("d2", 100, 2);
//
//        System.out.println(d.getSalary(MonthUtils.year2025));
//        System.out.println(d2.getSalary(MonthUtils.year2025));
//            System.out.printf("");

        IceCream vanilla = new IceCream("Vanilla", 16, 368, false, 100,
                "vanilla", "chocolate", "cup");

        System.out.println(vanilla.getDescription());
    }
}