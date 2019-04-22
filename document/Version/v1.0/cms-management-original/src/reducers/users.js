var initUser = [
  {
    id: "1",
    name: "Le Phuc Lam",
    age: "18",
    role: "administrantors",
    date: "March 3, 2019 7:06 AM",
    action: "actived"
  },
  {
    id: "2",
    name: "Nguyen Anh",
    age: "18",
    role: "staff",
    date: "March 21, 2019 6:06 PM",
    action: "actived"
  },
  {
    id: "3",
    name: "Truong Thuy Son",
    age: "18",
    role: "staff",
    date: "March 21, 2019 6:06 PM",
    action: "actived"
  },
  {
    id: "4",
    name: "Hoang Binh Chi",
    age: "18",
    role: "staff",
    date: "March 21, 2019 6:06 PM",
    action: "actived"
  },
  {
    id: "2",
    name: "Vuong Gia Luong",
    age: "18",
    role: "staff",
    date: "March 21, 2019 6:06 PM",
    action: "actived"
  }
];

const users = (state = initUser, action) => {
  switch (action.type) {
    default:
      return [...state];
  }
};

export default users;
