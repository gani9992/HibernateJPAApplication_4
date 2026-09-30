package org.com.secondjpaapplication;

import org.com.dao.Dao;
import org.com.dao.DaoImpl;
import org.com.entity.Student;
import org.com.entity.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1=new Student();
    	Teacher t1=new Teacher();
    	t1.setId(1);
    	t1.setSection("A");
    	s1.setName("abdul_gani_l1");
    	s1.setT1(t1);
    	Dao d1=new DaoImpl();
    	d1.saveStudent(s1);
    }
}
