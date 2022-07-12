;; Exercise 2.40
;; Page 169

;; Define a procedure unique-pairs that, given
;; an integer n, generates the sequence of pairs (i, j) with 1 ≤
;; j < i ≤ n. Use unique-pairs to simplify the definition of
;; prime-sum-pairs given above.

(defn unique-pairs
    [n]
    (mapcat #(n-pairs %) (range 2 (inc n))))


(defn n-pairs
    [n]
    (map #(list n %) (range 1 n)))