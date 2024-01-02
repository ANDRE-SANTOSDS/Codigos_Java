package revisao2;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comment = new ArrayList<>();

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public ArrayList<Comment> getComment() {
		return comment;
	}

	public void setComment(ArrayList<Comment> comment) {
		this.comment = comment;
	}

	public void addComment(Comment comment) {
		this.comment.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comment.add(comment);
	}

	public void status() {
		System.out.println(" " + getTitle());
		System.out.println("" + getLikes() + " - " + getMoment());
		System.out.println("" + getContent());
		System.out.println("Comments: ");
		for (int i = 0; i < comment.size(); i++) {
			System.out.println("" + comment.get(i).getText());
		}
		System.out.println();
	}

}
