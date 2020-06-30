/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package props;

/**
 *
 * @author hakan
 */
public class Product {
    
    private int prid;
    private int prcid;
    private String prtitle;
    private double prprice;
    private String prbarcode;
    private String prshelf;
    private int prstock;
    private String prnote;
    private String prdate;
    private int curType;

    public int getCurType() {
        return curType;
    }

    public void setCurType(int curType) {
        this.curType = curType;
    }
    
    

    public int getPrid() {
        return prid;
    }

    public void setPrid(int prid) {
        this.prid = prid;
    }

    public int getPrcid() {
        return prcid;
    }

    public void setPrcid(int prcid) {
        this.prcid = prcid;
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

    public String getPrbarcode() {
        return prbarcode;
    }

    public void setPrbarcode(String prbarcode) {
        this.prbarcode = prbarcode;
    }

    public String getPrshelf() {
        return prshelf;
    }

    public void setPrshelf(String prshelf) {
        this.prshelf = prshelf;
    }

    public int getPrstock() {
        return prstock;
    }

    public void setPrstock(int prstock) {
        this.prstock = prstock;
    }

    public String getPrnote() {
        return prnote;
    }

    public void setPrnote(String prnote) {
        this.prnote = prnote;
    }

    public String getPrdate() {
        return prdate;
    }

    public void setPrdate(String prdate) {
        this.prdate = prdate;
    }
    
}
