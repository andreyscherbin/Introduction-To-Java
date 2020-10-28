package by.htp.module5;

public class View {

	public void printDirectory(Directory directory) {
	
		System.out.println("Directory's name: " + directory.getTitle());
		System.out.print("The list of inner directories: ");
		for (Directory innerDirectory : directory.getDirectoryList()) {
			System.out.print(innerDirectory.getTitle() + ", ");
		}
		
		System.out.print("\nThe list of inner fils: ");
		for (File innerFile : directory.getFileList()) {
			System.out.print(innerFile.getTitle() + ", ");
		}		
	}
}
