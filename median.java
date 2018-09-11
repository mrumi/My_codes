class median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total_length = nums1.length+nums2.length;
        int median = 0;
        int pos = total_length/2;
        int mid = 0;
        int mid_next = 0;
        int i=0, j=0, k=0;
        for(; k<pos && i<nums1.length && j<nums2.length; k++){
            if(nums1[i]<=nums2[j]){
                mid = nums1[i];
                i++;
            }
            else{
                mid = nums2[j];
                j++;
            }                                            
        }
        
        if(k==pos){            
            if(i<nums1.length && j<nums2.length){
                if(nums1[i]<=nums2[j]){
                    mid_next = nums1[i];
                }
                else{
                    mid_next = nums2[j];
                }                  
            }
            else if(i==nums1.length){
                mid_next = nums2[j];
            }
            else if(j==nums2.length){
                mid_next = nums1[i];
            }                        
        }
        
        else if(k<pos && i==nums1.length){                                    
            mid = nums2[j+pos-(k+1)];
            mid_next = nums2[j+pos-k];
        }
        
        else if(k<pos && j==nums2.length){                                    
            mid = nums1[i+pos-(k+1)];
            mid_next = nums1[i+pos-k];
        }                
        
        if(total_length%2==1)
            return mid_next;
        else
            return (mid+mid_next)*0.5;
        
    }
}