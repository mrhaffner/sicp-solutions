;; Exercise 1-42
;; Page 103

(defn compose
    [f g]
    #(f (g %)))

(defn square
    [x]
    (* x x))

;; Test compose. Outputs 49 = (6 + 1)^2
((compose square inc) 6)