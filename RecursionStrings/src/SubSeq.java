import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");

        System.out.println(subSeqList("", "xyz"));

        subSeqAscii("", "ab");

        System.out.println(subSeqAsciiRet("", "abc"));
    }
    static void subseq(String processed, String unprocessed){

        //base case: whenever unprocessed becomes empty, print processed
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);

        subseq(processed + ch, unprocessed.substring(1)); //either take it
        subseq(processed, unprocessed.substring(1)); //or ignore it
    }

    static ArrayList<String> subSeqList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1)); //take char
        subSeqAscii(p + (ch+0), up.substring(1)); //take ascii //or you could do (int)(ch)
        subSeqAscii(p, up.substring(1)); //ignore char
    }

    static ArrayList<String> subSeqAsciiRet(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p + (ch+0), up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p, up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
