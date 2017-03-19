package tools;

public class DirectionVector {
	
	public static final int[] dx2Straight = { 1, -1, 0, 0 };
	public static final int[] dy2Straight = { 0, 0, 1, -1 };
	
	public static final int[] dx2Cross = { 1, 0, -1, 0 };
	public static final int[] dy2Cross = { 0, 1, 0, -1 };

	public static final int[] dx3Straight = { 1, -1, 0, 0, 0, 0 };
	public static final int[] dy3Straight = { 0, 0, 1, -1, 0, 0 };
	public static final int[] dz3Straight = { 0, 0, 0, 0, 1, -1 };
	
	public static final int[] dx3Cross = { 1, 0, 0, -1, 0, 0 };
	public static final int[] dy3Cross = { 0, 1, 0, 0, -1, 0 };
	public static final int[] dz3Cross = { 0, 0, 1, 0, 0, -1 };

	public static final int[] dx4Straight = { 1, -1, 0, 0, 0, 0, 0, 0 };
	public static final int[] dy4Straight = { 0, 0, 1, -1, 0, 0, 0, 0 };
	public static final int[] dz4Straight = { 0, 0, 0, 0, 1, -1, 0, 0 };
	public static final int[] da4Straight = { 0, 0, 0, 0, 0, 0, 1, -1 };
	
	public static final int[] dx4Cross = { 1, 0, 0, 0, -1, 0, 0, 0 };
	public static final int[] dy4Cross = { 0, 1, 0, 0, 0, -1, 0, 0 };
	public static final int[] dz4Cross = { 0, 0, 1, 0, 0, 0, -1, 0 };
	public static final int[] da4Cross = { 0, 0, 0, 1, 0, 0, 0, -1 };

}
