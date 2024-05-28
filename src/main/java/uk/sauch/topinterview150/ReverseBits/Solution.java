package uk.sauch.topinterview150.ReverseBits;

public class Solution {
    public int reverseBits(int n) {
        final var binaryString = Integer.toBinaryString(n);
        final var offset = 32 - binaryString.length();
        final var sb = new StringBuilder();

        sb.append("0".repeat(offset));
        sb.append(binaryString);

        return Integer.parseUnsignedInt(sb.reverse().toString(), 2);
    }
}
