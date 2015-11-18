
public class Main {
    public static void main(String[] args) {

        File diskC = new File();
        diskC.name = "Hard Drive (C)";

        File autoExec = new File();
        autoExec.name = "autoexe.bat";

        diskC.files.add(autoExec);

        File errorlog = new File();
        errorlog.name = "error.log";

        diskC.files.add(errorlog);

        //folder

        File windows = new File();
        windows.name = "Windows";

        File system32 = new File();
        system32.name = "System32";

        windows.files.add(system32);
        diskC.files.add(windows);

        File games = new File();
        games.name = "Games";

        File angryBirds = new File();
        angryBirds.name = "Angry Birds - Rio";

        games.files.add(angryBirds);
        diskC.files.add(games);

        printFileSystem(diskC, "");


    }

    private static void printFileSystem(File file,String ident){
       System.out.print(ident + " " + file.name);
        if (file.files.size() == 0){
            System.out.println(" [File] ");
        }
        else {
            System.out.println(" [Folder] ");
        }

        for (File f : file.files){
            printFileSystem(f,ident + "--");
        }

    }
}
