package POO;

public class Muslim {

    final String prophet="MOUHAMED";
    private String guide;
    private String cite;

    public Muslim(String guide, String Cite){
        this.guide=guide;
        this.cite=Cite;

    }
    public Muslim(){


    }

    public void Infos(){

        System.out.println("Ce "+ Muslim.class+" ");
        System.out.println("Son guide est "+this.guide);
        System.out.println("Son guide est "+this.cite);




    }
}
