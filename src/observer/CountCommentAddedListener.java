package observer;

public class CountCommentAddedListener implements Observer {
	private int addedComments;

	@Override
	public void update(Comment comment) {
		addedComments++;
		System.out.println(
				"total ammount of comments: " + addedComments + "\n Last comment added by: " + comment.getAuthor());

	}

}
