// Replace Words.
// https://leetcode.com/problems/replace-words/

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder ans = new StringBuilder();
        String[] str = sentence.split(" ");
        HashSet<String> hs = new HashSet<>();
        for(String x : dictionary){
            hs.add(x);
        }
        for(String st : str){
            String word = "";
            for(int i = 1; i<=st.length(); i++){
                word = st.substring(0,i);
                if(hs.contains(word)) break;
            }
             ans.append(" " + word);
        }
        return ans.deleteCharAt(0).toString();
    }
}
