class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        phone_number = phone_number.substring(length -4, length);
        return  "*".repeat(length -4) + phone_number;
    }
}