import java.io.*;
public class AminoException extends Exception
{
  String pep;
  
  AException(String p)
  {
    pep=p;
  } 
 public String toString()
 {
  return pep + " contains an invalid amino acid.";
 }
}

public class AException
{ 
    public static void main(String args[]) 
    { 
        Scanner s = new Scanner(System.in);  
        String pep = s.nextLine(); 
        String pep1 = s.nextLine();
        if(pep1.length()<pep.length())
           {
             int l=pep1.length();
           }     
        else
           {
             int l=pep.length();
           }
        try 
        {  
          for(int i=0;i<l;i++)
          {
            if (pep.Char.At(i)!='G'||pep.Char.At(i)!='A'||pep.Char.At(i)!='V'||pep.Char.At(i)!='L'||pep.Char.At(i)!='I'||pep.Char.At(i)!='M'||pep.Char.At(i)!='P'||pep.Char.At(i)!='W'||pep.Char.At(i)!='Y'||pep.Char.At(i)!='F'||pep.Char.At(i)!='S'||pep.Char.At(i)!='T'||pep.Char.At(i)!='C'||pep.Char.At(i)!='N'||pep.Char.At(i)!='Q'||pep.Char.At(i)!='H'||pep.Char.At(i)!='K'||pep.Char.At(i)!='R'||pep.Char.At(i)!='D'||pep.Char.At(i)!='E')
              {
               throw new AException(pep); 
              }
             else if ((pep1.Char.At(i)!='G'||pep1.Char.At(i)!='A'||pep1.Char.At(i)!='V'||pep1.Char.At(i)!='L'||pep1.Char.At(i)!='I'||pep1.Char.At(i)!='M'||pep1.Char.At(i)!='P'||pep1.Char.At(i)!='W'||pep1.Char.At(i)!='Y'||pep1.Char.At(i)!='F'||pep1.Char.At(i)!='S'||pep1.Char.At(i)!='T'||pep1.Char.At(i)!='C'||pep1.Char.At(i)!='N'||pep1.Char.At(i)!='Q'||pep1.Char.At(i)!='H'||pep1.Char.At(i)!='K'||pep1.Char.At(i)!='R'||pep1.Char.At(i)!='D'||pep1.Char.At(i)!='E'))
              {
                throw new AException(pep1);
              }
           }
         } 
        catch (AException e) 
        { 
            System.out.println("Error: Amino acid not valid."); 
        } 
    } 
} 