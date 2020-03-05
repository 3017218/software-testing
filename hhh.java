package st3017218090;

import java.util.Scanner; 

public class hhh {
	
    public static String jud(float x) {
		int sym=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					for(int l=0;l<3;l++) {
						for(int m=0;m<4;m++) {
							int tol=50*i+20*j+10*k+5*l+1*m;
							if(x==tol) {
								sym=1;
							}
						}
					}
				}
			}
		}
		if(sym==1) {
			
			return "yes";
		}
		else {
			
			return "no";
		}
	}

	
	
}
