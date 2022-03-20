public class Corona {
    public static void main(String[] args) {
        int [] rooms= {5, 3, 1};
        int [] groups = {1,1,1};
        int entrance = 0;
        solution (rooms, groups, entrance);
    }
    static int[] solution(int[] rooms, int[] groups, int entrance) {
        int [] res = new int [groups.length];
        // base case
        if (rooms.length == 0){
            for (int i = 0; i < res.length; i++){
                res[i] = -1;
            }
            return res;
        }
        int ir = 0, ig = 0;
        while (ir < rooms.length){
            // if room fits
            if (rooms[ir] == groups[ig]){
                res[ig] = ir+1;
                
            }
            // if room does not perfectly fit
            else {
                // find from the first room until the last room
                int min_to_entrance = rooms.length;
                int min_loc = ir;
                for (int j = 0; j< rooms.length; j++){
                    if ((rooms[j] >= groups [ig]) && min_to_entrance > Math.abs(entrance-j)){ 
                        min_to_entrance = Math.abs(entrance-j);
                        min_loc = j;
                    }
                }
                if (min_loc != ir){
                // chose the one closest to the entrance, UPDATE rooms[] after that
                    res[ig] = min_loc;
                    rooms[min_loc] = 0;
                }
                else {res[ig] = -1;}
                ir--;// the room is left empty so still check it for next group
                // -1 if no room fit
            }
            
            ir ++; ig++;
        }
        // update the rest of the group
        while (ig< groups.length){
            res[ig] = -1;
            ig ++;
        }
        return res;
    }
    
}
