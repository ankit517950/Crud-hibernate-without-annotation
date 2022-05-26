package org.example;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main(String[] args)
    {
        Configuration confg = new Configuration().configure("hibernate.cfg.xml");
//        .addAnnotatedClass(crud.class)
        SessionFactory sf = confg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction txn;
        String choice = "no";
        Scanner scn = new Scanner(System.in);

        do

        {
            txn = session.beginTransaction();

            crud st = new crud();
            System.out.println("enter student name");
            st.setName(scn.nextLine());
            System.out.println("enter student roll");
            st.setRoll(scn.nextInt());
            System.out.println("enter student cgpa");
            st.setCgpa(scn.nextFloat());
            System.out.println("enter student college");
            st.setCollege(scn.next());
            session.save(st);
            txn.commit();
//            session.flush();
            System.out.println("one record inserted succesfully");
            System.out.println("Do you want to insert new employee record");
            choice = scn.next();
            scn.nextLine();
        }
        while(choice.equalsIgnoreCase("y") | choice.equalsIgnoreCase("yes"));
        session.close();
        sf.close();

    }
}
/*


amit kumar

bfd









 */