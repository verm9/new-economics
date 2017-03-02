/** 
* Summary:
* The script will save difficulties of chosen blocks to a file called eth-difficulties.json 
* (which will be placed in current directory).
* Check if you have loaded the blockchain, if did't you can not access all the blocks.
*
* How to use:
* 1. Install node.js.
* 2. geth -rpc
* 3. Specify vars start, end and blcoksStep below.
* 4. node getDifficulties.js
*/

var start = 800000;
var end = 799000;
var blocksStep = 60;

var Web3 = require('web3');
var web3 = new Web3();
web3.setProvider(new web3.providers.HttpProvider());

var entries = [];
var j = 0;

for (i = start; i > end; i -= blocksStep) {
	console.log("processing block" + i);
	var b = web3.eth.getBlock(i);
	var entry = {
		blockNumber:i,
		difficulty:b.difficulty,
		timestamp:b.timestamp
	};
	entries[j++] = entry;
}

var fs = require('fs');
fs.writeFileSync("eth-difficulties.json", JSON.stringify(entries));    

console.log("Check eth-difficulties.json file");