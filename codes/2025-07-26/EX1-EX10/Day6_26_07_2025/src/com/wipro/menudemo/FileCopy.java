package com.wipro.menudemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
	public static void main(String[] args) {
        String sourceFilePath = "D:\\FileInput.jpg";
        String destinationFilePath = "D:\\destination_image_copy.jpg";

        try (FileInputStream fis = new FileInputStream(sourceFilePath);
             FileOutputStream fos = new FileOutputStream(destinationFilePath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Done");

        } catch (IOException e) {
            System.err.println("An I/O error ");
        }
    }

}
