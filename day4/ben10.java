package day4;

class ben10 {
    void name(){
        System.out.println("Ben tensyson");
    }
}
class omitrix extends ben10{
    void omitrix(){
        System.out.println("azmath created omitrix");
    }
}
class heatblast extends omitrix{
    void alien() {
        System.out.println("fires heat strokes");
    }
}
class alienforce {
    public static void main(String[] args) {
        heatblast h = new heatblast();
        h.name();
        h.omitrix();
        h.alien();
    }
}