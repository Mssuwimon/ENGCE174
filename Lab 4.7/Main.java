import java.util.Scanner;

class Resource {

    private String id;

    // Constructor
    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    // Overridden finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Must print "Resource [id] finalized (destroyed)."
            System.out.println("Resource " + id + " finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            
            // Read 3 resource IDs
            String id1 = scanner.nextLine().trim();
            String id2 = scanner.nextLine().trim();
            String id3 = scanner.nextLine().trim();
            
            // 1. Create three Resource objects
            Resource r1 = new Resource(id1);
            Resource r2 = new Resource(id2);
            Resource r3 = new Resource(id3);

            // 2. Set r1 and r2 to null (Eligible for GC)
            r1 = null;
            r2 = null;

            // 3. Request GC to run AND force finalizers to run on eligible objects
            System.gc(); 
            // *** FIX: Added runFinalization() to force the program to wait for finalization. ***
            System.runFinalization(); 
            
            // 4. Set r3 to null
            r3 = null;
            
            // 5. Request GC to run again
            System.gc();
            System.runFinalization(); 

        } catch (Exception e) {
            // Error handling block
        }
    }
}