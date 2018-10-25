import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.attribute.*;


public class P12_1 {
    public static void main(String[] args) {
        FileVisitor<Path> visitor = new FileVisitor<Path>(){
            int indentcount = 0;
            @Override
            public FileVisitResult postVisitDirectory(Path dir,IOException exc){
                //System.out.println(dir);
                indentcount--;
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult preVisitDirectory(Path dir,BasicFileAttributes attrs){
                System.out.println(indentcounter()+dir.getFileName()+"(dir)");
                indentcount++;
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
                System.out.println(indentcounter()+file.getFileName());
                return FileVisitResult.CONTINUE;
            }
            @Override
            public FileVisitResult visitFileFailed(Path file,IOException exc){
                return FileVisitResult.CONTINUE;
            }
            public String indentcounter(){
                int i = 0;
                String str = "";
                while(i != indentcount) {
                    str = str + "   ";
                    i++;
                }
                return str;
            }
        };
        try {
            Files.walkFileTree(Paths.get(".\\"), visitor);
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}
