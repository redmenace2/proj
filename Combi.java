
public class Combi {

		int [] ns  = {1,2,3,4,5};
		ArrayList<ArrayList<Integer>> B = new ArrayList<>();
		ArrayList  <Integer> A = new ArrayList<>();

		void R (int r, int n, ArrayList <Integer>C )
		{for (int i=1; i<= ns.length; i++)	
			{ 	
			C.add(i);
			if (C.size()<ns.length) {R (r,r,C);}
			if (C.size() == ns.length) {B.add((ArrayList<Integer>) C.clone());}
			C.remove(C.size()-1);
			}
		}
		}
		
