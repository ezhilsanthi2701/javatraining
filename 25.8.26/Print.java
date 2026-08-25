package printerTask;

public class Print {
int id;
String taskName;
public Print(int id, String taskName) {
	super();
	this.id = id;
	this.taskName = taskName;
}
@Override
public String toString() {
	return "Print [id=" + id + ", taskName=" + taskName + ", getId()=" + getId() + ", getTaskName()=" + getTaskName()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTaskName() {
	return taskName;
}
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
}
