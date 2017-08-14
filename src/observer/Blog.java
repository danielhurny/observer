package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Blog {
	
	private List<Comment> comments= new ArrayList<>();
	private List<Observer> commentAddedObservers = new ArrayList<>();
	
	public void addComment(Comment comment) {
		comments.add(comment);
		this.notifyCommentAddedListeners(comment);
	}
	private void notifyCommentAddedListeners(Comment comment){
		commentAddedObservers.forEach(listener->listener.update(comment));
	}
	public void registerObserver(Observer observer) {
		this.commentAddedObservers.add(observer);
		
	}
	public void unregisterObserver(Observer observer) {
		commentAddedObservers.remove(observer);
	}

}
