/* eslint-disable react/prop-types */
import React, { Component } from "react";
import ManagerList from "./../../components/User/ManagerList";
import ManagerListUser from "./../../components/User/ManagerListUser";
import { connect } from "react-redux";
class AdminPage extends Component {
  render() {
    let { users } = this.props;

    return (
      <div className="container">
        <div className="row">
          <div className="col-xs-12 col-sm-12 col-md-12 col-lg-12" />
          <button type="button" className="btn btn-info userColor">
            Create user
          </button>
          <h4 className="mt-30">
            <b>Users({users.length})</b>
          </h4>

          {/* test user list */}

          <ManagerList>{this.showListUser(users)}</ManagerList>
        </div>
      </div>
    );
  }

  showListUser(users) {
    let result = null;
    if (users.length > 0) {
      result = users.map((user, index) => {
        return <ManagerListUser key={index} user={user} index={index} />;
      });
    }
    return result;
  }
}

const mapStateToProps = state => {
  return {
    users: state.users
  };
};

export default connect(
  mapStateToProps,
  null
)(AdminPage);
