package memo;

public class note {
	String subject;
	String content;
	
	public note(String note) {
		this.subject = note;
	}
	public note() {	
	}
		
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
