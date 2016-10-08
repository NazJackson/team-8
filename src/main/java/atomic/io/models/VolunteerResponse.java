package atomic.io.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by nazhirjackson on 10/7/16.
 */
@Entity
public class VolunteerResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String zipCode;
    private String organizationName;
    private String shortDescription;


    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id= id;

    }
    public String getZipCode(){
        return zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;

    }
    public String getOrganizationName(){
        return organizationName;

    }
    public void setOrganizationName(String organizationName){
        this.organizationName = organizationName;
    }
    public String getShortDescription(){
        return shortDescription;
    }
    public void setShortDescription(String shortDescription){
        this.shortDescription = shortDescription;
    }
}
