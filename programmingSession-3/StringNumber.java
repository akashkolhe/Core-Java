package day1;

public class StringNumber {
	public static void main(String[] args)

	{

		String str = "aka2sh abhi3shek find5";

		System.out.println(extractInt(str));

	}

	static String extractInt(String str)

	{
		str = str.replaceAll("[^0-9]", "");
		str = str.replaceAll(" +", " ");
		if (str.equals(" "))
			return "-1";
		return str;

	}
}
