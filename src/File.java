public class File {
    private String name;
    private Folder parentFolder;

    public File(String name, Folder parentFolder) {
        this.name = name;
        this.parentFolder = parentFolder;
        parentFolder.addFile(this);
    }

    public String getName() {
        return this.name;
    }

    public Folder getParentFolder() {
        return this.parentFolder;
    }

    public void printName() {
        System.out.println("file:"+this.name);
    }

    public void delete() {
        this.parentFolder.removeFile(this);
    }
}