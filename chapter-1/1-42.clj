;; Exercise 1-42
;; Page 103

;; Create a function "compose" that takes two functions:
;; "f" and "g".  Returns a function that calls "f" on
;; the result of "g".  "f" and "g" must take one arguement.
;; Works like the built in "comp" function.
(defn compose
    [f g]
    #(f (g %)))

(defn square
    [x]
    (* x x))

;; Test compose. Outputs 49 = (6 + 1)^2
((compose square inc) 6)