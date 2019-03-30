import java.io.*;
import java.util.*;

public class BTSUniqueLines {
	public static void main(String [] args)throws IOException {
		System.out.println("****By Unique Lines****");
		Map<Integer, ArrayList<String>> imFineDist= calcUniqLinesDistOrder("I'm Fine", "I'mFine.txt");
		printOrder("I'm Fine", imFineDist, 1);
		Map<Integer, ArrayList<String>> idolDist = calcUniqLinesDistOrder("IDOL", "IDOL.txt");
		printOrder("IDOL", idolDist, 1);
		Map<Integer, ArrayList<String>> tUDist = calcUniqLinesDistOrder("Truth Untold", "TruthUntold.txt");
		printOrder("Truth Untold", tUDist, 1);
		Map<Integer, ArrayList<String>> loveMazeDist = calcUniqLinesDistOrder("Love Maze", "LoveMaze.txt");
		printOrder("Love Maze", loveMazeDist, 1);
		Map<Integer, ArrayList<String>> plutoDist = calcUniqLinesDistOrder("134340", "Pluto.txt");
		printOrder("134340", plutoDist, 1);
		Map<Integer, ArrayList<String>> jumpDist = calcUniqLinesDistOrder("Jump", "Jump.txt");
		printOrder("Jump", jumpDist, 1);
		Map<Integer, ArrayList<String>> maCityDist = calcUniqLinesDistOrder("Ma City", "MaCity.txt");
		printOrder("Ma City", maCityDist, 1);
		Map<Integer, ArrayList<String>> dimpleDist = calcUniqLinesDistOrder("Dimple", "Dimple.txt");
		printOrder("Dimple", dimpleDist, 1);
		System.out.println("****By Unique Words****");
		Map<Integer, ArrayList<String>> imFineDistTwo= calcUniqWordsDistOrder("I'm Fine", "I'mFine.txt");
		printOrder("I'm Fine", imFineDistTwo, 2);
		Map<Integer, ArrayList<String>> idolDistTwo = calcUniqWordsDistOrder("IDOL", "IDOL.txt");
		printOrder("IDOL", idolDistTwo, 2);
		Map<Integer, ArrayList<String>> tUDistTwo = calcUniqWordsDistOrder("Truth Untold", "TruthUntold.txt");
		printOrder("Truth Untold", tUDistTwo, 2);
		Map<Integer, ArrayList<String>> loveMazeDistTwo = calcUniqWordsDistOrder("Love Maze", "LoveMaze.txt");
		printOrder("Love Maze", loveMazeDistTwo, 2);
		Map<Integer, ArrayList<String>> plutoDistTwo = calcUniqWordsDistOrder("134340", "Pluto.txt");
		printOrder("134340", plutoDistTwo, 2);
		Map<Integer, ArrayList<String>> jumpDistTwo = calcUniqWordsDistOrder("Jump", "Jump.txt");
		printOrder("Jump", jumpDistTwo, 2);
		Map<Integer, ArrayList<String>> maCityDistTwo = calcUniqWordsDistOrder("Ma City", "MaCity.txt");
		printOrder("Ma City", maCityDistTwo, 2);
		Map<Integer, ArrayList<String>> dimpleDistTwo = calcUniqWordsDistOrder("Dimple", "Dimple.txt");
		printOrder("Dimple", dimpleDistTwo, 2);
		System.out.println("****By Words Based on Unique Lines****");
		Map<Integer, ArrayList<String>> imFineDistThree= calcUniqWordLineDistOrder("I'm Fine", "I'mFine.txt");
		printOrder("I'm Fine", imFineDistThree, 3);
		Map<Integer, ArrayList<String>> idolDistThree = calcUniqWordLineDistOrder("IDOL", "IDOL.txt");
		printOrder("IDOL", idolDistThree, 3);
		Map<Integer, ArrayList<String>> tUDistThree = calcUniqWordLineDistOrder("Truth Untold", "TruthUntold.txt");
		printOrder("Truth Untold", tUDistThree, 3);
		Map<Integer, ArrayList<String>> loveMazeDistThree = calcUniqWordLineDistOrder("Love Maze", "LoveMaze.txt");
		printOrder("Love Maze", loveMazeDistThree, 3);
		Map<Integer, ArrayList<String>> plutoDistThree = calcUniqWordLineDistOrder("134340", "Pluto.txt");
		printOrder("134340", plutoDistThree, 3);
		Map<Integer, ArrayList<String>> jumpDistThree = calcUniqWordLineDistOrder("Jump", "Jump.txt");
		printOrder("Jump", jumpDistThree, 3);
		Map<Integer, ArrayList<String>> maCityDistThree = calcUniqWordLineDistOrder("Ma City", "MaCity.txt");
		printOrder("Ma City", maCityDistThree, 3);
		Map<Integer, ArrayList<String>> dimpleDistThree = calcUniqWordLineDistOrder("Dimple", "Dimple.txt");
		printOrder("Dimple", dimpleDistThree, 3);
	}
	public static void printOrder(String songName, Map<Integer, ArrayList<String>> songDist, int option) {
		System.out.println("***"+songName+"***");
		if(option == 1) {
			System.out.println("***By unique lines***");
		}
		else if(option == 2) {
			System.out.println("***By unique words***");
		}
		else {
			System.out.println("***By words based on unique lines***");
		}
		int k = 0;
		for(Integer i: songDist.keySet()) {
			ArrayList<String> names = songDist.get(i);
			k += names.size();
		}
		int h = 0;
		for(Integer i: songDist.keySet()) {
			ArrayList<String> names = songDist.get(i);
			if(names.size() > 1 && h == (songDist.size() - 1)) {
				k = 1;
			}
			System.out.print(k+") ");
			for(int m = 0; m < names.size(); m++) {
				System.out.print(names.get(m));
				if(m < names.size() - 1)
					System.out.print(", ");
			}
			System.out.println(": "+i);
			k -= names.size();
			h++;
		}
		System.out.println();
	}
	public static int[] calcUniqLinesDist(String inputFile)throws IOException {
		int count[] = new int[7];
		Scanner scan = new Scanner(new File(inputFile));
		ArrayList<String> current = new ArrayList<String>();
		int jungkook = 0;
		ArrayList<String> jungkookLines = new ArrayList<String>();
		int v = 0;
		ArrayList<String> vLines = new ArrayList<String>();
		int jimin = 0;
		ArrayList<String> jiminLines = new ArrayList<String>();
		int rm = 0;
		ArrayList<String> rmLines = new ArrayList<String>();
		int jhope = 0;
		ArrayList<String> jhopeLines = new ArrayList<String>();
		int suga = 0;
		ArrayList<String> sugaLines = new ArrayList<String>();
		int jin = 0;
		ArrayList<String> jinLines = new ArrayList<String>();
		boolean collectLines = false;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && collectLines) {
				 	current.clear();
				 	current.add(line);
				 	collectLines = false;
				 }
			else if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && !collectLines) {
				 	current.add(line);
				 }
			else {
				collectLines = true;
				if(current.contains("Jungkook")) {
					if(!jungkookLines.contains(line)) {
						jungkookLines.add(line);
						jungkook++;
					}
				}
				if(current.contains("V")) {
					if(!vLines.contains(line)) {
						vLines.add(line);
						v++;
					}
				}
				if(current.contains("Jimin")) {
					if(!jiminLines.contains(line)) {
						jiminLines.add(line);
						jimin++;
					}
				}
				if(current.contains("RM")) {
					if(!rmLines.contains(line)) {
						rmLines.add(line);
						rm++;
					}
				}
				if(current.contains("JHope")) {
					if(!jhopeLines.contains(line)) {
						jhopeLines.add(line);
						jhope++;
					}
				}
				if(current.contains("Suga")) {
					if(!sugaLines.contains(line)) {
						sugaLines.add(line);
						suga++;
					}
				}
				if(current.contains("Jin")) {
					if(!jinLines.contains(line)) {
						jinLines.add(line);
						jin++;
					}
				}
				if(current.contains("BTS")) {
					if(!jinLines.contains(line)) {
						jinLines.add(line);
						jin++;
					}
					if(!sugaLines.contains(line)) {
						sugaLines.add(line);
						suga++;
					}
					if(!jhopeLines.contains(line)) {
						jhopeLines.add(line);
						jhope++;
					}
					if(!rmLines.contains(line)) {
						rmLines.add(line);
						rm++;
					}
					if(!jiminLines.contains(line)) {
						jiminLines.add(line);
						jimin++;
					}
					if(!vLines.contains(line)) {
						vLines.add(line);
						v++;
					}
					if(!jungkookLines.contains(line)) {
						jungkookLines.add(line);
						jungkook++;
					}
				}
			}
		}
		count[0] = jungkook;
		count[1] = v;
		count[2] = jimin;
		count[3] = rm;
		count[4] = jhope;
		count[5] = suga;
		count[6] = jin;
		return count;
	}
	public static int[] calcUniqWordsDist(String inputFile)throws IOException {
		int count[] = new int[7];
		Scanner scan = new Scanner(new File(inputFile));
		ArrayList<String> current = new ArrayList<String>();
		Set<String> jungkookWords = new HashSet<String>();
		Set<String> vWords = new HashSet<String>();
		Set<String> jiminWords = new HashSet<String>();
		Set<String> rmWords = new HashSet<String>();
		Set<String> jhopeWords = new HashSet<String>();
		Set<String> sugaWords = new HashSet<String>();
		Set<String> jinWords = new HashSet<String>();
		boolean collectLines = false;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && collectLines) {
				 	current.clear();
				 	current.add(line);
				 	collectLines = false;
				 }
			else if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && !collectLines) {
				 	current.add(line);
				 }
			else {
				collectLines = true;
				String[] words = line.split(" ");
				if(current.contains("Jungkook")) {
					addWords(jungkookWords, words);
				}
				if(current.contains("V")) {
					addWords(vWords, words);
				}
				if(current.contains("Jimin")) {
					addWords(jiminWords, words);
				}
				if(current.contains("RM")) {
					addWords(rmWords, words);
				}
				if(current.contains("JHope")) {
					addWords(jhopeWords, words);
				}
				if(current.contains("Suga")) {
					addWords(sugaWords, words);
				}
				if(current.contains("Jin")) {
					addWords(jinWords, words);
				}
				if(current.contains("BTS")) {
					addWords(jinWords, words);
					addWords(sugaWords, words);
					addWords(jhopeWords, words);
					addWords(rmWords, words);
					addWords(jiminWords, words);
					addWords(vWords, words);
					addWords(jungkookWords, words);
				}
			}
		}
		count[0] = jungkookWords.size();
		count[1] = vWords.size();
		count[2] = jiminWords.size();
		count[3] = rmWords.size();
		count[4] = jhopeWords.size();
		count[5] = sugaWords.size();
		count[6] = jinWords.size();
		return count;
	}
	private static void addWords(Set<String> memberSet, String[] words) {
		for(int i = 0; i < words.length; i++) {
			memberSet.add(words[i]);
		}
	}
	public static int[] calcUniqWordLineDist(String inputFile)throws IOException {
		int count[] = new int[7];
		Scanner scan = new Scanner(new File(inputFile));
		ArrayList<String> current = new ArrayList<String>();
		int jungkook = 0;
		ArrayList<String> jungkookLines = new ArrayList<String>();
		int v = 0;
		ArrayList<String> vLines = new ArrayList<String>();
		int jimin = 0;
		ArrayList<String> jiminLines = new ArrayList<String>();
		int rm = 0;
		ArrayList<String> rmLines = new ArrayList<String>();
		int jhope = 0;
		ArrayList<String> jhopeLines = new ArrayList<String>();
		int suga = 0;
		ArrayList<String> sugaLines = new ArrayList<String>();
		int jin = 0;
		ArrayList<String> jinLines = new ArrayList<String>();
		boolean collectLines = false;
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && collectLines) {
				 	current.clear();
				 	current.add(line);
				 	collectLines = false;
				 }
			else if((line.equals("Jungkook") || line.equals("V") || line.equals("Jimin") || line.equals("RM")
				|| line.equals("JHope") || line.equals("Suga") || line.equals("Jin") || line.equals("BTS"))
				 && !collectLines) {
				 	current.add(line);
				 }
			else {
				collectLines = true;
				String[] words = line.split(" ");
				if(current.contains("Jungkook")) {
					if(!jungkookLines.contains(line)) {
						jungkookLines.add(line);
						jungkook += words.length;
					}
				}
				if(current.contains("V")) {
					if(!vLines.contains(line)) {
						vLines.add(line);
						v += words.length;
					}
				}
				if(current.contains("Jimin")) {
					if(!jiminLines.contains(line)) {
						jiminLines.add(line);
						jimin += words.length;
					}
				}
				if(current.contains("RM")) {
					if(!rmLines.contains(line)) {
						rmLines.add(line);
						rm += words.length;
					}
				}
				if(current.contains("JHope")) {
					if(!jhopeLines.contains(line)) {
						jhopeLines.add(line);
						jhope += words.length;
					}
				}
				if(current.contains("Suga")) {
					if(!sugaLines.contains(line)) {
						sugaLines.add(line);
						suga += words.length;
					}
				}
				if(current.contains("Jin")) {
					if(!jinLines.contains(line)) {
						jinLines.add(line);
						jin += words.length;
					}
				}
				if(current.contains("BTS")) {
					if(!jinLines.contains(line)) {
						jinLines.add(line);
						jin += words.length;
					}
					if(!sugaLines.contains(line)) {
						sugaLines.add(line);
						suga += words.length;
					}
					if(!jhopeLines.contains(line)) {
						jhopeLines.add(line);
						jhope += words.length;
					}
					if(!rmLines.contains(line)) {
						rmLines.add(line);
						rm += words.length;
					}
					if(!jiminLines.contains(line)) {
						jiminLines.add(line);
						jimin += words.length;
					}
					if(!vLines.contains(line)) {
						vLines.add(line);
						v += words.length;
					}
					if(!jungkookLines.contains(line)) {
						jungkookLines.add(line);
						jungkook += words.length;
					}
				}
			}
		}
		count[0] = jungkook;
		count[1] = v;
		count[2] = jimin;
		count[3] = rm;
		count[4] = jhope;
		count[5] = suga;
		count[6] = jin;
		return count;
	}
	public static Map<Integer, ArrayList<String>> calcUniqLinesDistOrder(String song, String inputFile)throws IOException {
		Map<Integer, ArrayList<String>> songTotals = new TreeMap<Integer, ArrayList<String>>();
		int[] count = calcUniqLinesDist(inputFile);
		String[] names = {"Jungkook", "V", "Jimin", "RM", "JHope", "Suga", "Jin"};
		for(int i = 0; i < count.length; i++) {
			int num = count[i];
			String name = names[i];
			if(num > 0) {
				if(songTotals.get(num) == null) {
					ArrayList<String> namesList = new ArrayList<String>();
					namesList.add(name);
					songTotals.put(num, namesList);
				}
				else {
					ArrayList<String> namesList = songTotals.get(num);
					namesList.add(name);
					songTotals.put(num, namesList);
				}
			}

		}
		return songTotals;
	}
	public static Map<Integer, ArrayList<String>> calcUniqWordLineDistOrder(String song, String inputFile)throws IOException {
		Map<Integer, ArrayList<String>> songTotals = new TreeMap<Integer, ArrayList<String>>();
		int[] count = calcUniqWordLineDist(inputFile);
		String[] names = {"Jungkook", "V", "Jimin", "RM", "JHope", "Suga", "Jin"};
		for(int i = 0; i < count.length; i++) {
			int num = count[i];
			String name = names[i];
			if(num > 0) {
				if(songTotals.get(num) == null) {
					ArrayList<String> namesList = new ArrayList<String>();
					namesList.add(name);
					songTotals.put(num, namesList);
				}
				else {
					ArrayList<String> namesList = songTotals.get(num);
					namesList.add(name);
					songTotals.put(num, namesList);
				}
			}

		}
		return songTotals;
	}
	public static Map<Integer, ArrayList<String>> calcUniqWordsDistOrder(String song, String inputFile)throws IOException {
		Map<Integer, ArrayList<String>> songTotals = new TreeMap<Integer, ArrayList<String>>();
		int[] count = calcUniqWordsDist(inputFile);
		String[] names = {"Jungkook", "V", "Jimin", "RM", "JHope", "Suga", "Jin"};
		for(int i = 0; i < count.length; i++) {
			int num = count[i];
			String name = names[i];
			if(num > 0) {
				if(songTotals.get(num) == null) {
					ArrayList<String> namesList = new ArrayList<String>();
					namesList.add(name);
					songTotals.put(num, namesList);
				}
				else {
					ArrayList<String> namesList = songTotals.get(num);
					namesList.add(name);
					songTotals.put(num, namesList);
				}
			}

		}
		return songTotals;
	}
}