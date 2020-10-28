package by.htp.module5;

public class Main {

     /*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести
    на консоль содержимое, дополнить, удалить.
     */
	public static void main(String[] str) {
		
		Directory myDocument;
		View view;
		
		myDocument = new Directory("Мои докуметы");
		view = new View();
		
		myDocument.addDirectory(new Directory("lab11"));
		myDocument.addDirectory(new Directory("lab22"));
		myDocument.addFile(new TextFile("haha.jpg"));
		myDocument.addFile(new TextFile("smile.jpg"));
		myDocument.addFile(new TextFile("epam.jpg"));
		
		myDocument.rename("lab11");
		myDocument.removeFile("haha.jpg");
		myDocument.removeDirectory("smile.jpg");		
		
	        view.printDirectory(myDocument);
	        			
		}	
}
