
public class NoteStore {
	
	public static int textnoteCount=0;
	public static int textimagenoteCount=0;
	static TextNote[] textnotesArray = new TextNote[40]; //just for example's sake, we can store 40 notes
	static TextAndImageNote[] textimagenotesArray = new TextAndImageNote[40];
	
	public static void StoreNote(TextNote note, String message) {
		
		note.textnote = message;
		textnotesArray[textnoteCount] = note;
		textnoteCount++;
		System.out.println("Note "+ textnoteCount + " has been stored");
		
	}  //each time a record is added to the notes array, the next time StoreNote is called it will go to the next element
	
	public static void StoreNote(TextAndImageNote note, String message, String imageurl) {  //same StoreNote function, but for overloaded for TextAndImageNote class
		
		note.imagenote = message;
		note.imageurl = imageurl;
		textimagenotesArray[textimagenoteCount] = note;
		textimagenoteCount++;
		System.out.println("Image note "+ textnoteCount + " has been stored");
	}
	
	public static void getAllTextNotes() {
		
		for (int i = 0; i<textnotesArray.length-1; i++) {
		if (textnotesArray[i]!=null) {
		System.out.println(textnotesArray[i].textnote);
		System.out.println("----------------");
		}
		}
	} //prints the array until null is reached
	
	public static void getAllTextAndImageNotes() {
		
		for (int i = 0; i<textimagenotesArray.length-1; i++) {
			if (textimagenotesArray[i]!=null) {
			System.out.println("Note: "+ textimagenotesArray[i].imagenote);
			System.out.println("Image URL: "+ textimagenotesArray[i].imageurl);
			System.out.println("----------------");
			}
			}
	}

}
