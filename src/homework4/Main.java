package homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		File folder1 = new File("Files_A");
		File folder2 = new File("Files_B");

		File[] fileFolder1 = folder1.listFiles();
		for (File file : fileFolder1) {
			System.out.println("Files in a folder: " + file);
		}

		FileSorting myFileFilter = new FileSorting("bmp", "txt");
		File folder = new File("Files_A");
		File[] fileList = folder.listFiles(myFileFilter);
	
		for (File file : fileList) {
			System.out.println("Sorting files: " + file);
			try (FileInputStream inputStream = new FileInputStream(file);
					FileOutputStream outputStream = new FileOutputStream("Files_B" + "\\" + file.getName())) {
				byte[] buffer = new byte[inputStream.available()];
				int byteread;
				for (; (byteread = inputStream.read(buffer)) > 0;) {
					System.out.println(byteread);
					byteread = inputStream.read(buffer);
					outputStream.write(buffer, 0, byteread);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		File[] fileFolder2 = folder2.listFiles();
		for (File file : fileFolder2) {
			System.out.println("Files copied: " + file);
		}

	}
}
