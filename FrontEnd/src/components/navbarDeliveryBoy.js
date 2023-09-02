import React from "react";
import { Link } from "react-router-dom";

const NavbarDeliveryBoy = () => {
  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-dark shadow-sm">
      <div className="container-fluid">
        <a className="navbar-brand" href="/deliveryBoyHome">
          <b style={{ color: "#F7BC0F", fontSize: 30 }}>Pizza Hut</b>
        </a>
        <button
          type="button"
          data-toggle="collapse"
          data-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
          className="navbar-toggler"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav ml-auto">
            <li className="nav-item active">
              <a href="/acceptedOrder" className="nav-link active">
                My Orders
              </a>
            </li>
            <li className="nav-item">
              <a href="/contactUs" className="nav-link">
                Contact Us
              </a>
            </li>
            <div className="mybtn-right" style={{ marginLeft: 700 }}>
              <Link
                className="nav-link btn btn-danger"
                style={{ backgroundColor: "#5C41A8" }}
                to="/signin"
              >
                Logout
              </Link>
            </div>
          </ul>
        </div>
      </div>
    </nav>
  );
};

export default NavbarDeliveryBoy;
