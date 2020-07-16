import React from 'react';
import { Link } from 'react-router-dom'

const Navbar = () => {


  return (


    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <a className="navbar-brand" href="#">Demo Cart</a>
      <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
        <span className="navbar-toggler-icon"></span>
      </button>
      <div className="collapse navbar-collapse" id="navbarText">
        <ul className="navbar-nav mr-auto">
          <li className="nav-item active">
            <Link to="/" className="nav-link" href="#">Home</Link>
          </li>
          <li className="nav-item">
            {/* <Link to="/MyOrders" className="nav-link" href="#">My Orders</Link> */}
          </li>
          <li className="nav-item">
            <Link to="/cart" className="nav-link" href="#">Cart</Link>
          </li>
        </ul>
        <span className="navbar-text">
         Example React Js cart
    </span>
      </div>
    </nav>
  )

}

export default Navbar;