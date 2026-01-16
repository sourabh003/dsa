/**
 * using two pointers approach
 * @see {@link https://leetcode.com/problems/3sum/}
 */
function threeSum(nums: number[]): number[][] {
	var n = nums.length;
	// sorting the array
	nums.sort(function (a, b) {
		return a - b;
	});

	let triplets: number[][] = [];
	for (let a = 0; a < n - 2; a++) {
		if (a > 0 && nums[a] === nums[a - 1]) continue;
		if (nums[a] > 0) break;
		let b = a + 1,
			c = n - 1;

		while (b < c) {
			let sum = nums[a] + nums[b] + nums[c];

			if (sum === 0) {
				triplets.push([nums[a], nums[b], nums[c]]);
				b++;
				c--;
				while (b < c && nums[b] === nums[b - 1]) b++;
				while (b < c && nums[c] === nums[c + 1]) c--;
			} else if (sum < 0) {
				b++;
			} else {
				c--;
			}
		}
	}

	return triplets;
}
