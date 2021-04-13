package dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;



import java.util.List;

import entity.ProductEntity;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface ProductDao {

    @Insert(onConflict = REPLACE)
    void insertProduct(ProductEntity product);

    @Update
    void updateUser(ProductEntity product);

    @Delete
    void deleteUser(ProductEntity product);

    @Query("select * from Product")
    List<ProductEntity> getAllProduct();

}
