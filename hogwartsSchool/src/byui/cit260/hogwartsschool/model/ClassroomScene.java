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
 * @author chad
 */
public class ClassroomScene implements Serializable{
    private String description;
    private String instructions;

    public ClassroomScene() {
    }
    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "ClassroomScene{" + "description=" + description + ", instructions=" + instructions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + Objects.hashCode(this.instructions);
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
        final ClassroomScene other = (ClassroomScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.instructions, other.instructions)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
