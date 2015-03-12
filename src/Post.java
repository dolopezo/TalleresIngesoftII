import java.util.*;

public class Post {

    private String topic;
    private Date dateCreated;
    private Date lastUpdate;
    private boolean isAllowed;
    private List<File> files = new ArrayList<>();

	public void setTopic(String topic){
		this.topic = topic;
	}
	
	public String getTopic(){
		return topic;
	}
	
	public void setDateCreated(Date dateCreated){
		this.dateCreated = dateCreated;
	}
	
	public Date getDateCreatd(){
		return dateCreated;
	}
	
	public void setLastUpdated(Date lastUpdate){
		this.lastUpdate = lastUpdate;
	}
	
	public Date getLastUpdated(){
		return lastUpdate;
	}
	
	public void setIsAllowed(boolean isAllowed){
		this.isAllowed = isAllowed;
	}
	
	public boolean isIsAllowed(){
		return isAllowed;
	}
	
    public void comment(){ 
    	throw new UnsupportedOperationException("Método no implementado");
	}
	
    public void rate(String someRate){
    	throw new UnsupportedOperationException("Método no implementado");
    }
    
    public void share(){
     	throw new UnsupportedOperationException("Método no implementado");
    }
}