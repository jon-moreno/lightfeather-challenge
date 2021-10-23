package io.lightfeather.springtemplate;

//POJO
public class Supervisor {
    
    // fields
    private final long id;

    // constructor
    public Supervisor(long id) {
        this.id = id;
    }

    // accessors aka "getters"
    public long getId() {
        return id;
    }

}