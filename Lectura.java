import java.io.*;
class Lectura{
    
   public static int readInt(){
      byte val=0;
      int gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva=Integer.parseInt(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
            val=1;
            System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   } 
   
   
   
   public static byte readByte(){
      byte val=0;
      byte gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva=Byte.parseByte(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
            val=1;
            System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   }
   
   
   
   public static short readShort(){
      byte val=0;
      short gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva= Short.parseShort(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
         val=1;
         System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   } 
   
   
   
   public static long readLong(){
      byte val=0;
      long gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva= Long.parseLong(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
            val=1;
            System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   } 
   
   
   
   public static double readDouble(){
      byte val=0;
      double gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva=Double.parseDouble(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
            val=1;
            System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   } 
   
   
   
   public static float readFloat(){
      byte val=0;
      float gnueva=0;
      do{
         val=0;
         DataInputStream z=new DataInputStream(System.in);
         String g;
         try{
            g=z.readLine();
            gnueva=Float.parseFloat(g);
            }
         catch(IOException e){g="0";}
         catch(NumberFormatException e){
            val=1;
            System.out.println("Valor invalido, ingrese nuevamente");
         }
      }while(val==1);
      return gnueva;
   } 
   
   
   
   
   public static char readChar(){
      DataInputStream z=new DataInputStream(System.in);
   String g;
   try{
      g=z.readLine();
      }
   catch(IOException e){g=" ";}
   char gnueva=g.charAt(0);
   return gnueva;
   } 
   
   
   
   
   public static String readString(){
      DataInputStream z=new DataInputStream(System.in);
   String g;
   try{
      g=z.readLine();
      }
   catch(IOException e){g=" ";}
   return g;
   } 
}