import java.util.*;

class string
{
      void compare(String s1,String s2)
      {
            if(s1.compareTo(s2)==0) System.out.println("Strings are Equal");
            else System.out.println("Strings are not Equal");
      }
      void ignoreCase(String s1,String s2)
      {
            if(s1.equalsIgnoreCase(s2)) System.out.println("Strings are Equal");
            else System.out.println("Strings are not Equal");
      }
      void testIndex(String s1,String testString)
      {
            System.out.println("FirstOccurance: "+s1.indexOf(testString));
            int count=0,search=0;
            while(true)
            {
                  int ind=s1.indexOf(testString,search);
                  if(ind>=0) 
                  {
                        search=ind+testString.length();
                        count+=1;
                  }
                  if(search>=s1.length()) break; 
            }
            System.out.println("Count is: "+count);
      }
      void concatTwoStrings(String s1,String s2)
      {
            s1+=" ";
            s1=s1.concat(s2);
            System.out.println(s1);
      }
      void findLength(String s1)
      {
            int count=0;
            for(char ch : s1.toCharArray()) count+=1;
            System.out.println("String's length is: "+count);
      }
      void findVowelsAndConsonantCount(String s)
      {
            int vowelsCount=0,consCount=0;
            for(char ch:s.toCharArray()) 
            {
                  if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowelsCount+=1;
                  else if(ch==' ' || ch==',' || ch=='.') continue;
                  else consCount+=1;
            }
            System.out.println("Vowels Count: "+vowelsCount);
            System.out.println("Consonants Count: "+consCount);
      }
};

class TestString
{
      public static void main(String args[])
      {
            string st=new string();
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter First String: ");
            String s1=sc.nextLine();
            //System.out.print("Enter Second String: ");
            //String s2=sc.nextLine();
            
            //st.compare(s1,s2);
            //st.ignoreCase(s1,s2);
            //st.testIndex(s1,"welcome");
            //st.concatTwoStrings(s1,s2);
            //st.findLength("Rgukt is going in its direction");
            st.findVowelsAndConsonantCount(s1);
      }
};
