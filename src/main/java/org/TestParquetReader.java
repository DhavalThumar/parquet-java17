import org.mule.extension.parquet.internal.ParquetOperations;

public class TestParquetReader {

    public static void main(String[] args) {

        // 🔴 Change this to your ZSTD parquet file path
        String parquetPath = "C:\\Users\\dthumar\\Desktop\\Spot Product Usage\\files\\input-file.parquet";

        ParquetOperations op = new ParquetOperations();

        String result = op.readParquet(parquetPath);

        System.out.println("==== OUTPUT ====");
        System.out.println(result);
    }
}
