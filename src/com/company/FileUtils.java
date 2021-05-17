package com.company;



import java.io.*;

/**
 * @author MMNazari1380
 * @version 1.0
 */
public class FileUtils {
    /**
     *
     * @param name write dar file ba name
     * @param text matni ke dar file minevisad
     */
    public void fileWriter(String name , String text){


        try {
            //baraye dadane adress
            String path ="./"+name+".txt";
            FileWriter f1 = new FileWriter(path);
            BufferedWriter b1 = new BufferedWriter(f1);
            b1.write(text);
            b1.close();

        }catch (IOException e){
            e.printStackTrace();

        }
    }

    /**
     *
     * @param name  esme file khande shavande
     * @return  mohtaviate file
     */
    public String fileReader(String name){
        String result ="";
        try {
            //baraye dadane adress
            String path ="./"+name+".txt";
            FileReader f2 = new FileReader(path);
            BufferedReader b2 = new BufferedReader(f2);
            String nextline="";
            while((nextline=b2.readLine())!= null){
               result+=nextline;
            }




        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        return result;

    }

    /**
     *
     * @param name name file baraye gozashtane object dar an
     * @param object shey baraye neveshtan dar file
     */
    public void objectFileWriter(String name , Object object){
        try {
            //baraye dadane adress
            String path ="./"+name+".ser";
            FileOutputStream f3 = new FileOutputStream(path);
            ObjectOutputStream b3 = new ObjectOutputStream(f3);
            b3.writeObject(object);



        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    /**
     *
     * @param name esme file khande shavande
     * @return shey dakhele file
     */
    public Note objectFileReader(String name)  {
        Note obj=null;


        try {
            //baraye dadane adress
            String path ="./"+name+".ser";
            FileInputStream f4 = new FileInputStream(path);
            ObjectInputStream b4 = new ObjectInputStream(f4);
            obj=(Note) b4.readObject();


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }

    /**
     *
     * @param name hazfe file morede nazar
     */
     public void delete(String name){
        File ff = new File(name);
        ff.delete();
     }

}
