import 'package:flutter/material.dart';

import 'fast_first_song_card.dart';


class FastFirstSportsSongList extends StatelessWidget {
   FastFirstSportsSongList({Key? key, required this.album}) : super(key: key);

  var album;

  @override
  Widget build(BuildContext context) {
    return Container(
      height: 310,
      width: 380,
      child: Column(
        children: List.generate(
          4,
          (index) => FastFirstSongCard(album: album[index]),
        ),
      ),
    );
  }
}
