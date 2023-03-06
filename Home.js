import React from 'react'
import { Link } from "react-router-dom";

function Home() {
  return (
    <div>

            <li>
                <Link to="/get">Get</Link>
            </li>
            <li>
                <Link to="/post">Post</Link>
            </li>




    </div>
  )
}

export default Home