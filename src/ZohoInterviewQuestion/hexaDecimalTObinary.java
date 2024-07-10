package ZohoInterviewQuestion;

public class hexaDecimalTObinary {

	//public static void main(String[] args) {
//		String str = "1AC5";
//		char hexdec[] = new char[100];
//		
//		hexdec = str.toCharArray();
//		
//		try
//		{
//			HexToBin(hexdec);
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//
//	}
//	
//	static void HexToBin(char hexdec[])
//    {
//        int i = 0;
//        while(i<hexdec.length)
//        {
//        	switch (hexdec[i]) {
//             case '0':
//                 System.out.print("0000");
//                 break;
//             case '1':
//                 System.out.print("0001");
//                 break;
//             case '2':
//                 System.out.print("0010");
//                 break;
//             case '3':
//                 System.out.print("0011");
//                 break;
//             case '4':
//                 System.out.print("0100");
//                 break;
//             case '5':
//                 System.out.print("0101");
//                 break;
//             case '6':
//                 System.out.print("0110");
//                 break;
//             case '7':
//                 System.out.print("0111");
//                 break;
//             case '8':
//                 System.out.print("1000");
//                 break;
//             case '9':
//                 System.out.print("1001");
//                 break;
//             case 'A':
//             case 'a':
//                 System.out.print("1010");
//                 break;
//             case 'B':
//             case 'b':
//                 System.out.print("1011");
//                 break;
//             case 'C':
//             case 'c':
//                 System.out.print("1100");
//                 break;
//             case 'D':
//             case 'd':
//                 System.out.print("1101");
//                 break;
//             case 'E':
//             case 'e':
//                 System.out.print("1110");
//                 break;
//             case 'F':
//             case 'f':
//                 System.out.print("1111");
//             case '.':
//                 System.out.print(".");
//                 break;
//             default:
//                 System.out.print("\nInvalid hexadecimal digit " + hexdec[i]);
//             }
//        	i++;
//        }
// 
//       
//        
//    }



//Alternate Method
//class HexToBinary {
    public static void main(String[] args)
    {
        String s = "1Ac5";
        String result = hexToBinary(s);
        System.out.println(result);
    }
    private static String hexToBinary(String input)
    {
        /*Using Integer.parseInt() to get the decimal value
         * of the given String*/
        int decimalValue = Integer.parseInt(input,16);
        System.out.println(decimalValue);
        
 
        /*Using Integer.toBinaryString() to get the binary
         * String of given integer*/
        String result
            = Integer.toBinaryString(decimalValue);
 
        /*Alternatively you may also merge above operations
        to one line like
        * String result = Integer.toBinaryString(Integer.parseInt(input, 16));
          */
        return result;
    }
}
