package com.company;

import java.util.Iterator;
import java.util.Scanner;
import com.company.FileUtils;
import com.company.Note;
import java.util.concurrent.TimeUnit;
import java.util.Date;


/**
 * @author MMNazari1380
 * @version 1.0
 */
public class Main {
    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        //menu
        Scanner sc = new Scanner(System.in);
        System.out.println("gozine morede nazar ra vared konid");
        System.out.println("  1 : kar ba buffer ");
        System.out.println("  2 : kar ba shey");
        int x = sc.nextInt();
        FileUtils file = new FileUtils();
        //kar ba buffer
        if(x==1){

            System.out.println("gozine morede nazar ra vared konid");
            System.out.println(" 1 : write ");
            System.out.println("  2 : read ");
            System.out.println("  3 : delete ");

            int x1 = sc.nextInt();
            if(x1==1){
                // write dar file ba buffer
                System.out.println("esm file ra vared konid");
                String name = sc.next();
             //   TimeUnit.SECONDS.sleep(6);
                System.out.println("matn file ra vared konid");
                String text = sc.next();
                file.fileWriter(name,text);


            }
            if(x1==2){
                //read file ba buffer
                System.out.println("esm file ra vared konid");
                String name = sc.next();
                System.out.println(file.fileReader(name));

            }
            if(x1==3){
                System.out.println("esm file ra vared konid");
                System.out.println("entehaye file .txt ra ezafe konid");
                String name = sc.next();
                file.delete(name);
            }


        }

        //kar ba ashia
         if(x==2){

             Note n1 = new Note();
             //menu
             System.out.println("gozine morede nazar ra vared konid");
             System.out.println(" 1 : write ");
             System.out.println("  2 : read ");
             System.out.println("  3 : delete ");

             int x2 = sc.nextInt();
             //write dar kar ba ashia
             if(x2==1){

                 System.out.println("esm file ra vared konid");
                 String name = sc.next();
                // TimeUnit.SECONDS.sleep(6);
                 System.out.println("matn file ra vared konid");
                 String text = sc.next();

                 n1.setContent(text);
                 n1.setDate(new Date());
                 n1.setTitle(name);
                 file.objectFileWriter(name,n1);
             }
             // read dar kar ba ashia
             if(x2==2){
                 System.out.println("esm file ra vared konid");
                 String name = sc.next();
                 Note s = file.objectFileReader(name);
                 System.out.println(s.getContent()+"\n"+s.getTitle()+"\n"+s.getDate());
             }
             if(x2==3){
                 System.out.println("esm file ra vared konid");
                 System.out.println("entehaye file .sre ra ezafe konid");
                 String name = sc.next();
                 file.delete(name);
             }



    }
}
}

