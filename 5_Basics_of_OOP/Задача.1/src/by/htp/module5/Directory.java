package by.htp.module5;

import java.util.ArrayList;
import java.util.List;

public class Directory {

	private String title;
	private List<Directory> directoryList;
	private List<File> fileList;

	{
		title = "new_directory";
		directoryList = new ArrayList<Directory>();
		fileList = new ArrayList<File>();
	}

	public Directory() {
	}

	public Directory(String title) {
	       
		this.title = title;		
	}

	public void addDirectory(Directory directory) {
		
		directoryList.add(directory);
	}

	public void addFile(File file) {
				
		fileList.add(file);
		}

	public void removeDirectory(String title) {
		for (Directory directory : directoryList) {
			if (directory.getTitle() == title) {
				directoryList.remove(directory);
				break;
			}
		}
	}

	public void removeFile(String title) {
		for (File file : fileList) {
			if (file.getTitle() == title) {
				fileList.remove(file);
				break;
			}
		}
	}
	
	public void rename(String newTitle) {
		setTitle(newTitle);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Directory> getDirectoryList() {
		return directoryList;
	}

	public void setDirectoryList(List<Directory> directoryList) {
		this.directoryList = directoryList;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directoryList == null) ? 0 : directoryList.hashCode());
		result = prime * result + ((fileList == null) ? 0 : fileList.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (directoryList == null) {
			if (other.directoryList != null)
				return false;
		} else if (!directoryList.equals(other.directoryList))
			return false;
		if (fileList == null) {
			if (other.fileList != null)
				return false;
		} else if (!fileList.equals(other.fileList))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Directory [title=" + title + ", directoryList=" + directoryList + ", fileList=" + fileList + "]";
	}

}
