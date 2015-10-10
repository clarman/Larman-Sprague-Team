/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author cierasprague
 */
public class Questions implements Serializable{
    private String quiz; 
    private String exam;

    public Questions() {
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Questions{" + "quiz=" + quiz + ", exam=" + exam + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.quiz);
        hash = 79 * hash + Objects.hashCode(this.exam);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.quiz, other.quiz)) {
            return false;
        }
        if (!Objects.equals(this.exam, other.exam)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
