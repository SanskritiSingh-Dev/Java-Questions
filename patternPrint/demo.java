public class demo {
            public static void main(String[] args) {
                int n=5;
                for(int i=0;i<=n;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                    for(int j = 1; j <=i; j++){
                      for(int k=6;k<n-2;k--){
                        System.out.print(" ");
                    }
                    for(int l=n*2;l>=n+1;l--){
                            System.out.print("* ");
                    }
                    }
                    System.out.println();

                }






                  for(int i=0;i<=n;i++){      
                    for(int j=n-1;j>=i;j--){
                        System.out.print("* ");
                    }
                        System.out.println();
                    
                }

                
            }

}
