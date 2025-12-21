import java.util.*;
class long
{
	public static void main(String[] args)
	{
		String s="whdqcudjpisufnrtsyupwtnnbsvfptrcgvobbjglmpynebblpigaflpbezjvjgbmofejyjssdhbgghgrhzuplbeptpaecfdanhlylgusptlgobkqnulxvnwuzwauewcplnvcwowmbxxnhsdmgxtvbfgnuqdpxennqglgmspbagvmjcmzmbsuacxlqfxjggrwsnbblnnwisvmpwwhomyjylbtedzrptejjsaiqzprnadkjxeqfdpkddmbzokkegtypxaafodjdwirynzurzkjzrkufsokhcdkajwmqvhcbzcnysrbsfxhfvtodqabvbuosxtonbpmgoemcgkudandrioncjigbyizekiakmrfjvezuzddjxqyevyenuebfwugqelxwpirsoyixowcmtgosuggrkdciehktojageynqkazsqxraimeopcsjxcdtzhlbvtlvzytgblwkmbfwmggrkpioeofkrmfdgfwknrbaimhefpzckrzwdvddhdqujffwvtvfyjlimkljrsnnhudyejcrtrwvtsbkxaplchgbikscfcbhovlepdojmqybzhbiionyjxqsmquehkhzdiawfxunguhqhkxqdiiwsbuhosebxrpcstpklukjcsnnzpbylzaoyrmyjatuovmaqiwfdfwyhugbeehdzeozdrvcvghekusiahfxhlzclhbegdnvkzeoafodnqbtanfwixjzirnoaiqamjgkcapeopbzbgtxsjhqurbpbuduqjziznblrhxbydxsmtjdfeepntijqpkuwmqezkhnkwbvwgnkxmkyhlbfuwaslmjzlhocsgtoujabbexvxweigplmlewumcone";
		String data="";
		String ans="";
		int last=0;
		int first=last;
		while(first<s.length())
		{
			if(last>=0 && last<s.length())
			{
				data+=s.charAt(last);
				if(s.charAt(first)==s.charAt(last) && data.length()>ans.length())
                {
                    if(check(data))
                    {
                        ans=data;
                    }
                }	
			}
			last++;
			if(last==s.length()-1)
			{
				first++;
				last=first;
				data="";
			}
		}
		System.out.println(ans);
	}
	public static boolean check(String s)
	{
		String d="";
		for(int i=s.length()-1;i>=0;i--)
		{
			d+=s.charAt(i);
		}
		if(d.equals(s))
			return true;
		
		return false;
	}
	
}