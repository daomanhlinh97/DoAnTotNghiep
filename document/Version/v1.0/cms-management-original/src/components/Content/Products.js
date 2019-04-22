import React, { Component } from "react";

class Products extends Component {
  render() {
    return (
      <div className="container-fluid">
        <div class="row">{this.props.children}</div>
      </div>
    );
  }
}

export default Products;
