import React from 'react'
class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  async loadPosts() {
     const api="https://jsonplaceholder.typicode.com/posts";
     const response = await fetch(api);
     const data = await response.json();
     this.setState({ posts: data });
     console.log("Post", data);
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <p>Id:{post.id}</p>
            <p>userId: {post.userId}</p>
            <h3>Title: {post.title}</h3>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
    componentDidCatch(error, info) {
    console.log("Error:", error, info);
    alert("Something went wrong");
  }
}

export default Posts;
