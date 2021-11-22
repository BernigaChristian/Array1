import java.util.Random;
public class Main {
	public static void show(int a[]) {
		for(int i=0;i<(a.length);i++) {
			System.out.print(a[i]+"\t");
		}
		System.out.print("\n\n");
	}
	public static void fill(int a[]) {
		for(int i=0;i<(a.length);i++) {
			a[i]=(int)(new Random().nextInt(50));
		}
	}
	public static void sort(int a[]) {
		int temp;
		for(int j=0;j<(a.length);j++) {
			for(int k=0;k<(a.length);k++) {
				if(a[j]<a[k]) {
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		show(a);
	}
	public static void bigSort(int a[],int a2[],int a3[]) {
		int i=a3.length-1,j=a.length-1,k=a2.length-1;
		while(i>=0) {
			if(a[j]>a2[k]) {
				a3[i]=a[j];
					if(j==0)
						a[j]=0;
					else
						j--;
			}
			else {
				a3[i]=a2[k];
				if(k==0)
					a2[k]=0;
				else
					k--;
			}
			i--;
		}
		show(a3);
	}
	public static void main(String[] args) {
		int a1[]=new int[5];
		int a2[]=new int[7];
		int a3[]=new int[12];
		fill(a1);
		sort(a1);
		fill(a2);
		sort(a2);
		bigSort(a1,a2,a3);
	}
}
