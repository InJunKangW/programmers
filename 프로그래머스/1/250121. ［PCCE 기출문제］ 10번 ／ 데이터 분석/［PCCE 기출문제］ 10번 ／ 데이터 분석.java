import java.util.*;

class Solution {
    private class Data{
        public int code;
        public int date;
        public int maximum;
        public int remain;
        
        public Data(int[] dataArr){
            this.code = dataArr[0];
            this.date = dataArr[1];
            this.maximum = dataArr[2];
            this.remain = dataArr[3];
        }
        
        public int[] toArray(){
            return new int[] {code, date, maximum, remain};
        }
        
        public Comparable getSortBy(String sort_by) {
            switch (sort_by) {
                case "code": return this.code;
                case "date": return this.date;
                case "maximum": return this.maximum;
                case "remain": return this.remain;
                default: return null;
            }
        }
    }
    
    
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<Data> dataList = new ArrayList<>();
        
        for (int[] dataArr : data) {
            dataList.add(new Data(dataArr));
        }
        List<Data> filteredData = new ArrayList<>();
        for (Data d : dataList) {
            switch (ext) {
                case "code":
                    if (d.code < val_ext) filteredData.add(d);
                    break;
                case "date":
                    if (d.date < val_ext) filteredData.add(d);
                    break;
                case "maximum":
                    if (d.maximum < val_ext) filteredData.add(d);
                    break;
                case "remain":
                    if (d.remain < val_ext) filteredData.add(d);
                    break;
            }
        }
        
        Collections.sort(filteredData, (d1, d2) -> {
            Comparable val1 = d1.getSortBy(sort_by);
            Comparable val2 = d2.getSortBy(sort_by);
            return val1.compareTo(val2);
        });
        
        int[][] answer = new int[filteredData.size()][4];
        for (int i = 0; i < filteredData.size(); i++) {
            Data d = filteredData.get(i);
            answer[i] = d.toArray();
        }
        return answer;
    }
}