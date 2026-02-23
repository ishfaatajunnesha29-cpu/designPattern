/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterDesignPattern;

/**
 *
 * @author ISHFAA TAJ
 */
public class StudentMarkMain 
{
    public static void main(String[] args) 
    {
        Mark mark = new Mark();
        Grade grade = new GradeSystem();
        
        GradeMark adapter = new GradeMark(mark,grade);
        adapter.markGrade(55);
    }
}
