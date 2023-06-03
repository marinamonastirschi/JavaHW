package class22;

public abstract class File {
    private String name;
    private double size;

    File(String name, double size){
        this.name=name;
        this.size=size;
    }

    abstract void open();
    abstract void edit();
    abstract void close();

    public void printInfo(){
        System.out.println(name+" "+size);
    }

}
class JavaFile extends File{
    JavaFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("To open JavaFile we need notepad");
    }
    @Override
    void edit(){
        System.out.println("Edit JavaFile ");
    }
    @Override
    void close(){
        System.out.println("Close JavaFile");
    }
}
class WordFile extends File{
    WordFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("To open WordFile we need Microsoft Word to be installed");
    }
    @Override
    void edit(){
        System.out.println("Edit WordFile ");
    }
    @Override
    void close(){
        System.out.println("Close WordFile");
    }

}
class PdfFile extends File{
    PdfFile(String name, double size) {
        super(name, size);
    }

    @Override
    void open(){
        System.out.println("To open PdfFile we need Adobe Acrobat");
    }
    @Override
    void edit(){
        System.out.println("Edit PdfFile ");
    }
    @Override
    void close(){
        System.out.println("Close PdfFile");
    }
}
class FileTester{
    public static void main(String[] args) {
        File[]file={new JavaFile("JavaFile",1.2),
                new PdfFile("PdfFile",0.8),
                new WordFile("WordFile",1.1)};
        for(File files: file){
            files.open();
            files.edit();
            files.close();
            files.printInfo();
        }
    }
}
