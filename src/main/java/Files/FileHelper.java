package Files;

import java.io.*;

public class FileHelper {
    private String ReadFileTryWithResources(String path){
        try(BufferedReader br = new BufferedReader(new FileReader(path))) { // try with resource, we can ommit finally{}. Java will take care of closing the Reader, taking care of preventing memory leaks for us!
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    private String ReadFileOldWay(String path){
        BufferedReader br = null;
        try {  // traditional try{}  we must close the reader to free resources!
            br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if (br != null){
                try{
                    br.close(); // frees resources of the reader - prevents memory leaks
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
        return path;
    }

    public String ReadWholeTextFile(String path){
        return ReadFileTryWithResources(path);
    }

    public void DisplayFileSizes(String fileOrDirectoryPath) throws FileNotFoundException {
        File fileOrDirectory = new File(fileOrDirectoryPath);
        if (!fileOrDirectory.exists()){
            throw new FileNotFoundException();
        }

        File fileDirectory = fileOrDirectory.getParentFile();
        for (File childFile : fileDirectory.listFiles()){
            long fileSize = childFile.length();
            System.out.println(childFile.getAbsolutePath() + "  " +  fileSize / 1024  + " kB");
        }
    }
}
