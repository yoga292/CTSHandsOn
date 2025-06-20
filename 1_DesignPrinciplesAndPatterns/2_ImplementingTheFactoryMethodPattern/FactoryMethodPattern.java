interface Document
{
    public void open();
}
class WordDocument implements Document{
    public void open()
    {
        System.out.println("Word Document");
    }
}
class PdfDocument implements Document{
    public void open()
    {
        System.out.println("Pdf Document");
    }
}
class ExcelDocument implements Document{
    public void open()
    {
        System.out.println("Excel Document");
    }
}


abstract class DocumentFactory
{
   public abstract Document createDocument();
}
class WordDocumentFactory extends DocumentFactory
{
   public Document createDocument()
   {
        return new WordDocument();
   }
}
class PdfDocumentFactory extends DocumentFactory
{
   public Document createDocument()
   {
        return new PdfDocument();
   }
}
class ExcelDocumentFactory extends DocumentFactory
{
   public Document createDocument()
   {
        return new ExcelDocument();
   }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        DocumentFactory wordf=new WordDocumentFactory();
        Document word=wordf.createDocument();
        word.open();

        DocumentFactory pdff=new PdfDocumentFactory();
        Document pdf=pdff.createDocument();
        pdf.open();

        DocumentFactory excf=new ExcelDocumentFactory();
        Document excel=excf.createDocument();
        excel.open();

    }
    
} 
