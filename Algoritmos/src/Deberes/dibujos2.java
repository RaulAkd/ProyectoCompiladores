package Deberes;
//Demostración de una ruta general.
import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class dibujos2 extends JFrame {

	int i=0,j=0;
	int k=300;
	int z=50;
 int m,n;
 public dibujos2()
 {
    super( "Dibujo de figuras 2D" );

    getContentPane().setBackground( Color.white);
    setSize( 1280, 720 );
    setVisible( true );
 }

 
 public void paint( Graphics g )
 {
    super.paint( g );  // llamar al método paint de la superclase
    
   /* g.setColor(Color.black);
    g.fillOval (50, 50, 10, 10);
    
    g.drawOval (200, 50, 75, 20);
    g.drawOval (200, 200, 75, 20);
    g.drawLine(200, 60, 200, 210);
    g.drawLine(275, 60, 275, 210);
    
    g.drawOval (425, 50, 100, 100);
    */
    
    g.setColor(Color.black);
    
    //borde techo izquierdo
    for(int n=1;n<=2;n++)
    {
 	   g.drawLine((z-10)-n, k+10, (140)-n, 210);
    }
    
    //borde techo derecho
    for(int n=1;n<=2;n++)
    {
 	   g.drawLine((1073-10)-n, k+10, (1163)-n, 210);
    }
    
    //borde techo superior
    for(int n=1;n<=2;n++)
    {
 	   g.drawLine(154-15, (206)+n, 1162, (206)+n);
    }
    //borde techo inferior
    for(n=1;n<=2;n++)
    {
 	   g.drawLine(z-15, (k+10)+n, 1062, (k+10)+n);
    }
    
         
           
    for(int j = 0; j < 10; j++)
	      {
	    	  for ( int i = 0; i <= 200; i++ ) 
		      {  
		    	  g.setColor(Color.RED);
	    		  g.drawRoundRect( z + i*5, k ,10 ,10,30,30);
		    	  //g.fillRoundRect(z, k, width, height, arcWidth, arcHeight);
	    		  
			  }  
	    	  k=k-10;
	    	  z=z+10;
	      }
    
    
    
    
  //borde techo 2
    for(int n=1;n<=2;n++)
    {
 	   g.setColor(Color.black);
 	   g.drawLine((1073-10)-n, 425, (1163)-n, 325);
    }
    
  //borde vertical 1 techo 2
          
    for(int n=1;n<=2;n++)
    {
 	   g.setColor(Color.black);
 	   g.drawLine(1063-n, 310, 1063-n, 435);
 	   //g.drawLine((1073-10)-n, 425, (1163)-n, 325);
    }
    
  //borde vertical 2 techo 2
    
    for(int n=1;n<=2;n++)
    {
 	   g.setColor(Color.black);
 	   g.drawLine(1163-n, 110, 1163-n, 550);
 	   //g.drawLine((1073-10)-n, 425, (1163)-n, 325);
    }
    
    //borde horizontal 2 techo 2
    
    for(int n=1;n<=2;n++)
    {
 	   g.setColor(Color.black);
 	   g.drawLine(1063, 435+n, 1163, 435+n);
 	   //g.drawLine((1073-10)-n, 425, (1163)-n, 425);
    }
    
    
    z=1063;
    k=400;
                 
    for(int j = 0; j < 10; j++)
	      {
	    	  for ( int i = 0; i <= 18; i++ ) 
		      {  
		    	  g.setColor(Color.RED);
	    		  g.drawRoundRect( z + i*5, k-i*5 ,10 ,10,30,30);
		    	  //g.fillRoundRect(z, k, width, height, arcWidth, arcHeight);
	    		  
			  }  
	    	  k=k-10;
	    	  //z=z+10;
	      }

    z=1063;
    k=425;
    m=18;             
    for(int j = 0; j < 10; j++)
	      {
	    	  for ( int i = 0; i <= m; i++ ) 
		      {  
		    	  g.setColor(Color.RED);
	    		  g.drawRoundRect( z + i*5, k-i*5 ,10 ,10,30,30);
		    	  //g.fillRoundRect(z, k, width, height, arcWidth, arcHeight);
	    		  
			  }  
	    	  //k=k+10;
	    	  z=z+10;
	    	  m=m-2;
	      }
    
    for(i=1;i<=2;i++)
    {
 	   g.setColor(Color.black);
 	 
        g.drawLine(1070, 550+i, 1280, 550+i);
        g.drawLine(1070+i, 550, 1070+i, 435);
        g.drawLine(50, 470+i, 1070, 470+i);//linea horizontal
        g.drawLine(50+i, 470, 50+i, 310);//linea vertical izquierda      
    }
    
    g.setColor(Color.black);
    g.fillRect(50, 452, 20, 20);
    g.fillRect(300, 452, 20, 20);
    g.fillRect(550, 452, 20, 20);
    g.fillRect(800, 452, 20, 20);
    m=0;
    for(n=0;n<4;n++)
    {
 	   g.drawArc(70+m, 340, 230, 260, 0, 180);
 	   m+=250;
    }
    g.setColor(Color.black);
    g.fillRect(1130, 490, 20, 61);
    g.drawRoundRect(1080, 450, 40, 40, 10, 10);//ventana
    g.drawRoundRect(1082, 452, 35, 35, 10, 10);//borde ventana
    
    
    g.drawRect(170, 370, 80, 102);
    g.drawRect(172, 372, 76, 100);
    
    g.drawRect(920, 370, 80, 102);
    g.drawRect(922, 372, 76, 100);

    g.drawRect(370, 370, 100, 52); //pizarron
    g.setColor(Color.green);
    g.fillRect(372, 372, 96, 48); //borde
    g.setColor(Color.black);
    g.drawRect(372, 372, 96, 48); //borde
    
    g.setColor(Color.yellow);
    g.fillRect(380, 380, 20, 30);
    g.setColor(Color.LIGHT_GRAY);
    g.fillRect(405, 380, 40, 20);
    g.setColor(Color.black);
    g.drawRect(380, 380, 20, 30); //hojas
    g.drawRect(405, 380, 40, 20);
    //pizarron 2
    g.drawRect(630, 370, 120, 52); //pizarron
    g.setColor(Color.green);
    g.fillRect(632, 372, 116, 48); //borde
    g.setColor(Color.black);
    g.drawRect(632, 372, 116, 48); //borde
    
    g.setColor(Color.CYAN);
    g.fillRect(640, 380, 20, 30);
    g.setColor(Color.white);
    g.fillRect(665, 380, 60, 30);
    g.setColor(Color.black);
    g.drawRect(640, 380, 20, 30); //hojas
    g.drawRect(665, 380, 60, 30);
    
    /*i=0;
    j=0;
    z=10;
    k=70;
    g.setColor(Color.GREEN);
    for(j=1;j<30;j+=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.fillOval (z+=10, k, 15,10);   
 	   }
 	   k+=10;
 	   z=10;
    }*/
    i=0;
    j=0;
    z=10;
    k=70;
    g.setColor(Color.green);
    for(j=1;j<30;j+=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.drawOval (z+=10, k, 15,10);   
 	   }
 	   k+=10;
 	   z=10;
    }

    /*i=0;
    j=0;
    z=10;
    k=210;
    g.setColor(Color.green);
    for(j=30;j>20;j-=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.fillOval (z+=10, k, 15,10);   
 	   }
 	   k+=10;
 	   z=10;
    }*/
    
    
    i=0;
    j=0;
    z=10;
    k=210;
    g.setColor(Color.green);
    for(j=30;j>20;j-=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.drawOval (z+=10, k, 15,10);   
 	   }
 	   k+=10;
 	   z=10;
    }
    
    for(i=0;i<2;i++)
    {
 	   g.setColor(Color.black);
        g.drawLine(1163, 110+i, 1280, 140+i);
        g.drawLine(1163, 150+i, 1280, 180+i);   
    }
    
    g.drawLine(0, 600, 500, 720);
    g.drawLine(0, 580, 550, 720);
    
    
    /*i=0;
    j=0;
    z=800;
    k=200;
    m=0;
    g.setColor(Color.green);
    for(j=30;j>2;j-=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.fillOval (z+=10, k, 15,10);   
 	   }
 	   k-=10;
 	   z=800+m;
 	   m+=10;
    }*/
    i=0;
    j=0;
    z=800;
    k=200;
    m=0;
    g.setColor(Color.green);
    for(j=30;j>2;j-=2)
    {
 	   for(i=1;i<j;i++)
 	   {
 		   g.drawOval (z+=10, k, 15,10);   
 	   }
 	   k-=10;
 	   z=800+m;
 	   m+=10;
    }
    g.setColor(Color.black);
    g.drawLine(550, 472, 500, 570);
    g.drawLine(560, 472, 510, 570);
    g.drawLine(500, 570, 510, 570);
    
           
    g.drawLine(650, 472, 600, 570);
    g.drawLine(660, 472, 610, 570);
    g.drawLine(600, 570, 610, 570);
                
    g.drawLine(750, 472, 700, 570);
    g.drawLine(760, 472, 710, 570);
    g.drawLine(700, 570, 710, 570);
    
    g.drawLine(850, 472, 800, 570);
    g.drawLine(860, 472, 810, 570);
    
    
    g.drawLine(800, 570, 810, 570);
    
    g.drawLine(950, 472, 900, 570);
    g.drawLine(960, 472, 910, 570);
    g.drawLine(900, 570, 910, 570);
    // lineas horizontales estacionamiento
    g.drawLine(950, 492, 1070, 492);
    g.drawLine(945, 502, 1070, 502);
    
    g.drawLine(935, 522, 1070, 522);
    g.drawLine(930, 532, 1070, 532);
    
    g.drawLine(920, 552, 1070, 552);
    g.drawLine(915, 562, 1070, 562);
    g.drawLine(1070, 562, 1080, 552);
    
    //auto
    m=0;
    n=0;
    for(i=0;i<5;i++)
 	   {
 	   		g.setColor(Color.black);
 	   		g.drawLine(120+m,500+n,200+m,520+n);
 	   		g.drawLine(90+m,530+n,170+m,550+n);
    			g.drawLine(90+m,530+n,120+m,500+n);//linea izq vert
    			g.drawLine(170+m,550+n,200+m,520+n);//linea derech vert
    			g.drawLine(90+m,530+n,80+m,538+n);//linea izquierda parabrisas
    			g.drawLine(200+m,520+n,210+m,530+n);//linea sup parabrisas
    			g.drawLine(170+m,550+n,180+m,560+n);
    			g.drawLine(180+m,560+n,210+m,530+n);//linea inf parabrisas
        		g.drawLine(180+m,560+n,210+m,566+n);//linea inf carr
        		g.drawLine(210+m,566+n,240+m,536+n);//linea paralela a inf parabr
        		g.drawLine(240+m,536+n,210+m,530+n);//linea sup carr
        		g.drawLine(210+m,566+n,210+m,576+n);//linea vertical
        		g.drawLine(240+m,536+n,240+m,546+n);//linea vertical 2
        		g.drawLine(210+m,576+n,240+m,546+n);
        		g.drawLine(240+m,536+n,210+m,530+n);
        		g.drawOval(213+m, 563+n, 5,5);
        		g.drawOval(233+m, 543+n, 5,5);
        		g.drawLine(220+m,560+n,231+m,549+n);//lineas
        		g.drawLine(220+m,563+n,231+m,552+n);//lineas
        		g.drawLine(80+m,538+n,80+m,548+n);
        		g.drawLine(80+m,548+n,210+m,576+n);
        		g.drawLine(80+m,538+n,180+m,560+n);
        		g.drawLine(130+m,540+n,130+m,549+n);
        //llanta
        		g.fillOval(175+m, 568+n, 20,10);
        		g.setColor(Color.white);
        		g.fillOval(180+m, 570+n, 10,5);
        		g.setColor(Color.black);
        //llanta
        		g.fillOval(95+m, 550+n, 20,10);
        		g.setColor(Color.white);
        		g.fillOval(100+m, 552+n, 10,5);
        		m+=200;
        		n+=50;
 	   }
    g.setColor(Color.black);
    g.drawLine(10,10,400,75);
    g.drawLine(400,75,350,95);
    g.drawLine(350,95,375,75);
    g.drawLine(375,75,10,10);
    g.drawLine(375,75,300,100);//
    g.drawLine(300,100,320,80);
    g.drawLine(320,80,10,10);
    g.drawLine(320,80,250,110);//2
    g.drawLine(250,110,260,85);
    g.drawLine(260,85,10,10);
    g.drawLine(260,85,160,115);
    g.drawLine(160,115,140,90);
    g.drawLine(140,90,95,110);
    g.drawLine(140,90,10,10);
    g.drawLine(350,95,350,145);
    g.setColor(Color.gray);
    g.drawLine(300,100,300,150);
    g.drawLine(250,110,250,160);
    g.drawLine(260,85,160,115);
    //g.drawArc (10, 320, 50,100,0,90);
    /*g.drawOval (10, 70, 15,10);
    g.drawOval (10, 80, 15,10);
    g.drawOval (20, 80, 15,10);*/
    /*for(i=1;i<=10;i++)
    {
 	   g.drawOval (10, 70, 15,10);   
    }*/
    
    
    
    //g.drawArc(40, 400, 100, 400, 0, 180);

 } 


 public static void main( String args[] )
 {
    dibujos2 aplicacion = new dibujos2();
    aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 }

} 
