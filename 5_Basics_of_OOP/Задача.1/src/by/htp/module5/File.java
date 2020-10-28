package by.htp.module5;

public class File implements Serializable  {

        private static final long serialVersionUID = 2L;
        
	private String title;
	
	public File() {
	}

	public File(String title) {
	
		this.title = title;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		File other = (File) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
			
	}

	@Override
	public String toString() {
		return "File [title=" + title + "]";
	}

}
