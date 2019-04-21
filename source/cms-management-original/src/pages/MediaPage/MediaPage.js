import React, { Component } from "react";
class MediaPage extends Component {
  render() {
    return (
      <div className="wrapper">


      <nav  id="sidebar">
          <div className="sidebar-header">
              <h3>Media</h3>
          </div>

          <ul className="list-unstyled components">      
              <li>   
                <p  href="#homeSubmenu0" data-toggle="collapse" aria-expanded="false" className="dropdown-toggle"> <i class="fa fa-location-arrow arrow" aria-hidden="true"></i><i class="fa fa-folder-open-o folder" aria-hidden="true"></i>Design</p>
                  <ul className="collapse list-unstyled" id="homeSubmenu0">
                      <li>
                          <p>Home 1</p>
                      </li>
                      
                  </ul>
              </li>

              <li>
              <p href="#homeSubmenu1" data-toggle="collapse" aria-expanded="false" className="dropdown-toggle"><i class="fa fa-location-arrow arrow" aria-hidden="true"></i><i class="fa fa-folder-open-o folder" aria-hidden="true"></i>People</p> 
              
              <ul className="collapse list-unstyled" id="homeSubmenu1">
                      <li>
                          <p>Home 1</p>
                      </li>
                      
                  </ul>
              </li>
              <li>
                  <p href="#homeSubmenu2" data-toggle="collapse" aria-expanded="false" className="dropdown-toggle"><i class="fa fa-location-arrow arrow" aria-hidden="true"></i><i class="fa fa-folder-open-o folder" aria-hidden="true"></i>Products</p>
                  <ul className="collapse list-unstyled" id="homeSubmenu1">
                      <li>
                          <p>Home 1</p>
                      </li>
                      
                  </ul>
              </li>
              
              <li>
                  <p><i class="fa fa-trash" aria-hidden="true"></i>Recycle Bin</p>
              </li>
          </ul>
      </nav>




      <div id = "content" >
        <div className="row">
          <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12" />
          <button type="button" className="btn btn-info userColor">
            <p>Create</p><i class="fa fa-sort-desc" aria-hidden="true"></i>
          </button>
          
          <div className = "choose-file">
          <div className = "click-file">
          <p>Click here to choose files</p>
          </div>
          </div>

          
          <button className = "btn-products">
          <div className = "choose-productss">
          <p>Products</p></div>
          </button>

          <button className = "btn-products">
          <div className = "choose-productss">
          <p>People</p></div>
          </button>

          <button className = "btn-products-design">
          <div className = "choose-productss">
          <p>Design</p></div>
          </button>
         
        </div>
      </div>
 
      </div>
   
    );
  }
}

export default MediaPage;
