package com.mypack.repository;

import org.springframework.data.repository.CrudRepository;  
import com.mypack.model.Books;  
//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{  
}  