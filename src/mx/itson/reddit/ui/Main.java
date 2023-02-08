/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.ui;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.reddit.entidades.Comentario;
import mx.itson.reddit.entidades.Comunidad;
import mx.itson.reddit.entidades.Post;
import mx.itson.reddit.entidades.Usuario;


/**
 *  Declaración de la clase Main
 * @author Erick,Emmnuel y Carlos
 */
public class Main {
    public static void main(String[] args) {
        
         Date  tiempo = new Date(); 
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        List <Usuario> usuario = new ArrayList<>();
        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Pedro Solas");
        usuario1.setCorreo("JuandeDios@gmail.com");
        usuario1.setPassword("gatitaMambo");
        usuario1.setKarma(22);
        usuario1.setPais("Mexico");
        
        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Juan Benitez");
        usuario2.setCorreo("roKO@gmail.com");
        usuario2.setPassword("elpapanel ");
        usuario2.setKarma(22);
        
        Usuario usuario3 = new Usuario();
        usuario3.setNombre("ChalinoSan1605");
        usuario3.setCorreo("cs.1992@hotmail.com");
        usuario3.setPassword("nievesdenero01");
        usuario3.setKarma(955);
        
        Usuario usuario4 = new Usuario();
        usuario4.setNombre("GoDiegoGo");
        usuario4.setCorreo("dieguitogaymer@gmail.com");
        usuario4.setPassword("nozorronoteloll3ves");
        usuario4.setKarma(544);
        
        Usuario usuario5 = new Usuario();
        usuario5.setNombre("FernandoAlonso");
        usuario5.setCorreo("elmagic14@outlook.com");
        usuario5.setPassword("quegrande3eresMagic02");
        usuario5.setKarma(885);
        
        Usuario usuario6 = new Usuario();
        usuario6.setNombre("erickpacoivan");
        usuario6.setCorreo("erick.frankzisco@gmail.com");
        usuario6.setPassword("rdr2goty2018");
        usuario6.setKarma(731);
        
        Usuario usuario7 = new Usuario();
        usuario7.setNombre("Betostadas");
        usuario7.setCorreo("ickkck01@gmail.com");
        usuario7.setPassword("iloveUnininoide");
        usuario7.setKarma(135);
        
        Usuario usuario8 = new Usuario();
        usuario8.setNombre("TravisScott");
        usuario8.setCorreo("lookmamaicanFly@hotmail.com");
        usuario8.setPassword("astroWorld2021");
        usuario8.setKarma(987);
        
        
        // POSTS
        Post post = new Post();        
        post.setTitulo("- JAJA MIREN ESTE MEME -");
        post.setContenido("imagen.jpg");
        Date fecha1 = new Date(); 
        post.setFecha(fecha1);
        post.setPuntos(78);
        
        Post post2 = new Post();
        post2.setTitulo("- DIOS LO ABANDONO -");
        post2.setContenido("Ebenezer McBurney Byers (Pittsburgh; 12 de abril de 1880-Manhattan;\n" + "31 de marzo de 1932) fue un adinerado socialite, "
                + "deportista, e Industrial estadounidense.\n" + "Como golfista fue ganador del Campeonato Amateur de Estados Unidos en 1906.\n" + 
                "Ganó notoriedad a principios de los años 1930, cuando murió de múltiples\n" + "cánceres inducidos por radiación tras consumir Radithor, un popular medicamento patentado hecho de radio disuelto en agua.");
        Date fecha2 = new Date();
        post2.setFecha(fecha2);
        post2.setPuntos(584);
        
        Post post3 = new Post();
        post3.setTitulo("- AYUDA SOY POBRE -");
        post3.setContenido("Chicos denme consejos para independizarme poco a poco. Quiero rentar un departamento para mi y mi mascota, trabajo, pero requiero más tips para que dios no me abandone");
        Date fecha3 = new Date();
        post3.setFecha(fecha3);
        post3.setPuntos(869);
        
        //COMUNIDAD      
        List <Comunidad> comunidad = new ArrayList<>(); 
        Comunidad comunidad1 = new Comunidad();
        Comunidad comunidad2 = new Comunidad();
        Comunidad comunidad3 = new Comunidad();
        
        comunidad1.setNombre("El Pepe");
        comunidad1.setUsuario(usuario);
        
        comunidad2.setNombre("Dios nos abandono");
        comunidad2.setUsuario(usuario);              
        
        comunidad3.setNombre("DeTodoMenosReguetonyBanda");
        comunidad3.setUsuario(usuario);
        
        //COMENTARIOS
        List <Comentario> comentario = new ArrayList<>();
        Comentario comentario1 = new Comentario();
        Comentario comentario2 = new Comentario();
        Comentario comentario3 = new Comentario();
        Comentario comentario4 = new Comentario();
        Comentario comentario5 = new Comentario();
        Comentario comentario6 = new Comentario();
        Comentario comentario7 = new Comentario();
        Comentario comentario8 = new Comentario();
        Comentario comentario9 = new Comentario();
      
        
        
       
        comentario1.setCuerpo("JAJASJAKJSAKJDASKDKAJSDKJA");
        comentario1.setUsuario(usuario1);
        comentario1.setFecha(tiempo);
        comentario1.setPuntos(12);
        
        comentario2.setCuerpo("Chistoso me reí");
        comentario2.setUsuario(usuario3);
        comentario2.setFecha(tiempo);
        comentario2.setPuntos(43);
        
        comentario3.setCuerpo("Nah bro de locos");
        comentario3.setUsuario(usuario4);
        comentario3.setFecha(tiempo);
        comentario3.setPuntos(182);
        
        comentario4.setCuerpo("De hecho hay un corrido tumbado que lo explica");
        comentario4.setUsuario(usuario4);
        comentario4.setFecha(tiempo);
        comentario4.setPuntos(334);
        
        comentario5.setCuerpo("De que murio?");
        comentario5.setUsuario(usuario5);
        comentario5.setFecha(tiempo);
        comentario5.setPuntos(721);
        
        comentario6.setCuerpo("Abrete un only");
        comentario6.setUsuario(usuario7);
        comentario6.setFecha(tiempo);
        comentario6.setPuntos(456);
        
        comentario7.setCuerpo("La de ahorrar te la sabes?");
        comentario7.setUsuario(usuario8);
        comentario7.setFecha(tiempo);
        comentario7.setPuntos(238);
        
        comentario8.setCuerpo("Que prefieres? 10 mil pesos o un consejo millonario?...\n" + 
                "Sabias que con estas 3 simples aplicaciones puedes generar dinero de manera inmediata?\n" + 
                "solo inscribete a mis cursos a tan solo un minimo precio de 7000$");
        comentario8.setUsuario(usuario1);
        comentario8.setFecha(tiempo);
        comentario8.setPuntos(1);
        
         comentario9.setCuerpo("oie y mi gato?");
        comentario9.setUsuario(usuario8);
        comentario9.setFecha(tiempo);
        comentario9.setPuntos(999);
  
        //CONSOLA
        
        System.out.println("////// REDDIT ///////");
        System.out.println("");
        System.out.println("Iniciando.....");
        System.out.println("Usuario: " + usuario1.getNombre());
        System.out.println("Correo : " + usuario1.getCorreo());
        System.out.println("Password : " + usuario1.getPassword());
        System.out.println("Karma : " +  usuario1.getKarma());
        System.out.println("Pais : " + usuario1.getPais());
        System.out.println("");
        
        System.out.println("=========================================================");    
        System.out.println("///////////////// POST //////////////////\n");
        System.out.println("Comunidad : " + comunidad1.getNombre() );
        System.out.println(post.getTitulo());
        System.out.println("Contenido : " +  post.getContenido());
        System.out.println("Publicado por : "  + usuario2.getNombre());
        System.out.println("Puntos : " + post.getPuntos()); 
        System.out.println("Fecha : " + formato.format(post.getFecha()));
        System.out.println("");
        
        System.out.println("/////////////////COMENTARIOS//////////////////\n");
        System.out.println("Usuario : " + usuario1.getNombre());
         System.out.println("Fecha : " +  formato.format(comentario1.getFecha()));
        System.out.println("Comentario : "  +  comentario1.getCuerpo());
        System.out.println("Puntos : " + comentario1.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario3.getNombre());
        System.out.println("Fecha : " + formato.format(comentario2.getFecha()));
        System.out.println("Comentario : " + comentario2.getCuerpo());
        System.out.println("Puntos : " + comentario2.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario1.getNombre());
        System.out.println("Fecha : " + formato.format(comentario7.getFecha()));
        System.out.println("Comentario : " + comentario4.getCuerpo());
        System.out.println("Puntos : " + comentario5.getPuntos());
        System.out.println("");
           
        System.out.println("");
        
        System.out.println("=========================================================");
        System.out.println("///////////////// POST //////////////////\n");
        System.out.println("Comunidad : " + comunidad2.getNombre());
        System.out.println(post2.getTitulo());
        System.out.println("Contenido : " + post2.getContenido());
        System.out.println("Publicado por : " + usuario4.getNombre());
        System.out.println("Puntos : " + post2.getPuntos());
        System.out.println("Fecha : " + formato.format(post2.getFecha()));
        System.out.println("");
        
        System.out.println("/////////////////COMENTARIOS//////////////////\n");
        System.out.println("Usuario : " + usuario4.getNombre());
        System.out.println("Fecha: " + formato.format(comentario3.getFecha()));
        System.out.println("Comentario : " + comentario3.getCuerpo());
        System.out.println("Puntos : " + comentario3.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario4.getNombre());
        System.out.println("Fecha : " + formato.format(comentario4.getFecha()));
        System.out.println("Comentario : " + comentario4.getCuerpo());
        System.out.println("Puntos : " + comentario4.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario5.getNombre());
        System.out.println("Fecha : " + formato.format(comentario5.getFecha()));
        System.out.println("Comentario : " + comentario5.getCuerpo());
        System.out.println("Puntos : " + comentario5.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario3.getNombre());
        System.out.println("Fecha : " + formato.format(comentario2.getFecha()));
        System.out.println("Comentario : " + comentario1.getCuerpo());
        System.out.println("Puntos : " + comentario2.getPuntos());
        System.out.println("");
           
        System.out.println("");
        
         System.out.println("=========================================================");
        System.out.println("///////////////// POST //////////////////\n");
        System.out.println("Comunidad : " + comunidad3.getNombre());
        System.out.println(post3.getTitulo());
        System.out.println("Contenido : " + post3.getContenido());
        System.out.println("Publicado por : " + usuario6.getNombre());
        System.out.println("Puntos : " + post3.getPuntos());
        System.out.println("Fecha : " + formato.format(post3.getFecha()));
        System.out.println("");
        
        System.out.println("/////////////////COMENTARIOS//////////////////\n");
        System.out.println("Usuario : " + usuario7.getNombre());
        System.out.println("Fecha: " + formato.format(comentario6.getFecha()));
        System.out.println("Comentario : " + comentario6.getCuerpo());
        System.out.println("Puntos : " + comentario6.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario8.getNombre());
        System.out.println("Fecha : " + formato.format(comentario7.getFecha()));
        System.out.println("Comentario : " + comentario7.getCuerpo());
        System.out.println("Puntos : " + comentario7.getPuntos());
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario1.getNombre());
        System.out.println("Fecha : " + formato.format(comentario8.getFecha()));
        System.out.println("Comentario : " + comentario8.getCuerpo());
        System.out.println("Puntos : " + comentario8.getPuntos());
        System.out.println("");
  
        System.out.println("-------------------------------------");
        System.out.println("Usuario : " + usuario2.getNombre());
        System.out.println("Fecha : " + formato.format(comentario9.getFecha()));
        System.out.println("Comentario : " + comentario9.getCuerpo());
        System.out.println("Puntos : " + comentario9.getPuntos());
        System.out.println("");
           
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
