package com.company;


import java.io.Serializable;
import java.util.Date;

/**
 * @author MMNazari1380
 * @version 1.0
 */

public class Note implements Serializable {
    //esm file
    private String title ;
    // matne file
    private String content ;
    // tarikh
    private Date date ;

    /**
     * constructor
     * @param title  onvane file
     * @param content mohtavaye file
     * @param date tarikh va zaman
     */
    // constructor niazi nist chonke dar Main set mikonim
 /*   public Note(String title,String content,Date date){
        this.date=date;
        this.content=content;
        this.title=title;
    }*/

    /**
     *
     * @param title
     */
    public void setTitle(String title){
        this.title= title;
    }

    /**
     *
     * @return esme file
     */
    public String getTitle(){
        return title;
    }

    /**
     *
     * @param content
     */
    public void setContent(String content){
        this.content= content;
    }

    /**
     *
     * @return matne file
     */
    public String getContent(){
        return content;
    }

    /**
     *
     * @param date
     */
    public void setDate(Date date){
        this.date= date;
    }

    /**
     *
     * @return tarikh
     */
    public Date getDate(){
        return date;
    }
}
