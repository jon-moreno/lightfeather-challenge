package io.lightfeather.springtemplate;

//POJO
public class Supervisor {

    // fields
    private int id;
    private String firstName;
  
    // constructors
    public Supervisor() {
    }
    
    public Supervisor(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }
  
    // setters and getters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
  
    @Override
      public String toString() {
          return "Supervisor [id=" + id + "]";
      }
  }