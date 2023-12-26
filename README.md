# Getting Started
GraphQL playground

http://localhost:8080/graphiql


# Using Postman
# Endpoint 1 : To get book details by Id

http://localhost:8080/graphql

{
"query": "query { bookById(id: \"1\") { id, title, author } }"
}


# Endpoint 2 : To create book

http://localhost:8080/graphql

{
"query": "mutation SaveBook($input: BookInput!) { saveBook(input: $input) { id, title, author } }",
"variables": {
"input": {
"title": "New Book",
"author": "New Author"
}
}
}