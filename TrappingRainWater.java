package Trapping_Rain_Water;

public class TrappingRainWater {
	
	public static void main(String[] args){
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		trap(arr);
		System.out.println();
		System.out.println("Example: ");
		System.out.println();
		
		System.out.println("              _");
		System.out.println("      _      | |_   _");
		System.out.println("  _  | |# # #|   |#| |_");
		System.out.println("_| |#|   |#|           |");
		
		
	}
	
	
	public static int trap(int[] height) {
        if (height.length <= 2) return 0;
        
        int water = 0;
        
        int max = 0;
        int maxIndex = -1;
        for(int i=0; i<height.length; i++) {
            if(height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }
    
        int leftMax = height[0];
        for(int i=1; i<maxIndex; i++) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            } else {
                water += leftMax - height[i];
            }
        }
    
        int rightMax = height[height.length - 1];
        for (int i = height.length - 2; i > maxIndex; i--) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            } else {
                water += rightMax - height[i];
            }
        }
        
        System.out.println(water);
        return water;
    }
}
