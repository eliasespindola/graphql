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
```
query categoryById {
  categoryById(id: 1){
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

- Mutation
- Create Category
```
mutation {
  createCategory(input: {
    name: "Programação",
    description: "Cursos de programação"
  }) {
    id
    name
    description
  }
}
```
- Create course
```
mutation {
  createCourse(input: {
    name: "Programação",
    description: "Cursos de programação",
    categoryId: 1
  }) {
    id
    name
    description
    category{
        name
        description
    }
  }
}
```

- Artigo
- https://jskim1991.medium.com/spring-boot-graphql-with-spring-boot-using-graphql-spring-boot-starter-f4592e551f61