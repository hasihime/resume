package blockchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import blockchain.Block;
public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Block>blockchain=new ArrayList<Block>();
		String data[]=input();
		makeblock(data,blockchain);
		ouput(blockchain);
	}

	private static void ouput(ArrayList<Block> blockchain) {
		int idx=1;
		for (Block block : blockchain) {
			System.out.println(idx+" 번째 "+block.toString());
			idx++;
		}
	}

	private static String[] input() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("생성 블록 개수는 ? : ");
		int n = Integer.parseInt(br.readLine());
		String[] data=new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println((i+1)+"번째 데이터 입력");
			data[i]=br.readLine();
		}
		return data;
	}

	private static void makeblock(String[] data, ArrayList<Block> blockchain) {
		for (int i = 0; i < data.length; i++) {
			if (i==0) {
				Block first=new Block(data[i]);
				blockchain.add(first);
			}else {
				System.out.println((i+1)+"번째 블록 생성 중.....");
				Block block=new Block(data[i], blockchain.get(i-1).addr);
				blockchain.add(block);
				System.out.println((i+1)+"번째 블록 생성 완료");
			}
		}
	}
}
