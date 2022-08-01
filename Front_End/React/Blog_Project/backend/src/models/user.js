import mongoose, { Schema } from 'mongoose';
import bcrypt from 'bcrypt';
import jwt from 'jsonwebtoken';

const UserSchema = new Schema({
  userid: String,
  usernickname: String,
  hashedPassword: String,
});

//param으로 받은 pw가 해당 계정의 pw와 일치하는지 검증
UserSchema.methods.setPassword = async function (password) {
  const hash = await bcrypt.hash(password, 10);
  this.hashedPassword = hash;
};

UserSchema.methods.checkPassword = async function (password) {
  const result = await bcrypt.compare(password, this.hashedPassword);
  return result; // true / false
};

//userid로 데이터 찾기
UserSchema.statics.findByUsername = function (userid) {
  return this.findOne({ userid });
};

//응답할 데이터에서 hashedPassword필드가
//응답하지 않도록 JSON 변환 후 제거
UserSchema.methods.serialize = function () {
  const data = this.toJSON();
  delete data.hashedPassword;
  return data;
};

UserSchema.methods.generateToken = function () {
  const token = jwt.sign(
    {
      _id: this.id,
      userid: this.userid,
    },
    process.env.JWT_SECRET,
    {
      expiresIn: '7d',
    },
  );
  return token;
};

const User = mongoose.model('User', UserSchema);
export default User;
