package learningjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CandidateMain {

	private Map<String, Double> candidateMap;

	public Map<String, Double> getCandidateMap() {
		return candidateMap;
	}

	public void setCandidateMap(Map<String, Double> candidateMap) {
		this.candidateMap = candidateMap;
	}

	public double findCandidateMark(String search) {
		// Fill the code
		return 0;

	}

	public int findCountOfCandidatesShortlisted() {
		// Fill the code
		return 0;

	}

	private List<String> findCandidatesShortlistedForFinalINterview() {
		// Fill the code
		return null;

	}

	public static void main(String[] args) {

		CandidateMain candidate = new CandidateMain();
		List<String> list1 = new ArrayList<>();
		Map<String, Double> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of records to be added : ");
		int num = sc.nextInt();
		System.out.println("Enter the candidates records (Candidate ID : Marks Scored) : ");
		String[] canDetails = new String[n];
		for (int i = 0; i < n; i++) {
			canDetails[i] = sc.next();
		}
		for (int i = 0; i < canDetails.length; i++) {
			String[] a = canDetails[i].split(":");
			map.put(a[0], Double.parseDouble(a[1]));
			candidate.setCandidateMap(map);
		}
		System.out.println("Enter the candidate ID to be searched : ");
		String search = sc.next();
		if (map.containsKey(search)) {
			double mark = map.get(search);
			
			System.out.println(mark);
		} else {
			System.out.println("-1");
		}
		Collection<Double> values = map.values();
		List <Double> list2 = new ArrayList <> (values);
		for (int j=0; j<list2.size(); j++) {
			if (list2[j]>=70.0d) {
				
			}

//		Collection<Double> values = map.values();
//		List<Double> list2 = new ArrayList<>(values);
//		Object[] array1 = values.toArray();
//		for (int j = 0; j <= num; j++) {
//			System.out.println(array1[j]);
//
//		}
		
	}
//		System.out.println("Number of candidates short listed for further interview process : ");

}
