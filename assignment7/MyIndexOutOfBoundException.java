package assignment7;



    public class MyIndexOutOfBoundException extends IndexOutOfBoundsException {
        private int lowerBound;
        private int upperBound;
        private int index;

        public MyIndexOutOfBoundException(int lowerBound, int upperBound, int index) {
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
            this.index = index;
        }

        public String toString() {
            return "Error Message: Index " + index + ", but Lower bound: " + lowerBound + ", Upper bound:" + upperBound;
        }

        public static void main(String[] args) {
    		int[] array = new int[3];
    		try {
    		
    			for (int i = 0 ; i <= array.length; i ++) {
    				if(i == array.length) {
    					 throw new MyIndexOutOfBoundException(0, array.length, i);
    				}
    				array[i] += i;
    			}
    		} finally {
    		}
        }
}