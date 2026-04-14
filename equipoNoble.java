public class Principal {
  public static void main(String[]args){
       GremioRPG g = new GremioRPG("Noble Team");

        
        Personaje p1 = new Personaje("Carter", 10, 120);
        Personaje p2 = new Personaje("Kat", 9, 100);
        Personaje p3 = new Personaje("Jun", 8, 110);
        Personaje p4 = new Personaje("Emile", 10, 130);
        Personaje p5 = new Personaje("Jorge", 9, 95);
        Personaje p6 = new Personaje("Seis", 7, 105);
        Personaje p7 = new Personaje("Jonh-117", 6, 80);
        Personaje p8 = new Personaje("Cortana", 5, 90);

        g.unirseAlEquipo(p1);
        g.unirseAlEquipo(p2);
        g.unirseAlEquipo(p3);
        g.unirseAlEquipo(p4);
        g.unirseAlEquipo(p5);
        g.unirseAlEquipo(p6);
        g.unirseAlEquipo(p7);
        g.unirseAlEquipo(p8);

  
        g.colocarEnDungeon(p1, 0, 0);
        g.colocarEnDungeon(p2, 1, 1);
        g.colocarEnDungeon(p3, 2, 2);
        g.colocarEnDungeon(p4, 3, 3);

    
        p1.setHp(0);
        p2.setHp(0);

        
        g.limpiarCaidos();

        g.reporteGremio();
    ]
  ]
