public class Findvowel {
    public static void main(String[] args) {
        String name = "aklsndnc v.,xgioaerfmsnfjszdnJHAUIAEBJBCJHDUIABJKcvlzdkrfaidfnkjzdflbvrei8n";
    
    String name1=name.toLowerCase();
    char[]aa=name1.toCharArray();
    int count = 0;
    for(int i=0;i<aa.length;i++)
    {
        if(aa[i]=='a'||aa[i]=='i'||aa[i]=='o'||aa[i]=='u'||aa[i]=='e'){
            System.out.print(aa[i]+" ");
            count++;

        }
    }
    
    System.out.print("\n"+count);
    }
    
}

