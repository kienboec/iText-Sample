import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PDFSample {
    public static void main(String[] args) {
        try {
            // AGPL License! https://youtu.be/QHF3xcWnSD4
            // https://kb.itextpdf.com/home/it7kb/examples/itext-7-jump-start-tutorial-chapter-1
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("iText-Sample.pdf"));
            document.open();
            document.add(new Paragraph("hello world!"));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}