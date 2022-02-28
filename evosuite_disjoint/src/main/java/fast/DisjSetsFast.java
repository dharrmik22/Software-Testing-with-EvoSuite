package fast;

// DisjSetsFast class
//
// CONSTRUCTION: with int representing initial number of sets
//
// ******************PUBLIC OPERATIONS*********************
// void union( root1, root2 ) --> Merge two sets
// int find( x )              --> Return set containing x
// ******************ERRORS********************************
// No error checking is performed

/**
 * Disjoint set class, using union by rank
 * and path compression.
 * Elements in the set are numbered starting at 0.
 * @author Mark Allen Weiss
 */
public class DisjSetsFast
{

    //@ invariant "s!=null && goodValues() && acyclic();

    /**
     * Construct the disjoint sets object.
     * @param numElements the initial number of disjoint sets.
     */
    public DisjSetsFast( int numElements )
    {
        s = new int [ numElements ];
        for( int i = 0; i < s.length; i++ )
            s[ i ] = -1;
    }

    /**
     * Union two disjoint sets using the height heuristic.
     * For simplicity, we assume root1 and root2 are distinct
     * and represent set names.
     * @param root1 the root of set 1.
     * @param root2 the root of set 2.
     */
    //@ requires root1 >= 0 && root1 < s.length && root2 >=0 && root2 < s.length && root1 != root2 && s[root1] < 0 && s[root2] < 0;
    //@ ensures find(root1)==find(root2);
    public void union( int root1, int root2 )
    {
        if( s[ root2 ] < s[ root1 ] )  // root2 is deeper
            s[ root1 ] = root2;        // Make root2 new root
        else
        {
            if( s[ root1 ] == s[ root2 ] )
                s[ root1 ]--;          // Update height if same
            s[ root2 ] = root1;        // Make root1 new root
        }
    }
    boolean goodValues() {
        boolean hasRoot = false;
        for (int i = 0; i < s.length; i++) {
            if (s[i] < 0 && s[i]>= 0-s.length) {
                hasRoot = true;
            } else if (!((s[i] >= 0 && s[i] < s.length))) {
                return false;
            }
        }
        return hasRoot;
    }

    boolean acyclic() {
        boolean[] visited = new boolean[s.length];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        int[] parents = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            if (!visited[i]) {
                int numParents = 0;
                int currentIndex = i;
                while (s[currentIndex] >=0) {
                    for (int j = 0; j < numParents - 1; j++) {
                        if (parents[j] == s[currentIndex]) {
                            return false;
                        }
                    }
                    parents[numParents] = s[currentIndex];
                    numParents++;
                    visited[currentIndex] = true;
                    currentIndex = s[currentIndex];
                }
            }
        }
        return true;
    }

    /**
     * Perform a find with path compression.
     * Error checks omitted again for simplicity.
     * @param x the element being searched for.
     * @return the set containing x.
     */
    //@ requires x >= 0 && x < s.length;
    //@ ensures s[\result] < 0;
    public int Find(int x) {
        return find(x);
    }

    public int find( int x )
    {
        if( s[ x ] < 0 )
            return x;
        else
            return s[ x ] = find( s[ x ] );
    }

    private int [ ] s;


    // Test main; all finds on same output line should be identical
    public static void main( String [ ] args )
    {
        int NumElements = 128;
        int NumInSameSet = 16;

        DisjSetsFast ds = new DisjSetsFast( NumElements );
        int set1, set2;

        for( int k = 1; k < NumInSameSet; k *= 2 )
        {
            for( int j = 0; j + k < NumElements; j += 2 * k )
            {
                set1 = ds.find( j );
                set2 = ds.find( j + k );
                ds.union( set1, set2 );
            }
        }

        for( int i = 0; i < NumElements; i++ )
        {
            System.out.print( ds.find( i )+ "*" );
            if( i % NumInSameSet == NumInSameSet - 1 )
                System.out.println( );
        }
        System.out.println( );
    }
}
