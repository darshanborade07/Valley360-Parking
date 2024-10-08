import React from 'react';
import {FaFacebookF, FaTwitter, FaInstagram, FaWhatsapp} from "react-icons/fa";
import { LuParkingCircle } from "react-icons/lu";
import {motion} from "framer-motion";

const Footer = () => {
  return (
    <footer className='bg-primary/10 py-12'>
      <motion.div
       initial={{opacity: 0}}
       whileInView={{opacity: 1}}
       transition={{duration: 1, delay: 0.2}}
       className='container flex justify-between items-center'>
    {/* Logo section */}
    <div className='text-2xl flex items-center gap-2 font-bold uppercase'>
        <p className="text-primary">Valley<span className='text-secondary'>360</span></p>
        <p className="text-primary">Parking</p>
       
        <LuParkingCircle className='text-green-700'/>
        </div>
    {/* Social media icons */}
    <div className='text-3xl flex items-center gap-4 mt-6 text-gray-700'>
        <FaInstagram/>
        <FaFacebookF/>
        <FaWhatsapp/>
        <FaTwitter/>
    </div>
      </motion.div>

      
    </footer>
  )
}

export default Footer
