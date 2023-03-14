import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<File> getFiles() {
        return this.files;
    }

    public ArrayList<Folder> getSubfolders() {
        return this.subfolders;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addSubfolder(Folder folder) {
        this.subfolders.add(folder);
    }

    public void removeFile(File file) {
        this.files.remove(file);
    }

    public void removeSubfolder(Folder folder) {
        this.subfolders.remove(folder);
    }

    public void printContents() {
        System.out.println(name);
       /* System.out.println("Files:");*/
        for (File file : files) {
            System.out.println("\tfile:"+file.getName());
        }
        /*System.out.println("Subfolders:");*/
        for (Folder subfolder : subfolders) {
            System.out.print("\tsubfol:");
            subfolder.printContentsHelper(1);
        }
    }

    private void printContentsHelper(int level) {
        System.out.println("\t " + name);
        /* System.out.println("Subfolders:");*/
        for (Folder subfolder : subfolders) {
            System.out.print("\t");
            for (int i = 0; i <= level; i++) {
                System.out.print("\t\t");
            }
            System.out.print("subfol:");
            subfolder.printContentsHelper(level + 1);
        }
        /*System.out.println("");*/
        for (File file : files) {
            for (int i = 0; i <= level; i++) {
                System.out.print("\t\t");
            }
            System.out.println("file:"+file.getName());
        }


    }

    public void delete() {
        for (File file : this.files) {
            file.delete();
        }
        for (Folder folder : this.subfolders) {
            folder.delete();
        }
        this.files.clear();
        this.subfolders.clear();
    }
}