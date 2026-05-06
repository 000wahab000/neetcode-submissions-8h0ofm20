class Solution {
    public int characterReplacement(String s, int k) {
    int left = 0;
int maxFreq = 0;
int result = 0;
HashMap<Character, Integer> count = new HashMap<>();
for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);
    count.put(c, count.getOrDefault(c, 0) + 1);
    maxFreq = Math.max(maxFreq, count.get(c));
    while ((right - left + 1) - maxFreq > k) {
        char leftChar = s.charAt(left);
        count.put(leftChar, count.get(leftChar) - 1);
        left++;
    }
    result = Math.max(result, right - left + 1);
}
return result;
    }
}
     //ok so basically we do a window obv but we stop at diff one and the calculate tha
     //lenght and once we do if its in k range we implement i sooooo how?
     //am thinking firstly left and right is good but

     //we find the most repeating charater tyoe shit


     //now we use it to scan how???
     //if s.charAt(i) = repeat we right++ if not right =0 and prev left and prev right
     //left =i count+ if count == k return right - left + count + prev right - prev left
    