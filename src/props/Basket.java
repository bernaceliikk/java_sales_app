package props;

public class Basket {

    private int bid;
    private int bpid;
    private int curType;
    private int prstock;

    public int getCurType() {
        return curType;
    }

    public void setCurType(int curType) {
        this.curType = curType;
    }

    
    
    public int getPrstock() {
        return prstock;
    }

    public void setPrstock(int prstock) {
        this.prstock = prstock;
    }
    
    

    public int getBpid() {
        return bpid;
    }

    public void setBpid(int bpid) {
        this.bpid = bpid;
    }
    private String prtitle;
    private double prprice;
    private String uname;
    private String bdate;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getPrtitle() {
        return prtitle;
    }

    public void setPrtitle(String prtitle) {
        this.prtitle = prtitle;
    }

    public double getPrprice() {
        return prprice;
    }

    public void setPrprice(double prprice) {
        this.prprice = prprice;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

}
