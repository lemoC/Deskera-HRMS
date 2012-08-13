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
package com.krawler.hrms.performance;
// Generated Jun 13, 2009 9:07:54 AM by Hibernate Tools 3.2.1.GA

import com.krawler.common.admin.Company;
import java.util.HashSet;
import java.util.Set;

/**
 * Mastercmpt generated by hbm2java
 */
public class Mastercmpt  implements java.io.Serializable {


     private String cmptid;
     private String cmptname;
     private int cmptwt;
     private String cmptdesc;
     private Set<Managecmpt> managecmpts=new HashSet<Managecmpt>(0);
     private Company company;

    public Mastercmpt() {
    }

    public Mastercmpt(String cmptid, String cmptname, int cmptwt, String cmptdesc, Set<Managecmpt> managecmpts, Company company) {
       this.cmptid = cmptid;
       this.cmptname = cmptname;
       this.cmptwt = cmptwt;
       this.cmptdesc = cmptdesc;
       this.company = company;
    }
    
    public String getCmptid() {
        return this.cmptid;
    }

    public void setCmptid(String cmptid) {
        this.cmptid = cmptid;
    }
    public String getCmptname() {
        return this.cmptname;
    }

    public void setCmptname(String cmptname) {
        this.cmptname = cmptname;
    }
    public int getCmptwt() {
        return this.cmptwt;
    }

    public void setCmptwt(int cmptwt) {
        this.cmptwt = cmptwt;
    }
    public String getCmptdesc() {
        return this.cmptdesc;
    }

    public void setCmptdesc(String cmptdesc) {
        this.cmptdesc = cmptdesc;
    }

    public Set<Managecmpt> getManagecmpts() {
        return managecmpts;
    }

    public void setManagecmpts(Set<Managecmpt> managecmpts) {
        this.managecmpts = managecmpts;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}


