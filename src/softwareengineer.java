public class softwareengineer {
    String name;
    String programming_language;
    String fav_coding_project;


softwareengineer(String name,String programming_language,String fav_coding_project ) {
    this.name = name;
    this.programming_language = programming_language;
    this.fav_coding_project = fav_coding_project;
}
    void back() {
        System.out.println("im a backend developer");
    }

    void front() {
        System.out.println("im a front-end developer");
    }
    void fullstack(){
        System.out.println("im a fullstack developer");
    }
    void software_engineer(){
        System.out.printf("name:"+ name);
        System.out.println("programming_language:"+ programming_language);
        System.out.println("fav_coding_project:"+fav_coding_project);
    }
}



