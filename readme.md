- URL
  - http://localhost:8080/graphiql?path=/graphiql

- Queries
- Categories
```
query bookDetails {
  categories{
    id
    name
    description
  }
}
```
- Courses
```
query courseDetails {
  courses{
    id
    name
    description
    category{
        name
        description
        id
    }
  }
}
```

- Falta fazer
  -  Mutation
  -  Find By Id  
