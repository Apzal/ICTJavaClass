public class LoanProgram {
    private int creditPoints = 100;

    public void setCreditPoints(int creditPoints){
        if(this.creditPoints>=creditPoints){
            this.creditPoints=this.creditPoints-creditPoints;
        }

    }

    public int getCreditPoints(){
        return this.creditPoints;
    }


}
