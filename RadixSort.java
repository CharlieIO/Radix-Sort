import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RadixSort{
    private static MyQueue blank = new MyQueue();
    private static MyQueue a = new MyQueue();
    private static MyQueue b = new MyQueue();
    private static MyQueue c = new MyQueue();
    private static MyQueue d = new MyQueue();
    private static MyQueue e = new MyQueue();
    private static MyQueue f = new MyQueue();
    private static MyQueue g = new MyQueue();
    private static MyQueue h = new MyQueue();
    private static MyQueue i = new MyQueue();
    private static MyQueue j = new MyQueue();
    private static MyQueue k = new MyQueue();
    private static MyQueue l = new MyQueue();
    private static MyQueue m = new MyQueue();
    private static MyQueue n = new MyQueue();
    private static MyQueue o = new MyQueue();
    private static MyQueue p = new MyQueue();
    private static MyQueue q = new MyQueue();
    private static MyQueue r = new MyQueue();
    private static MyQueue s = new MyQueue();
    private static MyQueue t = new MyQueue();
    private static MyQueue u = new MyQueue();
    private static MyQueue v = new MyQueue();
    private static MyQueue w = new MyQueue();
    private static MyQueue x = new MyQueue();
    private static MyQueue y = new MyQueue();
    private static MyQueue z = new MyQueue();
    
    private static ArrayList<String> words = new ArrayList<String>();
    private static int pos = 11;
    
    public static void buildArray(String input){
        try{
            Scanner sc = new Scanner(new File(input));
            while (sc.hasNextLine()){
                words.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
    
    public static void sort(){
        while (pos >= 0){
            for(String word : words){
                if (word.length() <= pos) blank.add(word);
                else if (word.charAt(pos) == 'a') a.add(word);
                else if (word.charAt(pos) == 'b') b.add(word);
                else if (word.charAt(pos) == 'c') c.add(word);
                else if (word.charAt(pos) == 'd') d.add(word);
                else if (word.charAt(pos) == 'e') e.add(word);
                else if (word.charAt(pos) == 'f') f.add(word);
                else if (word.charAt(pos) == 'g') g.add(word);
                else if (word.charAt(pos) == 'h') h.add(word);
                else if (word.charAt(pos) == 'i') i.add(word);
                else if (word.charAt(pos) == 'j') j.add(word);
                else if (word.charAt(pos) == 'k') k.add(word);
                else if (word.charAt(pos) == 'l') l.add(word);
                else if (word.charAt(pos) == 'm') m.add(word);
                else if (word.charAt(pos) == 'n') n.add(word);
                else if (word.charAt(pos) == 'o') o.add(word);
                else if (word.charAt(pos) == 'p') p.add(word);
                else if (word.charAt(pos) == 'q') q.add(word);
                else if (word.charAt(pos) == 'r') r.add(word);
                else if (word.charAt(pos) == 's') s.add(word);
                else if (word.charAt(pos) == 't') t.add(word);
                else if (word.charAt(pos) == 'u') u.add(word);
                else if (word.charAt(pos) == 'v') v.add(word);
                else if (word.charAt(pos) == 'w') w.add(word);
                else if (word.charAt(pos) == 'x') x.add(word);
                else if (word.charAt(pos) == 'y') y.add(word);
                else if (word.charAt(pos) == 'z') z.add(word);
            }
        words.clear();
        while (blank.total > 0) words.add(blank.remove());
        while (a.total > 0) words.add(a.remove());
        while (b.total > 0) words.add(b.remove());
        while (c.total > 0) words.add(c.remove());
        while (d.total > 0) words.add(d.remove());
        while (e.total > 0) words.add(e.remove());
        while (f.total > 0) words.add(f.remove());
        while (g.total > 0) words.add(g.remove());
        while (h.total > 0) words.add(h.remove());
        while (i.total > 0) words.add(i.remove());
        while (j.total > 0) words.add(j.remove());
        while (k.total > 0) words.add(k.remove());
        while (l.total > 0) words.add(l.remove());
        while (m.total > 0) words.add(m.remove());
        while (n.total > 0) words.add(n.remove());
        while (o.total > 0) words.add(o.remove());
        while (p.total > 0) words.add(p.remove());
        while (q.total > 0) words.add(q.remove());
        while (r.total > 0) words.add(r.remove());
        while (s.total > 0) words.add(s.remove());
        while (t.total > 0) words.add(t.remove());
        while (u.total > 0) words.add(u.remove());
        while (v.total > 0) words.add(v.remove());
        while (w.total > 0) words.add(w.remove());
        while (x.total > 0) words.add(x.remove());
        while (y.total > 0) words.add(y.remove());
        while (z.total > 0) words.add(z.remove());
        pos--;
        }
    }
    
    public static void writeFile(String target){
        try{
        PrintStream ps = new PrintStream(new File(target));
        for(String word : words){
            ps.println(word);
        }
        ps.close();
        System.out.println("Sorted!");
        } catch (FileNotFoundException e){
            System.out.println("Failed: File Not Found Exception");
        };
    }
    
    public static void main(String[] args){
        buildArray(args[0]);
        sort();
        writeFile(args[1]);
    }
}
