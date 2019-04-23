


import React, { Component } from "react";

class Home extends Component {
  render() {
    return (
        <div id="content">
        <div className = "row save-publish">
          <div className = "save-publish-bottom">
          <div className = "col-md-6"></div>
          <div className = "col-md-2">
          
          <button class="btn btn-default btn-content-preview">Preview</button>
                    
          </div>
          <div className = "col-md-1">
          
          <button class="btn btn-default btn-content-save">Save</button>
          </div>
          <div className = "col-md-3">          
          <button className="btn btn-success btn-content-save-publish">Save and publish</button>
          </div>
          </div>
        </div>

        <div className="padding-header">
          <div className="choose-file-content">
            <div className="hero-content">
              <h4>Hero</h4>
            </div>
          </div>
          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Header</h4>
                <p>*</p>
                <h6>
                  This is the main headline for the hero area on the Homepage
                </h6>
              </div>
            </div>
            <div className="col-md-8">
              <input id="input" className="form-control" />
            </div>
          </div>
          <div className="row row-decription">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Decription</h4>
                <p>*</p>
              </div>
            </div>
            <div className="col-md-8">
              <textarea
                name=""
                id="input"
                class="form-control"
                rows="9"
                required="required"
              />
            </div>
          </div>
          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Call to Action Caption</h4>
                <p>*</p>
                <h6>The caption on the button</h6>
              </div>
            </div>
            <div className="col-md-8">
              <input id="input" className="form-control" />
            </div>
          </div>
          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Call to Action Link</h4>
                <p>*</p>
              </div>
            </div>

            <div className="col-md-6">
              <div className="action-link-product">
                <h5>
                  <i
                    class="fa home-content-icon fa-shopping-cart"
                    aria-hidden="true"
                  />
                  Products
                </h5>
              </div>
            </div>
            <div className="col-md-2">
              <div className="action-link-product">
                <h5>
                  <b>Remove</b>
                </h5>
              </div>
            </div>
          </div>
        </div>

        <div className="padding-content">
          <div className="choose-file-content">
            <div className="hero-content">
              <h4>Content</h4>
            </div>
          </div>
          <div className="full-width">
            <h4>Full width</h4>
            <div className="box-full-width">
              <div className="box-darsh">
                <h2>Content</h2>
                <h4>
                  I had the same challenge and I am hoping to discover a
                  better way of handling this issue in vscode.
                </h4>
                <p>
                  {" "}
                  noticed your suggested work-around has to be done each time
                  you open the react file with an extension of .js
                </p>

                <h1>Input html </h1>
                <h2>
                  This extension wraps prettydiff/esformatter to format your
                  javascript, JSX, typescript, TSX file.
                </h2>
                <h3>
                  "Yes, I thought she was a boy, too," Charlize recently told
                  The Daily Mail. "Until she looked at me when she was three
                  years old and said: 'I am not a boy!'" "So there you go! I
                  have two beautiful daughters who, just like any parent, I
                  want to protect and I want to see thrive," she continued.
                  "They were born who they are and exactly where in the world
                  both of them get to find themselves as they grow up, and who
                  they want to be, is not for me to decide."
                </h3>
              </div>
              <button class="btn btn-info btn-add-content">
                Add content
              </button>
            </div>
          </div>
        </div>

        <div className="padding-footer">
          <div className="choose-file-content">
            <div className="hero-content">
              <h4>Footer</h4>
            </div>
          </div>

          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Header</h4>
                <p>*</p>
                <h6>
                  This is the main headline for the hero area on the Homepage
                </h6>
              </div>
            </div>
            <div className="col-md-8">
              <input id="input" className="form-control" />
            </div>
          </div>
          <div className="row row-decription">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Decription</h4>
                <p>*</p>
              </div>
            </div>
            <div className="col-md-8">
              <textarea
                name=""
                id="input"
                class="form-control"
                rows="9"
                required="required"
              />
            </div>
          </div>
          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Call to Action Caption</h4>
                <p>*</p>
                <h6>The caption on the button</h6>
              </div>
            </div>
            <div className="col-md-8">
              <input id="input" className="form-control" />
            </div>
          </div>
          <div className="row row-header">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Call to Action Link</h4>
                <p>*</p>
              </div>
            </div>

            <div className="col-md-6">
              <div className="action-link-product">
                <h5>
                  <i
                    class="fa home-content-icon fa-book"
                    aria-hidden="true"
                  />
                  Products
                </h5>
              </div>
            </div>
            <div className="col-md-2">
              <div className="action-link-product">
                <h5>
                  <b>Remove</b>
                </h5>
              </div>
            </div>
          </div>
          <div className="row ">
            <div className="col-md-3 header-content">
              <div className="header-left-content">
                <h4>Address</h4>
                <p>*</p>
              </div>
            </div>
            <div className="col-md-8">
              <input id="input" className="form-control" />
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Home;