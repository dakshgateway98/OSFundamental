package os5.adderSubtractorSyncronizedMethos;

public class Count {
    private int value;

    public synchronized void incrementValue(int offset){
        this.value += offset;
    }

    public int getValue(){
        return  this.value;
    }

}
