package observer;

import java.util.Observable;


public class CommentAddedListener implements Observer {

	@Override
	public void update(Comment comment) {
		System.out.println("Updated comment: "+ comment.getComment());
		
	}

	

}
