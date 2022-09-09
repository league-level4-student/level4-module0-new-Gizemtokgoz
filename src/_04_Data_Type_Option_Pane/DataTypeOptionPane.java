package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
	enum DataType {
		BYTE(8), SHORT(16), INT(32), LONG(64), FLOAT(32), DOUBLE(64), BOOLEAN(2), CHAR(16);

		private final int bits;

		private DataType(int bits) {
			this.bits = bits;
		}

		public int getbits() {
			return this.bits;
		}
	}

	public static void main(String[] args) {
		DataType[] dataTypes = DataType.values();
		
		int str = JOptionPane.showOptionDialog(null, "Select the data type you want to learn about:", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dataTypes, DataType.BYTE);

		switch (dataTypes[str]) {
		case BYTE: {
			JOptionPane.showMessageDialog(null, "The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).");
			break;
		}
		
		case SHORT: {
			JOptionPane.showMessageDialog(null, "The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).");
			break;
		}
		
		case INT: {
			JOptionPane.showMessageDialog(null, "By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1.");
			break;
		}
		
		case LONG: {
			JOptionPane.showMessageDialog(null, "The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1.");
			break;
		}
		
		case FLOAT: {
			JOptionPane.showMessageDialog(null, "The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion.");
			break;
		}
		
		case DOUBLE: {
			JOptionPane.showMessageDialog(null, "The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion.");
			break;
		}
		
		case BOOLEAN: {
			JOptionPane.showMessageDialog(null, "The boolean data type has only two possible values: true and false.");
			break;
		}
		
		case CHAR: {
			JOptionPane.showMessageDialog(null, "The char data type is a single 16-bit Unicode character. It has a minimum value of '\\u0000' (or 0) and a maximum value of '\\uffff' (or 65,535 inclusive).");
			break;
		}
		
		}
	}
}
