
public class Launcher extends NoteStore {

	public static void main(String[] args) {
		
		TextNote myNotes1 = new TextNote();
		TextNote myNotes2 = new TextNote();
		TextAndImageNote myNotes3 = new TextAndImageNote();
		TextAndImageNote myNotes4 = new TextAndImageNote();
		StoreNote(myNotes1, "Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems");
		StoreNote(myNotes2, "Few books to read - Ikigaii, How to win friends and influence people");
		getAllTextNotes();
		StoreNote(myNotes3, "The shopping list on my fridge,", "//foo/bar1/bar2/imgset.jpg");
		StoreNote(myNotes4, "The size label of Jack's shirt,", "/foo/bar1/bar2/imgset2.jpg");
		getAllTextAndImageNotes();

	}

}
