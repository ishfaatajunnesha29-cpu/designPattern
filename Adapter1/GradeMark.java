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
public class GradeMark implements Grade
{
    private Mark mark;
    private Grade grade;
    
    public GradeMark(Mark mark,Grade grade)
    {
        this.mark=mark;
        this.grade=grade;
    }
    @Override
    public void markGrade(int markValue) 
    {
        mark.marks(markValue);
        grade.markGrade(markValue);
    }
    
}
