package Upcasting;

import Upcasting.Book;

public  class Dictionary extends Book {
        int words;
        public Dictionary(int pages, int words) {
            super(pages);
            this.words = words;
        }
        void lookUp(){
            System.out.println("Looking up");
        }
    }
