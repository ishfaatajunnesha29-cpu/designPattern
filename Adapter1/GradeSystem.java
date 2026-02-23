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
public class GradeSystem implements Grade
{

    @Override
    public void markGrade(int mark) 
    {
        if(mark>=90&&mark<100)
        {
            System.out.println("'A'Grade");
        }
        else if(mark>=80&&mark<90)
        {
            System.out.println("'B'Grade");
        }
        else if(mark>=65&&mark<80)
        {
            System.out.println("'C'Grade");
        }
        else if(mark>=50&&mark<65)
        {
            System.out.println("'D'Grade");
        }
        else if(mark>0&&mark<50)
        {
            System.out.println("'F'Grade");
        }
        else
        {
            System.out.println("Invalid Mark");
        }
    }
    
}
