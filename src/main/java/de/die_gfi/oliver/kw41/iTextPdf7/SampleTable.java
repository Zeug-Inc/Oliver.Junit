package de.die_gfi.oliver.kw41.iTextPdf7;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class SampleTable {

    static Image imageSchnitzel = null;
    static Image imageSuppe = null;

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

       // String dest = "/Users/oliveroppitz/sampleTable.pdf";
        String dest = "./pdf/xyz3.pdf";
        PdfWriter writer = new PdfWriter(dest);

        ImageData imageData = ImageDataFactory.create("./src/main/resources/schnitzel1.jpeg");
        imageSchnitzel = new Image(imageData);
        imageSchnitzel.setWidth(150);

        ImageData imageDataSuppe = ImageDataFactory.create("./src/main/resources/Grießnockerlsuppe.jpeg");
        imageSuppe = new Image(imageDataSuppe);
        imageSuppe.setWidth(150);


        // Creating a PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);
        // pdfDoc.setDefaultPageSize(PageSize.A4.rotate());
        // Creating a Document
        Document document = new Document(pdfDoc);


        Table report = erzeugeReport();

        document.add(new Paragraph("Speiseplan KW41").setFontSize(30f));

        document.add(new Paragraph("11.10.-15.10.2021").setFontSize(20f));

        document.add(report);

        document.close();

    }

    private static Table erzeugeReport() {

        Table report = new Table(3);

        report.addCell(new Paragraph("Montag"));
        report.addCell(createCell("Grießnockerlsuppe", 4.50, imageSuppe));
        report.addCell(createCell("Wiener Schnitzel", 9.50, imageSchnitzel));


        report.addCell(new Paragraph("Dienstag"));
        report.addCell(createCell("Grießnockerlsuppe", 4.50, imageSuppe));
        report.addCell(createCell("Wiener Schnitzel", 9.50, imageSchnitzel));


        report.addCell(new Paragraph("Mittwoch"));
        report.addCell(createCell("Grießnockerlsuppe", 4.50, imageSuppe));
        report.addCell(createCell("Wiener Schnitzel", 9.50, imageSchnitzel));


        report.addCell(new Paragraph("Donnerstag"));
        report.addCell(createCell("Grießnockerlsuppe", 4.50, imageSuppe));
        report.addCell(createCell("Wiener Schnitzel", 9.50, imageSchnitzel));

        report.addCell(new Paragraph("Freitag"));
        report.addCell(createCell("Grießnockerlsuppe", 4.50, imageSuppe));
        report.addCell(createCell("Wiener Schnitzel", 9.50, imageSchnitzel));
        return report;
    }

    /**
     * Erzeuge eine Zelle für die Tabelle mit dem Standarbild
     *
     * @param speise Name der Speise
     * @param preis  Preis
     * @return die erzeugte Zelle
     */
    public static Cell createCell(String speise, double preis, Image image) {

        Cell cell = new Cell();
        cell.add(new Paragraph(" "));
        cell.add(image);
        cell.add(new Paragraph(" "));
        cell.add(new Paragraph(speise + " - Euro " + preis));
        cell.add(new Paragraph(" "));
        return cell;

    }
}
