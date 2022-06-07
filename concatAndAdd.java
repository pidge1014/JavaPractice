//code to concatenate strings and add the sum of each concatination together.  conversion functions are not super fast

long solution(int[] a) {

long totalResult = 0;

for (int i = 0; i < a.length; i++){
    for (int j = 0; j < a.length; j++){
        String concat = Integer.toString(a[i])+Integer.toString(a[j]);
        totalResult = totalResult + Long.parseLong(concat);
    }
    
}

return totalResult;

}
