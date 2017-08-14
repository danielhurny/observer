package observer;

public class MainObserver {

	public static void main(String[] args) {
		
		Observer commentAdded1 = new CommentAddedListener();
		Observer countComment1 = new CountCommentAddedListener();
		
		Blog blog = new Blog();
		
		blog.registerObserver(commentAdded1);
		blog.registerObserver(countComment1);
		
		Comment comment1 = new Comment("Daniel", "first comment ever");
		
		blog.addComment(comment1);
		
		Comment comment2 = new Comment("Agent_X", "Well done");
		blog.addComment(comment2);
		
		

	}

}
