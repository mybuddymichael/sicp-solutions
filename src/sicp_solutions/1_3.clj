(ns sicp-solutions.1-3
  "Exercise 1.3. Define a procedure that takes three numbers as
   arguments and returns the sum of the squares of the two larger
   numbers.")

(defn square [x]
  (* x x))

(defn greater [x y]
  (if (> x y)
    x
    y))

(defn sum-of-squares [x y z]
  (if (> x y)
    (+ (square x) (square (greater y z)))
    (+ (square y) (square (greater x z)))))
