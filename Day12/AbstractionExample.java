package Day12;

public class AbstractionExample extends Games {

 
    public void plays() {
        System.out.println("Nikhil plays both indoor and outdoor games.");
        System.out.println("");
    }

    public static void main(String[] args) {
        AbstractionExample a = new AbstractionExample();
        a.plays();
        
        Cricket c = new Cricket();
        c.plays();
        
        Football f = new Football();
        f.plays();
        
        Kabaddi k = new Kabaddi();
        k.plays();
        
        Basketball ba = new Basketball();
        ba.plays();
        
        Chess ch = new Chess();
        ch.plays();
        
        Business b = new Business();
        b.plays();
        
        Cards ca = new Cards();
        ca.plays();
        
        Carrom cm = new Carrom();
        cm.plays();
    }
}

abstract class Games {
    abstract public void plays();
}

class Cricket extends Games {
    public void plays() {
        System.out.println("Nikhil plays Cricket – It is an Outdoor game.");
    }
}

class Football extends Games {
    public void plays() {
        System.out.println("Nikhil plays Football – It is an Outdoor game.");
    }
}

class Kabaddi extends Games {
    public void plays() {
        System.out.println("Nikhil plays Kabaddi – It is an Outdoor game.");
    }
}

class Basketball extends Games {
    public void plays() {
        System.out.println("Nikhil plays Basketball – It is an Outdoor game.");
    }
}

class Chess extends Games {
    public void plays() {
        System.out.println("Nikhil plays Chess – It is an Indoor game.");
    }
}

class Business extends Games {
    public void plays() {
        System.out.println("Nikhil plays Business – It is an Indoor game.");
    }
}

class Cards extends Games {
    public void plays() {
        System.out.println("Nikhil plays Cards – It is an Indoor game.");
    }
}

class Carrom extends Games {
    public void plays() {
        System.out.println("Nikhil plays Carrom – It is an Indoor game.");
    }
}
