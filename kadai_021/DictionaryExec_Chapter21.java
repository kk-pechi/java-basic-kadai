package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {

	Dictionary_Chapter21 fruitMap = new Dictionary_Chapter21();
	
	String[] searchWords = { "apple", "banana", "grape", "orange" };
	
	for (String word : searchWords) {
		fruitMap.search(word);
		}	
	}
}

