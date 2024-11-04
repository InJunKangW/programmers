import java.util.*;

class Data{
    private int code;
    private int date;
    private int maximum;
    private int remain;
    
    public Data(int[] data){
        code = data[0];
        date = data[1];
        maximum = data[2];
        remain = data[3];
    }
    
    public int getCode(){return code;}
    public int getDate(){return date;}
    public int getMaximum(){return maximum;}
    public int getRemain(){return remain;}
    
    public boolean match(String ext, int val_ext){
        switch(ext){
                case "code":
                    return code < val_ext;
                case "date":
                    return date < val_ext;
                case "maximum":
                    return maximum < val_ext;
                case "remain" :
                    return remain < val_ext;
                default :
                    return true;
        }
    }
    
    public int[] makeArray(){
        int [] result = {code, date, maximum, remain};
        return result;
    }
}

class DataComparator implements Comparator<Data> {
    private final String sort_by;
    
    public DataComparator(String sort_by){
        this.sort_by = sort_by;
    }
    
    @Override
    public int compare(Data data1, Data data2){
        switch(sort_by){
            case "code":
                return data1.getCode() - data2.getCode();
            case "date":
                return data1.getDate() - data2.getDate();
            case "maximum":
                return data1.getMaximum() - data2.getMaximum();
            case "remain" :
                return data1.getRemain() - data2.getRemain();
            default :
                return 0;
        }
    }
}

class Solution {
    public int[] makeArray(Data data){
        int [] result = {data.getCode()};
        return result;
    }
    
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        List<Data> dataList = new ArrayList<>();
        
        for(int[] array : data){
            Data personalData = new Data(array);
            if(personalData.match(ext, val_ext)){
                dataList.add(personalData);
            }
        }
        dataList.sort(new DataComparator(sort_by));
        
        int[][] answer = new int[dataList.size()][4];
        for(int i = 0; i < dataList.size(); i++) {
            answer[i] = dataList.get(i).makeArray();
        }
        
        return answer;
    }
}