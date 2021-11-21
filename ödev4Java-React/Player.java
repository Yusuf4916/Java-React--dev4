public class Player {

    private String fName,lName;
    private int TC,birthYear;

    public String getFName() {
        return this.fName;
    }

    public void setAll(String fName,String lName,int TC,int birthYear) {
        this.fName = fName;
        this.lName=lName;
        this.TC=TC;
        this.birthYear=birthYear;
    }

    public String getLName() {
        return this.lName;
    }

    public int getTC() {
        return this.TC;
    }

    public int getBirthYear() {
        return this.birthYear;
    }


    
}
