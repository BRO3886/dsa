class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int len = image[i].length;
            for(int j = 0; j < len/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][len-1-j];
                image[i][len-1-j] = temp;
                // image[i][j] = image[i][j] == 0?1:0;
            }
            
            for(int item: image[i]){
                System.out.print(item+" ");
            }
            System.out.println();
            
            for(int k =0; k < len; k++){
                if(image[i][k] == 0){
                    image[i][k] = 1;   
                } else {
                    image[i][k] = 0;
                }
            }
            
        }
        
        return image;
    }
}