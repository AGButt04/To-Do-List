
public class Task {
	
	private String name;
	private boolean status;
	private String priority;
	
	public Task(String n, String p) {
		name = n;
		priority = p;
		status = false;
	}

	public String getName() {
		return name;
	}
	
	public boolean isStatus() {
		return status;
	}

	public String getPriority() {
		return priority;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	public String toString() {
		String s = "This task: " + name + " has ";
		s += priority + " priority. Is it done yet: " + status + ".";
		return s;
	}

}
