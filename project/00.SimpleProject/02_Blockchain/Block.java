package blockchain;

import java.security.MessageDigest;

public class Block {
	String data;
	String prev;
	String addr;
	int nonce;

	public Block(String data) {
		this.data = data;
		firstBlock(data);
	}
	
	public Block(String data,String prev) {
		this.data = data;
		this.prev=prev;
		findNonce();
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setNonce(int nonce) {
		this.nonce = nonce;
	}

	//첫번 째 블록 생성.
	public void firstBlock(String data) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(data.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1) hexString.append('0');
				hexString.append(hex);
			}
			setAddr(hexString.toString());
			System.out.println("첫번째 블록 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//nonce 값 구하기
	public void findNonce() {
		int num = 0;
		// 해시 앞부분 값이 00000일 경우만 통과
		while (true) {
			try {
				String base = data + "" + num;
				MessageDigest digest = MessageDigest.getInstance("SHA-256");
				byte[] hash = digest.digest(base.getBytes("UTF-8"));
				StringBuffer hexString = new StringBuffer();
				for (int i = 0; i < hash.length; i++) {
					String hex = Integer.toHexString(0xff & hash[i]);
					if(hex.length() == 1) hexString.append('0');
					hexString.append(hex);
				}
				String temphash=hexString.toString().substring(0,5);
				if (temphash.equals("00000")) {
					setAddr(hexString.toString());
					setNonce(num);
					System.out.println("블록 생성 완료");
					return;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			num++;
		}
	}
	
	@Override
	public String toString() {
		return "Block 정보 \n "
				+ "nonce : " + nonce + 
				"\n data : " + data + 
				"\n prevhash : " + prev + 
				"\n hash : " + addr ;
	}

}
