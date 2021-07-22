package align;

class oper implements sub
{
  String seq1 = "",seq2 = "";
  char[] seq3 = "";
  int icount=0;
  sub(seq1,seq2)
  {
   if (seq1.length()<seq2.length())
      {
        l=seq1.length();
      }
   else
      {
        l=seq2.length();
      }
   for(int i=0;i<l;i++)
    {
     if(seq1.CharAt(i)==seq2.CharAt(i))
      {
       seq3[i] = "*";
       icount++;
      }
     else
       seq3[i] = "-";
    }
   System.out.println(seq3.ValueOf());
   float iden=(float)(icount/l;)
   System.out.println("% identity = "+iden);
  }
}
