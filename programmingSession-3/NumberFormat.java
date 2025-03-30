package Exception;
//NUMBER FORMAT  EXCEPTION ---------
public class NumberFormat {
		public static void main(String[] args) {
			String s = "Ram";
			try {
				int a = Integer.parseInt(s);

			} catch (NumberFormatException e) {
					System.out.println("Exception handle");
			}
		}
}
