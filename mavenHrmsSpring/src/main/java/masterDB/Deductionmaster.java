/*
 * Copyright (C) 2012  Krawler Information Systems Pvt Ltd
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package masterDB;
// Generated Jul 1, 2009 2:58:39 PM by Hibernate Tools 3.2.1.GA


import com.krawler.common.admin.Company;
import java.util.HashSet;
import java.util.Set;

/**
 * Deductionmaster generated by hbm2java
 */
public class Deductionmaster  implements java.io.Serializable {


     private String deductionid;
     private Company companydetails;
     private String deductiontype;
     private Integer rate;
     private String dcode;
     private Double cash;
     private Wagemaster depwageid;
     private boolean isdefault;
     private Integer computeon;
     private String expr;
     

    public Deductionmaster() {
    }

    public Deductionmaster(String deductionid, Company companydetails, String deductiontype, Integer rate, String dcode, Double cash, boolean isdefault, Wagemaster depwageid) {
        this.deductionid = deductionid;
        this.companydetails = companydetails;
        this.deductiontype = deductiontype;
        this.rate = rate;
        this.dcode = dcode;
        this.cash = cash;
        this.isdefault = isdefault;
        this.depwageid = depwageid;
    }

    public Integer getComputeon() {
        return computeon;
    }

    public void setComputeon(Integer computeon) {
        this.computeon = computeon;
    }

    public String getExpr() {
        return expr;
    }

    public void setExpr(String expr) {
        this.expr = expr;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Company getCompanydetails() {
        return companydetails;
    }

    public Wagemaster getDepwageid() {
        return depwageid;
    }

    public void setDepwageid(Wagemaster depwageid) {
        this.depwageid = depwageid;
    }

    public void setCompanydetails(Company companydetails) {
        this.companydetails = companydetails;
    }

    public String getDcode() {
        return dcode;
    }

    public void setDcode(String dcode) {
        this.dcode = dcode;
    }

    public String getDeductionid() {
        return deductionid;
    }

    public void setDeductionid(String deductionid) {
        this.deductionid = deductionid;
    }

    public String getDeductiontype() {
        return deductiontype;
    }

    public void setDeductiontype(String deductiontype) {
        this.deductiontype = deductiontype;
    }

    public boolean isIsdefault() {
        return isdefault;
    }

    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

}

