package de.die_gfi.oliver.kw41.iTextPdf7;

import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import javax.net.ssl.StandardConstants;
import java.io.FileNotFoundException;

public class HelloPdf {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Hello, world!");

        String dest = "/Users/oliveroppitz/landscapeGradle.pdf";
        PdfWriter writer = new PdfWriter(dest);

        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);
        pdfDoc.setDefaultPageSize(PageSize.A4.rotate());
        // Creating a Document
        Document document = new Document(pdfDoc);


        String para1 = "Tutorials Point originated from the idea that there exists a class of readers who respond better to online content and prefer to learn new skills at their own pace from the comforts of their drawing rooms.";
        String para2 = "The journey commenced with a single tutorial on HTML in 2006 and elated by the response it generated, we worked our way to adding fresh tutorials to our repository which now proudly flaunts a wealth of tutorials and allied articles on topics ranging from programming languages to web designing to academics and much more.";
        Paragraph paragraph1 = new Paragraph(para1);
        Paragraph paragraph2 = new Paragraph(para2);
        document.add(paragraph1);
        document.add(paragraph2);
        document.add(new Paragraph("Built from gradle").setFontColor(ColorConstants.RED));

        document.close();
    }

}
