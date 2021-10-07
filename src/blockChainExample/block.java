package blockChainExample;

import java.util.Arrays;

public class block {
	
	
	private String[] transactions;
	private int blockHash;
	private int previousBlockHash;
	
	
	@Override
	public String toString() {
		return "block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
				+ ", previousBlockHash=" + previousBlockHash + "]";
		
	}
	public block(String[] transactions, int previousBlockHash) {
		super();
		this.transactions = transactions;
		this.previousBlockHash = previousBlockHash;
		this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(transactions) , this.previousBlockHash});
	}	
	public String[] getTransactions() {
		return transactions;
	}
	public void setTransactions(String[] transactions) {
		this.transactions = transactions;
	}
	public int getBlockHash() {
		return blockHash;
	}
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}
	
	

}
