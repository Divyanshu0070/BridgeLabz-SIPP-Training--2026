package PracticeElements.Level1;

public class toFindNumberOfPen {int pens = 14;
    int students = 3;

    int pensPerStudent = pens / students;
    int remainingPens = pens % students;

        System.out.println("The Pen Per Student is " + pensPerStudent +" and the remaining pen not distributed is " + remainingPens);
}
