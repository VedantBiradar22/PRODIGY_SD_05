import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class ProductScraper {

    public static void main(String[] args) {
        String url = "https://example.com/products-page"; // Replace with the e-commerce page URL

        try {
            // Fetch and parse the HTML document
            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0").get();

            // Replace these selectors based on the website's HTML structure
            Elements productNames = doc.select(".product-name-selector");
            Elements productPrices = doc.select(".product-price-selector");
            Elements productRatings = doc.select(".product-rating-selector");

            // Open a CSV file to write the data
            FileWriter csvWriter = new FileWriter("products.csv");
            csvWriter.append("Name,Price,Rating\n");

            // Iterate through the products and write to CSV
            for (int i = 0; i < productNames.size(); i++) {
                String name = productNames.get(i).text();
                String price = productPrices.size() > i ? productPrices.get(i).text() : "N/A";
                String rating = productRatings.size() > i ? productRatings.get(i).text() : "N/A";

                csvWriter.append(String.format("%s,%s,%s\n", name, price, rating));
            }

            csvWriter.flush();
            csvWriter.close();

            System.out.println("Product data has been saved to products.csv");

        } catch (IOException e) {
            System.err.println("An error occurred while scraping the website: " + e.getMessage());
        }
    }
}
