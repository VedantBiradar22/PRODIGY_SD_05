# PRODIGY_SD_05 - E-commerce Product Scraper

## Description
This Java program extracts product information (names, prices, and ratings) from an e-commerce website using the JSoup library. The data is saved in a structured CSV format.

## Features
- Extracts product names, prices, and ratings.
- Saves the data into a CSV file for further analysis.

## How to Run
1. Add the JSoup library to your project:
   - For Maven: Use the dependency in the `pom.xml`.
   - Alternatively, download the JAR from [jsoup.org](https://jsoup.org/).
2. Replace the URL and CSS selectors in the code with the e-commerce site's details.
3. Compile and run the program:
   ```bash
   javac -cp .:jsoup-1.15.3.jar ProductScraper.java
   java -cp .:jsoup-1.15.3.jar ProductScraper
# PRODIGY_SD_05
Java program to scrape product data from an e-commerce website and save it in a CSV file as part of the Prodigy InfoTech internship task."
