class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {
            String currentSentence = sentences[i];
            int spaceCount = 0;

            for (int j = 0; j < currentSentence.length(); j++) {
                char currentLetter = currentSentence.charAt(j);
                if (currentLetter == ' ') {
                    spaceCount = spaceCount + 1;
                }
            }

            int totalWordsInThisSentence = spaceCount + 1;

            if (totalWordsInThisSentence > maxWords) {
                maxWords = totalWordsInThisSentence;
            }
        }

        return maxWords;
    }
}
