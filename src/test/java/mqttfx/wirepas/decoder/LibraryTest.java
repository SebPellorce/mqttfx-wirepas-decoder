/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mqttfx.wirepas.decoder;

import org.junit.Test;
import static org.junit.Assert.*;


public class LibraryTest {
	
	public static byte[] hexStringToByteArray(String s) {
	    int len = s.length();
	    byte[] data = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
	                             + Character.digit(s.charAt(i+1), 16));
	    }
	    return data;
	}
	
    @Test public void testSomeLibraryMethod() {
        WirepasProtobufDecoder classUnderTest = new WirepasProtobufDecoder();
        assertTrue("Test getName", classUnderTest.getName() == "Wirepas Generic Protobuf decoder");

        String message_test = "0A71426F0A1E0A0B67772D70726F762D"
        		+ "646576120573696E6B3118F1BDFF89FA"
        		+ "91C5821A1001180120F70128FF01300F"
        		+ "38D99186AD9D2E40004A36BF18408201"
        		+ "183C01140418EB050007170818FD1818"
        		+ "187D18418601010118FF000018428200"
        		+ "001845890100000000000019044318C7"
        		+ "FF5801";
        
        byte[] message = hexStringToByteArray(message_test);

        assertTrue("someLibraryMethod should return 'true'", classUnderTest.decode(message) != null);
    }
}
