import java.io.*;


public class FileDemo{

    public static void main(String []args){
    /*
        char c;
        String buffer;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            // do{
            //     c = (char)br.read();
            //     System.out.print(c);
            // }while(c != 'q');

            do{
                buffer = br.readLine();
                System.out.print(buffer);
                System.out.write('\n');
            }while(!buffer.equals("quit"));
        }
        catch(Exception e){
            System.out.println(e);
        }
    */
       
    
    
    try{
        File fileout = new File("./test.txt");
        InputStream os = new FileInputStream(fileout);
        
        os.close();
    }
    catch(Exception e){
        System.out.println(e);
    }
    
    try{
        byte [] bWrite = {11, 21, 3, 40, 5 };
    /*
        File filein = new File("./test.txt");
        OutputStream os = new FileOutputStream(filein);
        //OutputStream os = new FileOutputStream("./test.txt");
        for(byte b : bWrite) {
            os.write(b);
        }
        os.close();
    */
        //write file method2
        File f = new File("test2.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        writer.append("中文输入");
        writer.append("\r\n");
        writer.append("English");
        writer.close();
        fop.close();
        //read file method2
        FileInputStream fip  = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fip, "UTF-8");
        StringBuffer sb = new StringBuffer();
        while(reader.ready()){
            sb.append((char)reader.read());
        }
        // System.out.println(sb.toString());
        reader.close();
        fip.close();

        //create directors...
        String dir = "./tmp/test/mkdir/1/2/3/4/5/6/7";
        File makedir = new File(dir);
        makedir.mkdirs();

        //dir list
        //String dirname = "C:/Users/Administrator/Desktop/Lian/code/";
        String dirname = "./";
        File dirlist = new File(dirname);
        showFiles(dirlist, dirname);
       

        //delete dir
        File deleteFile = new File("./tmp");
        deleteFolder(deleteFile);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    static  int level_dir = 0;
    static  int level_file = 0;

    public static void showFiles(File file, String dirname){
         if(file.isDirectory()){
            String[] s = file.list();
            for(String subdir : s){
                File tmp_file = new File(dirname + "/" + subdir);
                if(tmp_file.isDirectory()){                   
                    System.out.println(subdir);
                    showFiles(tmp_file, dirname+subdir);
                }
                else if(tmp_file.isFile()){
                    level_file++;
                    level_file++;
                    System.out.println("\t" + subdir);
                }
            }
        }
    }


    public static void deleteFolder(File file){
        File[] files = file.listFiles();
        if(files != null){
            for(File f : files){
                if(f.isDirectory()){
                    deleteFolder(f);
                }
                else{
                    // System.out.println("delete file: " + f.getName());
                    f.delete();
                }
            }
        }
        // System.out.println("delete directory: " + file.getName());
        file.delete();
    }
}