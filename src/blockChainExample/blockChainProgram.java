package blockChainExample;

import java.util.*;

public class blockChainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstate a hash function
		
		String statement1 = "My World is nearly perfect.";
		int hashvalue = statement1.hashCode();
		
		System.out.println("Statement = " + statement1 + "whose hash value = " + hashvalue);
		
		//hash an array
		
		String[] list1 = {"alex", "becky", "cyril"};
		String[] list2 = {"alex", "becky", "cyril"};

		
		
		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
		
		
		System.out.println("hash1 = " + hash1 + " hash2 " + hash2);
		
		
		
		//demonstrate a series of blocks in a chain
		ArrayList<block> blockChain = new ArrayList<block>();
		
		String[] initialValues = {"Shad has 700$", "Miguel has 550$"};
		block firstBlock = new block(initialValues, 0);
		blockChain.add(firstBlock);

		System.out.println("First block is " + firstBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		// ockHash=-2096314158
		
		
		 //block 2
		String[] shadGivesItAway = {"Shad gives Tim 40$", "Shad gives tanya 60$"};
		block secondBlock = new block(shadGivesItAway, firstBlock.getBlockHash());
		blockChain.add(firstBlock);
		
		System.out.println("Second block is " + secondBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		//blockHash=-1796429409
		
		
		
		 //block 3
		String[] shadGetsSomeBack = {"Tim gives shad 10$", "Terry gives 60$ to Shad"};
		block thirdBlock = new block(shadGetsSomeBack, secondBlock.getBlockHash());
		blockChain.add(thirdBlock);
		
		System.out.println("Third block is " + thirdBlock.toString());
		System.out.println("The block chain is " + blockChain.toString());
		// blockHash=165552881
		
 		
	}

}
