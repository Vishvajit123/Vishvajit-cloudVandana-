function reverseWords(sentence) {
    let words = sentence.split(" ");
    let reversedWords = words.map(word => word.split("").reverse().join(""));
    let reversedSentence = reversedWords.join(" ");
    return reversedSentence;
  }
  
  let sentence = "This is a sunny day";
  let reversedSentence = reverseWords(sentence);
  console.log(reversedSentence);
  