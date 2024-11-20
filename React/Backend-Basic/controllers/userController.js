const myUser = require('../models/userModel');

//Others logics

const getUser = async (req, res) => {
    try {
        const allUser = await myUser.find();
        if (!allUser || allUser.length === 0) {
            return res.status(404).json({ success: false, message: 'User not found' });
        }
        res.status(200).json({
            success: true,
            data: allUser
        });
    } catch (err) {
        res.status(500).json({ success: false, message: err.message });
    }
}

module.exports = getUser;