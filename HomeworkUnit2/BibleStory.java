    //John Aston Adams
    //10/16/22

    package HomeworkUnit2;

    public class BibleStory {
        private String title, character1,character2, action1, action2, reference;
        private int time;

        public BibleStory(String t, String ch1, String ch2, String a1, String a2, String ref, int era) {
            title = t;
            character1 = ch1;
            character2= ch2;
            action1 = a1;
            action2 = a2;
            reference = ref;
            time = era;
        }

        @Override
        public String toString() {
            return "This is the story of " + title + ". Found in " + reference + ", in " + time + " BC, God had commanded " + character1 + " not to " + action1 + " However, he was temped by " + character2 + " and ended up " + action2;
        } 

        public static void main(String[] args) {
            BibleStory AdamandEve = new BibleStory("Adam & Eve", "Adam", "Eve", "eat from the tree of knowledge of good and evil.", "eating from the tree of knowledge of good and evil.", "Genesis 3", 4004);
            BibleStory SamsonandDelilah = new BibleStory("Samson and Delilah", "Samson", "Delilah", "cut his hair.", "cutting his hair.", "Judges 13-16", 1200);
            System.out.println(AdamandEve);
            System.out.println(SamsonandDelilah);
        }

    }
