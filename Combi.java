package combi;


import java.util.ArrayList;

	import java.util.List;
	
public class Combi {

		int n, m=0;

		int f=0;
		int i=0;

		 int [] ns  = {1,2,3,4,5};
		
		int L = ns.length;
		
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		ArrayList  <Integer> A = new ArrayList<>();

		void R (int r, int n, ArrayList <Integer>C )
		
		{	System.out.println("__LOOP_BEGIN__");
			
			for (int i=1; i<= ns.length; i++)
				
			{ 	
//				n=n+1;
//				System.out.println(n+ " i " + i);
				
				C.add(i);
				
				if (C.size()<ns.length) {R (r,r,C);}
		
	
				if (C.size() == ns.length)
					{B.add((ArrayList<Integer>) C.clone());}
				
				System.out.println(C);
				
				C.remove(C.size()-1);
	
			
			}
			
			System.out.println("****LOOP*END*****");
			
		
			System.out.println();
		}
		
		public static void main (String arg[])
		
		
		{ ArrayList <Integer> A= new ArrayList<>();
		
		Combi R = new Combi();
		
		R.R(0,0, A);
			
		for (int k=0; k<=(R.B.size()-1); k++)
			
		{
			System.out.println(R.B.get(k));
			
		}
		}

	}