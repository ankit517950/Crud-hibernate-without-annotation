package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class SelectStudent{
    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Scanner scn = new Scanner(System.in);

        // METHOD 1

       // System.out.println("Enter student roll");
        //crud st = (crud) session.load(crud.class,scn.nextInt());
        //System.out.println("Student roll is:" + st.getRoll());
        //System.out.println("Student name is:" + st.getName());
        //System.out.println("Student cgpa is:" + st.getCgpa());
        //System.out.println("Student college is:" + st.getCollege());

        //Method 2

        System.out.println("Enter student roll");
        crud st = (crud) session.get(crud.class,scn.nextInt());
        System.out.println("Student roll is:" + st.getRoll());
        System.out.println("Student name is:" + st.getName());
        System.out.println("Student cgpa is:" + st.getCgpa());
        System.out.println("Student college is:" + st.getCollege());


    }
}
