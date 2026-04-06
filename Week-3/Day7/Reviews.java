class Reviews{

        private int id;
        private String desc;
        private int rating;

        public Reviews(int id,String desc, int rating) {
            this.id = id;
            this.rating = rating;
            this.desc = desc;
        }

        public String toString(){
            return String.format("id - %d, desc- %s, rating- %d",id,desc,rating);
        }
}