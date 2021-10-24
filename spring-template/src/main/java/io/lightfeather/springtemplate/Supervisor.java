package io.lightfeather.springtemplate;

//POJO
public class Supervisor {

    // fields
    private int id;
  
    // constructors
    public Supervisor() {
    }
    
    public Supervisor(int id) {
        this.id = id;
    }
  
    // setters and getters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
  
    @Override
      public String toString() {
          return "Supervisor [id=" + id + "]";
      }
  }