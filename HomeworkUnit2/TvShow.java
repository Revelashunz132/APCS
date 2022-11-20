//John Aston Adams
//11/20/22

package HomeworkUnit2;

/* 
public class TvShow {
    public static void main(String[] args){
        //#1. System.out.println(numShows)
        //#2. No, because the number of shows is not part of the object and is information outside for the class
        //#3. No, because y is not static but numShows is static, the types need to be the same
        //#4. System.out.println(actor2);
        //#5. No, because the actor1 variable is a static variable that cannot be reasigned/accessed through the nonstatic method setActor1
        //#6. TvShow chrs = new TvShow("Cheers");
              System.out.println(numShows);
        //#7. 59
              59
              59
              160
              160

    }
}
*/

public class TvShow
{
public TvShow(String nm)
{
    numShows++;
showName = nm;

}
public static int numberOfShows( )
{
return numShows;
}
public void setActor1(String act1)
{
actor1 = act1;
}
public String actor1 = "Don Knots";
public static String actor2 = "Homer Simpson";
public static int numShows = 0;
public static int x = 59;
public int y = 1059;
public String showName;

public static void main(String[] args){
    System.out.println(TvShow.x);
TvShow chrs = new TvShow("Cheers");
System.out.println(TvShow.x);
System.out.println(chrs.x);
TvShow hc = new TvShow("History Channel");
hc.x = 160;
System.out.println(TvShow.x);
System.out.println(hc.x);

}
}