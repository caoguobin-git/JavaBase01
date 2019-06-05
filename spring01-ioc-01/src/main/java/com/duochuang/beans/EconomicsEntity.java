/***********************************************
 * File Name: EconomicsEntity
 * Author: caoguobin
 * mail: caoguobin@live.com
 * Created Time: 05 06 2019 17:02
 ***********************************************/

package com.duochuang.beans;

public class EconomicsEntity {
    private int id;
    private int affect;
    private String country;
    private String actual;
    private String consensus;
    private String unit;
    private String revised;
    private int star;
    private String previous;
    private String name;
    private String pub_time;
    private int indicator_id;
    private String time_period;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAffect() {
        return affect;
    }

    public void setAffect(int affect) {
        this.affect = affect;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRevised() {
        return revised;
    }

    public void setRevised(String revised) {
        this.revised = revised;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPub_time() {
        return pub_time;
    }

    public void setPub_time(String pub_time) {
        this.pub_time = pub_time;
    }

    public int getIndicator_id() {
        return indicator_id;
    }

    public void setIndicator_id(int indicator_id) {
        this.indicator_id = indicator_id;
    }

    public String getTime_period() {
        return time_period;
    }

    public void setTime_period(String time_period) {
        this.time_period = time_period;
    }
}
