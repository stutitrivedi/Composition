public class Main {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");



        Folder sourcefiles = new Folder("source files");
        phpDemo1.addSubfolder(sourcefiles);
        Folder phalcon = new Folder(".phalcon");
        sourcefiles.addSubfolder(phalcon);
        Folder app = new Folder("app");
        sourcefiles.addSubfolder(app);
        Folder cconfig= new Folder("Config");
        app.addSubfolder(cconfig);
        Folder controllers= new Folder("Controllers");
        app.addSubfolder(controllers);
        Folder library= new Folder("library");
        app.addSubfolder(library);
        Folder migrations = new Folder("migrations");
        app.addSubfolder(migrations);
        Folder models = new Folder("models");
        app.addSubfolder(models);
        Folder views = new Folder("views");
        app.addSubfolder(views);

        Folder cache = new Folder("cache");
        sourcefiles.addSubfolder(cache);
        Folder publicfolder = new Folder("public");
        sourcefiles.addSubfolder(publicfolder);
        File htaccess = new File(".htaccess", sourcefiles);
        File htrouterphp = new File("htrouter.php", sourcefiles);
        File indexhtml  = new File("index.html", sourcefiles);

        Folder includepath = new Folder("include path");
        phpDemo1.addSubfolder(includepath);
        File remotefils = new File("remote files", phpDemo1);


        phpDemo1.printContents();
        sourcefiles.removeSubfolder(app);
        System.out.print("After deleting folder app ");
        phpDemo1.printContents();
        System.out.print("After deleting folder public ");
        phpDemo1.printContents();
    }
}