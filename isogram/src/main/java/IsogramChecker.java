class IsogramChecker {

    boolean isIsogram(String phrase) {
      boolean result = true;
      phrase = phrase.toLowerCase();
      char[] p = phrase.toCharArray();
      System.out.println(phrase);
      if (phrase.length() > 0) {
        for (int i = 0; i < phrase.length(); i++) {
          if (Character.isLetter(p[i])) {
            final char c = p[i];
            if (phrase.chars().filter(ch -> ch == c).count() > 1) {
              result = false;
              break;
            }
          }
        }
      }
      if (!result) {
        return false;
      }
      return true;
    }

}
