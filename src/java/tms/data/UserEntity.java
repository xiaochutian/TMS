/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tms.data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Azige
 */
@Entity
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String password;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public int hashCode(){
        int hash = 0;
        hash += id;
        return hash;
    }

    @Override
    public boolean equals(Object object){
        if (!(object instanceof UserEntity)){
            return false;
        }
        UserEntity other = (UserEntity)object;
        return (this.id == other.id);
    }

    @Override
    public String toString(){
        return "tms.data.UserEntity[ id=" + id + " ]";
    }

}
