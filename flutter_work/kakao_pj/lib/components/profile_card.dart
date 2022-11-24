import 'package:flutter/material.dart';

import '../models/User.dart';
import '../screens/profile_sreen.dart';

class ProfileCard extends StatelessWidget {
  const ProfileCard({Key? key, required this.user}) : super(key: key);
  final User user;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 8.0),
      child: InkWell(
        onTap: () {
          Navigator.push(context,
              MaterialPageRoute(builder: (context) => ProfileScreen(user: user)));
        },
        child: ListTile(
          leading: CircleAvatar(
              radius: 20,
              backgroundImage: NetworkImage(
                user.backgroundImage,
              )),
          title: Text(
            user.name,
            style: const TextStyle(
              fontWeight: FontWeight.bold,
              fontSize: 16,
            ),
          ),
          subtitle: Text(
            user.intro,
            style: const TextStyle(
              fontSize: 12,
            ),
          ),
          contentPadding: const EdgeInsets.all(0),
        ),
      ),
    );
  }
}
