//Who likes it?
public class WhoLike {
    public static String whoLikesIt(String... names) {
        String result="";
        int other;
        if(names.length==0){result="no one likes this";}
        if(names.length==1){result=names[0]+" likes this";}
        if(names.length==2){result=names[0]+" and "+names[1]+" like this";}
        if(names.length==3){result=names[0]+", "+names[1]+" and "+names[2]+" like this";}
        if(names.length>3){
            other=names.length-2;
            result=names[0]+", "+names[1]+" and "+other+" others like this";
        }
        //Do your magic here
        return result;
    }
}
